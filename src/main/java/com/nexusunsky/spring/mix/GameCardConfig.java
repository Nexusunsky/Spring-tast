package com.nexusunsky.spring.mix;

import com.nexusunsky.spring.IGameCard;
import com.nexusunsky.spring.config.Hundouluo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameCardConfig {
    @Bean
    public IGameCard hundouluo() {
        return new Hundouluo();
    }
}
