package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPrime", urlPatterns={"/ServletPrime"})
public class ServletPrime extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // get data from form
        String swordName = request.getParameter("swordName");
        String swordCulture = request.getParameter("swordCulture");
        String bladeShape = request.getParameter("bladeShape");
        String swordComments = request.getParameter("swordComments");

        // display on web page
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><link rel='stylesheet' href='formTable.css'></head><body>");
        out.println("<h1>You Input The Following:</h1>");
        out.println("<table>");
        out.println("<tbody>");
        out.println("<tr><th>Sword Name</th><td>" + swordName + "</td></tr>");
        out.println("<tr><th>Sword Culture</th><td>" + swordCulture + "</td></tr>");
        out.println("<tr><th>Blade Shape</th><td>" + bladeShape + "</td></tr>");
        out.println("<tr><th>Comments</th><td>" + swordComments + "</td></tr>");
        out.println("</tbody></table>");
        out.println("</body></html>");

        // write data to a cookie?

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // user should never see this
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("What are you doing here!?");
        response.sendRedirect("/ServletDemo_war_exploded/swordInput.html");
}
}
