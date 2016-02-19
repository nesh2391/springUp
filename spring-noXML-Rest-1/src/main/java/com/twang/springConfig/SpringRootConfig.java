package com.twang.springConfig;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//Tells that this class has some bean definitions that need to be processed 
@ComponentScan({"com.twang.sprig"})
public class SpringRootConfig {

}
