package ru.geekbrains.aleksey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.Serializable;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet implements Servlet, Serializable {
    private Logger logger = LoggerFactory.getLogger(MainServlet.class);
    private transient ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("New request");

        servletResponse.getWriter().println("<h1>Продукты</h1>");
    }

    @Override
    public String getServletInfo() {
        return "Hello from ProductServlet";
    }

    @Override
    public void destroy() {
        logger.info("ProductServlet class destroy");
    }
}
