package com.nexusunsky.spring.inconsistency;

import com.nexusunsky.spring.IGameCard;
import com.nexusunsky.spring.IGamePlayer;

import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("BlueRabbit")
    public IGameCard sonic() {
        return new Sonic();
    }

    @Bean
    public IGamePlayer xiaoBawang(@Qualifier("BlueRabbit") IGameCard gameCard) {
        return new XiaoBaWang(gameCard);
    }
}
