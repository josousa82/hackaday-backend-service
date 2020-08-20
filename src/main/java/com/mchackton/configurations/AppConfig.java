package com.mchackton.configurations;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sousaJ on 17/08/2020
 * in package - com.mchackton.configurations
 **/
@Configuration
@ComponentScan("com.mchackton")
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){
        var restTemplate = new RestTemplate();
        var converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(new ObjectMapper());
        restTemplate.getMessageConverters().add(converter);
        return restTemplate;
    }




}

