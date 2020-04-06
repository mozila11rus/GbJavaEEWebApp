package ru.geekbrains.aleksey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(ProductServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("New GET request");
        resp.getWriter().println("<h1>Продукты</h1>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        logger.info("New POST request");

    }
}
