package com.codeup.adlister.controllers;


import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/register.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String passwordConfirm = request.getParameter("confirm_password");

            boolean inputHasErrors = username.isEmpty()
                    && email.isEmpty()
                    && password.isEmpty();
            boolean passwordMatch = password.equals(passwordConfirm);
            boolean actuallyAnEmail = email.contains("@");

            if(inputHasErrors && passwordMatch && actuallyAnEmail){
                try {
                    response.sendRedirect("/register");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            }
        User userTest = DaoFactory.getUsersDao().findByUsername(username);
        if(userTest.getUsername() == username){
            try {
                response.sendRedirect("/register");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            User user = new User(username, email, password);
            DaoFactory.getUsersDao().insert(user);

            try {
                response.sendRedirect("/login");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
