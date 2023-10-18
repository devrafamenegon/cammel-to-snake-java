package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MyService {

    public Map<String, Object> convertKeysToSnakeCase(Map<String, Object> inputMap) {
        Map<String, Object> outputMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : inputMap.entrySet()) {
            String snakeCaseKey = camelToSnakeCase(entry.getKey());
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = convertKeysToSnakeCase((Map<String, Object>) value);
            }
            outputMap.put(snakeCaseKey, value);
        }
        return outputMap;
    }

    private String camelToSnakeCase(String camelCase) {
        return camelCase.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
    }
}