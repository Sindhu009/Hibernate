package com.xworkx.servlets;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.userdao.Userdao;
import com.xworkz.userdto.Userdto;


@WebServlet("/Register")

public class UserController extends HttpServlet {
	
	  //  private static final long serialVersionUID = 1 L;
	    private Userdao userdao;

	    public void init() {
	        userdao = new Userdao() {
				
				@Override
				public void saveUser(Userdto user) {
					// TODO Auto-generated method stub
					
				}
			};
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	        register(request, response);
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	        response.sendRedirect("Register.html");
	    }

	    private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	        String firstName = request.getParameter("firstName");
	        String lastName = request.getParameter("lastName");
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");

	        Userdto user = new Userdto();
	        user.setFirstName(firstName);
	        user.setLastName(lastName);
	        user.setUsername(username);
	        user.setPassword(password);

	        userdao.saveUser(user);

	        RequestDispatcher dispatcher = request.getRequestDispatcher("Register-Success.html");
	        dispatcher.forward(request, response);
	    }


}
