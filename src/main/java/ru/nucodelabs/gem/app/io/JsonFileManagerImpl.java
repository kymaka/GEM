package ru.nucodelabs.gem.app.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;

class JsonFileManagerImpl implements JsonFileManager {

    private final ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    @Override
    public <T> T loadFromJson(File jsonFile, Class<T> type) throws Exception {
        return objectMapper.readValue(jsonFile, type);
    }

    @Override
    public <T> void saveToJson(File jsonFile, T object) throws Exception {
        objectMapper.writeValue(jsonFile, object);
    }
}
