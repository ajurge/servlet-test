package com.springboot.servlettest;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;

@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean privateJersey(TestServlet testServlet) {
        ServletRegistrationBean privateJersey
                = new ServletRegistrationBean(new ServletContainer());
        privateJersey.setServlet(testServlet);
        privateJersey.addUrlMappings("/ADR/*");
        privateJersey.setName("TestServlet");
        privateJersey.setLoadOnStartup(1);
        return privateJersey;
    }

    @Bean
    public TestServlet testServlet(@Value("${testValue:#{null}}") String testValue){
        return new TestServlet(testValue);
    }

    public class TestServlet extends HttpServlet{
        private String value;

        public TestServlet() {
            System.out.println("Initialized value" + this.value);
        }


        public TestServlet(String value) {
            this.value = value;
            System.out.println("Initialized value" + this.value);
        }

        public String getValue() {
            return value;
        }
    }
}
