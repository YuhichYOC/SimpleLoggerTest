package com.yoclabo.webenter;

import com.yoclabo.logging.SessionLogger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class WatchDog implements Filter {

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        SessionLogger l = new SessionLogger();
        l.info("WatchDog : " + ((HttpServletRequest) req).getRequestURI());
        chain.doFilter(req, res);
    }
}
