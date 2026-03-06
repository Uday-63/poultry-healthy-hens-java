package com.poultry;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FarmServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h2>Welcome to Healthy Hens Poultry Farm</h2>");
        out.println("<p>Farm Location: Andhra Pradesh</p>");
        out.println("<p>Contact: 9876543210</p>");
    }
}
