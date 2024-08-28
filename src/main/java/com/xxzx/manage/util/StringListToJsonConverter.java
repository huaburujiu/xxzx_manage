package com.xxzx.manage.util;
import com.fasterxml.jackson.databind.ObjectMapper;  
import jakarta.persistence.AttributeConverter;  
import jakarta.persistence.Converter;  
import java.io.IOException;  
import java.util.ArrayList;  
import java.util.List;  
@Converter(autoApply = true)  
public class StringListToJsonConverter implements AttributeConverter<List<String>, String> {  
  
    private static final ObjectMapper objectMapper = new ObjectMapper();  
  
    @Override  
    public String convertToDatabaseColumn(List<String> attribute) {  
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
    public List<String> convertToEntityAttribute(String dbData) {  
        if (dbData == null || dbData.isEmpty()) {  
            return new ArrayList<>();  
        }  
        try {  
            return objectMapper.readValue(dbData, List.class);  
        } catch (IOException e) {  
            throw new RuntimeException("Error converting JSON to list", e);  
        }  
    }  
}
