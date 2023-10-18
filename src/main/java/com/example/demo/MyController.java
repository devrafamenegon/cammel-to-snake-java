package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class MyController {

    private final MyService objectConverterService;

    @Autowired
    public MyController(MyService objectConverterService) {
        this.objectConverterService = objectConverterService;
    }

    @PostMapping("/convert")
    public ResponseEntity<Object> convert(@RequestBody Map<String, Object> requestBodyMap) {
        Map<String, Object> convertedProperties = objectConverterService.convertKeysToSnakeCase(requestBodyMap);
        return ResponseEntity.ok(convertedProperties);
    }
}