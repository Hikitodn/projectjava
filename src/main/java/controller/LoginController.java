package controller;

import module.account;
import module.dao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        dao dao = new dao();
        dao.loadAccount();

        for(account a : dao.getListAccount()) {
            if(request.getParameter("username").equals(a.getUsername()) && request.getParameter("password").equals(a.getPassword())) {
                HttpSession session = request.getSession();

                session.setAttribute("username", a.getUsername());
                session.setAttribute("password",a.getPassword());

                request.getRequestDispatcher("home").forward(request,response);
                return;
            }
    }
        request.getRequestDispatcher("Login.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
    }
}
