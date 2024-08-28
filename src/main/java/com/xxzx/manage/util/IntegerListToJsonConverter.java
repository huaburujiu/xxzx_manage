package com.xxzx.manage.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;   
import jakarta.persistence.AttributeConverter;  
import jakarta.persistence.Converter;  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.List; 

@Converter(autoApply = true)  
public class IntegerListToJsonConverter implements AttributeConverter<List<Integer>, String> {  
  
    private static final ObjectMapper objectMapper = new ObjectMapper();  
  
    @Override  
    public String convertToDatabaseColumn(List<Integer> attribute) {  
        if (attribute == null) {  
            return null;  
        }  
        try {  
            return objectMapper.writeValueAsString(attribute);  
        } catch (IOException e) {  
            throw new RuntimeException("Error converting list to JSON", e);  
        }  
    }  
  
    @Override  
    public List<Integer> convertToEntityAttribute(String dbData) {  
        if (dbData == null || dbData.isEmpty()) {  
            return new ArrayList<>();  
        }  
        try {  
            // 使用 TypeReference 来帮助 ObjectMapper 推断出正确的泛型类型  
            TypeReference<List<Integer>> typeRef = new TypeReference<List<Integer>>() {};  
            return objectMapper.readValue(dbData, typeRef);  
        } catch (IOException e) {  
            throw new RuntimeException("Error converting JSON to list", e);  
        }  
    }  
}