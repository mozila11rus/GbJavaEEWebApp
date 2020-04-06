package ru.geekbrains.aleksey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CatalogServlet", urlPatterns = "/catalog")
public class CatalogServlet extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(CatalogServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("New GET request");
        resp.getWriter().println("<h1>Каталог</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        logger.info("New POST request");
    }

}
