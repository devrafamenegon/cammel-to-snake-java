package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MyService {

    public static Map<String, Object> convertKeysToSnakeCase(Map<String, Object> inputMap) {
        Map<String, Object> outputMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : inputMap.entrySet()) {
            String snakeCaseKey = camelToSnakeCase(entry.getKey());
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = convertKeysToSnakeCase((Map<String, Object>) value);
            } else if (value instanceof List) {
                value = convertListItemsToSnakeCase((List<Object>) value);
            }
            outputMap.put(snakeCaseKey, value);
        }
        return outputMap;
    }

    private static List<Object> convertListItemsToSnakeCase(List<Object> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            Object listItem = inputList.get(i);
            if (listItem instanceof Map) {
                inputList.set(i, convertKeysToSnakeCase((Map<String, Object>) listItem));
            } else if (listItem instanceof List) {
                inputList.set(i, convertListItemsToSnakeCase((List<Object>) listItem));
            }
        }
        return inputList;
    }

    private static String camelToSnakeCase(String camelCase) {
        return camelCase.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
    }
}