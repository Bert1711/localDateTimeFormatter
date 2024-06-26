package com.zaroyan.localdatetimeformatter.configuration;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author Zaroyan
 */
@Configuration
public class JacksonConfig {

    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jacksonCustomizer() {
        return builder -> {
            builder.serializerByType
                    (LocalDateTime.class, new LocalDateTimeSerializer
                            (DateTimeFormatter.ofPattern("yyyy:MM:dd | HH:mm:ss:SSS",  Locale.getDefault())));
        };
    }
}
