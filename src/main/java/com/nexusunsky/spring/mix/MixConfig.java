package com.nexusunsky.spring.mix;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({GamePlayerConfig.class, GameCardConfig.class})
//@ImportResource("classpath:beans.xml")
public class MixConfig {
}
