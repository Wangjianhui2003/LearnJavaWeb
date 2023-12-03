import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//Get context path
@WebServlet("/getpath")
public class GetPath extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        String web_xml_path = servletContext.getRealPath("/WEB-INF/web.xml");

        String contextPath = servletContext.getContextPath();

        System.out.println(web_xml_path);
        System.out.println(contextPath);
    }
}
