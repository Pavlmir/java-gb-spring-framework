package ru.gb.web.application;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private String nameListProducts = "";

    public void init() {
        for (int i = 0; i < 10; i++) {
            String title = "продукт" + i;
            Product product = new Product(i, title, (float) (Math.random() * 3) + 1);
            nameListProducts = nameListProducts + "<br/>" + product.toString();
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + nameListProducts + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}