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

@WebServlet(name = "OrderServlet", urlPatterns = "/order")
public class OrderServlet extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(OrderServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("New GET request");
        resp.getWriter().println("<h1>Оформление заказа</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        logger.info("New POST request");

    }
}