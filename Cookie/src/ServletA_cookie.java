import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/servletA")
public class ServletA_cookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookieA = new Cookie("servletA", "A");
        Cookie cookieB = new Cookie("servletB", "B");
        cookieA.setPath("/Cookie/servletA");
        cookieB.setPath("/Cookie/servletB");
        resp.addCookie(cookieA);
        resp.addCookie(cookieB);
    }
}
