package com.rapidtech.springdasar.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HelloWordConfigurationTest {
    @Test
    void applicationContextTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWordConfigurationTest.class);

        Assertions.assertNotNull(context);
    }
}