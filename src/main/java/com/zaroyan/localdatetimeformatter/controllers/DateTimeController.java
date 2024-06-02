package com.zaroyan.localdatetimeformatter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author Zaroyan
 */
@RestController
public class DateTimeController {

    @GetMapping("/datetime")
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}