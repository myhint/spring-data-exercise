package com.blake.dev.springdataexercise.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Blake on 2018/10/5
 */
@Configuration
public class DruidDataSourceConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druidDataSource() {

        return new DruidDataSource();
    }

    /**
     * 配置Druid管理后台Servlet
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean statViewServlet() {

        /**
         *  from com.alibaba.druid.support.http.ResourceServlet.java
         *
         *     public static final String SESSION_USER_KEY    = "druid-user";
         *     public static final String PARAM_NAME_USERNAME = "loginUsername";
         *     public static final String PARAM_NAME_PASSWORD = "loginPassword";
         *     public static final String PARAM_NAME_ALLOW    = "allow";
         *     public static final String PARAM_NAME_DENY     = "deny";
         *     public static final String PARAM_REMOTE_ADDR   = "remoteAddress";
         */

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String, String> initParams = new HashMap<>();

        initParams.put("loginUsername", "admin");
        initParams.put("loginPassword", "123456");
        initParams.put("allow", "");//默认就是允许所有访问
        initParams.put("deny", "");

        servletRegistrationBean.setInitParameters(initParams);
        return servletRegistrationBean;
    }

    /**
     * 配置Druid管理后台Web监控的Filter
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());

        Map<String, String> initParams = new HashMap<>();
        initParams.put("exclusions", "*.js,*.css,/druid/*");

        filterRegistrationBean.setInitParameters(initParams);

        filterRegistrationBean.setUrlPatterns(Collections.singletonList("/*"));

        return filterRegistrationBean;
    }

}
