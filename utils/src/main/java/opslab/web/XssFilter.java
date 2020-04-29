package opslab.web;


import opslab.util.JacksonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Description:
 * @Author lyh-god
 * @Date 2020/4/29
 **/
public class XssFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(XssFilter.class);
    private boolean ISDEBUG = false;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ISDEBUG = Boolean.valueOf(filterConfig.getInitParameter("debug"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException,
            ServletException {
        if (ISDEBUG) {
            logger.debug("before xss filter paramter:" + JacksonUtil.toJson(request.getParameterMap()));
        }
        XssHttpServletRequestWrapper wrapper = new XssHttpServletRequestWrapper((HttpServletRequest) request);
        if (ISDEBUG) {
            logger.debug("after xss filter paramter:"+ JacksonUtil.toJson(wrapper.getParameterMap()));

        }
        filterChain.doFilter(wrapper, response);

    }

    @Override
    public void destroy() {

    }
}
