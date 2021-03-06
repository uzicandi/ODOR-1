package com.back.odor.common.utils.config;

import com.back.odor.common.etc.SecuredPropertySource;
import com.back.odor.common.filters.AuditingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class WebInitializer
            extends AbstractAnnotationConfigDispatcherServletInitializer
//        implements WebApplicationInitializer
{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                JavaConfig.class,
                SecurityConfig.class,
                DatabaseConfig.class,
                SecuredPropertySource.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebMvcConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }

    /* 아래와 같이 설정도 가능
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//        XmlWebApplicationContext xmlWebApplicationContext = new XmlWebApplicationContext();
//        xmlWebApplicationContext.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");

        AnnotationConfigWebApplicationContext javaConfigContext = new AnnotationConfigWebApplicationContext();
        javaConfigContext.register(DispatcherConfig.class);
//        javaConfigContext.setConfigLocation("com.back.odor.common.utils.config");

        servletContext.addListener(new ContextLoaderListener(javaConfigContext));

        ServletRegistration.Dynamic dispatcher = servletContext
                .addServlet("dispatcher", new DispatcherServlet(javaConfigContext));

        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
    */

}
