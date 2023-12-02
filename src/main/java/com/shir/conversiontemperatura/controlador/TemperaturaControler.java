package com.shir.conversiontemperatura.controlador;

import com.shir.conversiontemperatura.model.Conversion;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/temperatura")
public class TemperaturaControler extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // resp.setContentType("text/html;charset=UTF-8");
        String url = "/index.html";

        String action = req.getParameter("action");
        if (action == null) {
            action = "registrar";
        }

        if (action.equals("registrar")) {
            url = "/index.jsp";
        } else if (action.equals("convertir")) {
            double celsius = Double.parseDouble((req.getParameter("celsius")));

            Conversion c = new Conversion(celsius, 0.0);
            req.setAttribute("c", c);
            url = "/Result.jsp";
        }

        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    public void destroy() {
    }
}
