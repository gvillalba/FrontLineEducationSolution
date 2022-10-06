package com.frontlineeducation.codesample.germanvillalba.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileReader {
    public static List<String> loadFile(String filename) {
        return null;
    }

    public static List<String> readFileInList(String fileName)
    {

        List<String> lines = Collections.emptyList();
        try
        {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }
}
