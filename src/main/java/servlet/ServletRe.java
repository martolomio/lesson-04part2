package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "servlet", value = "servlet.ServletRe")
public class ServletRe extends HttpServlet {
    private  static final long serialVersionUID =1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().append("Served at :").append(request.getContextPath());
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        System.out.println(email);

        //        UserService userService = UserService.getUserService();
        //        // in our app we use email as login
        //        User user = userService.getUser(login);
        //
        //        RequestDispatcher redirect;
        //
        //        if (user == null) {
        //            redirect = request.getRequestDispatcher("login.jsp");
        //            redirect.forward(request, response);
        //        } else {
        //            if (user.getPassword().equals(password)) {
        //                request.setAttribute("userEmail", login);
        //                redirect = request.getRequestDispatcher("cabinet.jsp");
        //                redirect.forward(request, response);
        //            } else {
        //                redirect = request.getRequestDispatcher("login.jsp");
        //                redirect.forward(request, response);
        //            }
        //        }
    }

}
