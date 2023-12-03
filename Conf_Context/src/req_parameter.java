import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/form1")
public class req_parameter extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //name -> value
        String username = req.getParameter("username");
        System.out.println(username);
        String password = req.getParameter("password");
        System.out.println(password);
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));
        //names -> value
        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String parametername = parameterNames.nextElement();
            String[] parameterValues = req.getParameterValues(parametername);
            if (parameterValues.length > 1){
                System.out.println(parametername + "=" + Arrays.toString(parameterValues));
            }else{
                System.out.println(parametername + "=" + parameterValues[0]);
            }
        }
        //get map
        Map<String, String[]> parameterMap = req.getParameterMap();
    }
}
