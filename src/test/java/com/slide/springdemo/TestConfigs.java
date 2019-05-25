package com.slide.springdemo;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import static org.junit.Assert.assertEquals;

@Import({Config1.class,Config2.class})
public class TestConfigs {

    @Test
    public void testBothConfigs() {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(TestConfigs.class);
        String exampleString = (String) applicationContext.getBean("example");
        assertEquals("example-from-config1",exampleString);
    }


}
