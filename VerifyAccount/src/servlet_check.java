import com.sun.net.httpserver.HttpServer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/checkusername")
public class servlet_check extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get username
        String username = req.getParameter("username");
        String info = "<h1>Yes<h1>";
        if(!"wjh".equals(username)){
            info = "<h1>No<h1>";
        }
        //set content-type
        //or:resp.setContentType("text/html");
        resp.setHeader("Content-Type","text/html");

        //output result
        PrintWriter writer = resp.getWriter();
        writer.write(info);
    }

}
