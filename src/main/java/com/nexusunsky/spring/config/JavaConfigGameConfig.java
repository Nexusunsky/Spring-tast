package com.nexusunsky.spring.config;

import com.nexusunsky.spring.IGameCard;
import com.nexusunsky.spring.IGamePlayer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 可以实现对对象创建过程的访问控制 以及 依赖注入的方式 C, S, I
 */
@Configuration
public class JavaConfigGameConfig {
    @Bean(name = "myLove")
    public IGameCard hundouluo() {
        return new Hundouluo();
    }

    @Bean
    public IGamePlayer xiaoBawang(IGameCard myLove) { //try hundouluo
        return new XiaoBaWang(myLove);
    }

    //    @Bean
    //    public IGamePlayer xiaoBawang() {
    //        return new XiaoBaWang(hundouluo());
    //    }
}
