package org.exam.rest;

import org.exam.dto.TestDto;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
    @GetMapping("test")
    public String test(@SpringQueryMap TestDto dto) {
        return "test";
    }
}