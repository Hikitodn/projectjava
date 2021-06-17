package controller;

import module.dao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "SigninController", value = "/SigninController")
public class SigninController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        dao dao = new dao();

        try {
            Statement statement = dao.getConnection().createStatement();
            statement.execute("INSERT INTO account VALUES ('" + request.getParameter("username") + "','" + request.getParameter("password") + "');");
            response.sendRedirect("Login.jsp");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
