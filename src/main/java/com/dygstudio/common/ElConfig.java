package com.dygstudio.common;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @author: diyaguang
 * @date: 2017/12/25 下午5:18
 * @description: com.dygstudio.common
 */
@PropertySource("classpath:com/dygstudio/common/test.properties")
public class ElConfig {

    @Value("I Love you!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{ T(java.lang.Math).random()*100.0}")
    private double randomNumber;

    @Value("#{demoMethodService.another}")
    private String fromAnother;

    @Value("classpath:com/dygstudio/common/test.txt")
    private Resource testFile;

    @Value("${book.name}")
    private Resource testUrl;

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(environment.getProperty("book.author"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
