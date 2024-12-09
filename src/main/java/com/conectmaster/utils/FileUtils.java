package com.conectmaster.utils;

import com.conectmaster.dto.Master;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {

    public static Master readMasterJSONFile() {
        URL resource = FileUtils.class.getClassLoader().getResource("master.json");
        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(Paths.get(resource.toURI()));
            return new ObjectMapper().readValue(new String(bytes),Master.class);
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
