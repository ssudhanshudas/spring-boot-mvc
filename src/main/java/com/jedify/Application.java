package com.jedify;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by j1013575 on 10/31/2015.
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "com.jedify")
@EnableWebMvc
public class Application {
    public static void main(String[] args){

    }
}
