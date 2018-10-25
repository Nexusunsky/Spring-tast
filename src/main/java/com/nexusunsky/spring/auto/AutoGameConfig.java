package com.nexusunsky.spring.auto;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"com.nexusunsky.spring.auto"})
@ComponentScan(basePackageClasses = packageinfo.class)
public class AutoGameConfig {
}
