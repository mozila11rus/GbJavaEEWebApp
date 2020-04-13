package ru.geekbrains.aleksey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.aleksey.persist.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@WebServlet(name = "CatalogServlet", urlPatterns = "/catalog")
public class CatalogServlet extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(CatalogServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        logger.info("New GET request");
        List<Product> products = new ArrayList<>();

//        products.add(new Product(1, "Product 1"));
//        products.add(new Product(2, "Product 2"));
//        products.add(new Product(3, "Product 3"));
//        products.add(new Product(4, "Product 4"));
//        products.add(new Product(5, "Product 5"));
//        products.add(new Product(6, "Product 6"));
//        products.add(new Product(7, "Product 7"));
//        products.add(new Product(8, "Product 8"));
//        products.add(new Product(9, "Product 9"));

        req.setAttribute("products", products);

        getServletContext().getRequestDispatcher("/catalog.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        logger.info("New POST request");
    }

}
