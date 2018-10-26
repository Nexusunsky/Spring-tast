package com.nexusunsky.spring.mix;

import com.nexusunsky.spring.IGameCard;
import com.nexusunsky.spring.IGamePlayer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamePlayerConfig {
    @Bean
    public IGamePlayer xiaobawang(IGameCard hundouluo) {
        return new XiaoBaWang(hundouluo);
    }
}
