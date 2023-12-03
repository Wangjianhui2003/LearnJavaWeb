import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Filter_CountTime implements Filter {
    SimpleDateFormat dataformat =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //convert
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        //print log
        String requestURI = req.getRequestURI();
        String datatime = dataformat.format(new Date());
        System.out.println(requestURI + " was request in " + datatime);

        //filter
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);

        //print log2
        long end = System.currentTimeMillis();
        System.out.println(requestURI + " in " + datatime + " spent: " + (end - start) + "ms");



    }
}

