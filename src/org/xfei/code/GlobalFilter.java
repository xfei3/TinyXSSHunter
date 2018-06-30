package org.xfei.code;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class GlobalFilter
 */
@WebFilter("/*")
public class GlobalFilter implements Filter {

    /**
     * Default constructor. 
     */
    public GlobalFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	       ((HttpServletResponse)response).setHeader("Access-Control-Allow-Origin", "*");
	       ((HttpServletResponse)response).setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, TRACE");
	       ((HttpServletResponse)response).setHeader("Access-Control-Max-Age", "3600");
	       ((HttpServletResponse)response).setHeader("Access-Control-Allow-Headers", "X-Requested-With,User-Agent,Content-type");
		
	       chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
