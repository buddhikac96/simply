package universalJavaMapper.test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import universalJavaMapper.JavaLibrary;
import universalJavaMapper.JavaLibraryProvider;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestMain {
    public static void main(String[] args) throws IOException {
        String jsonCarArray = "";
        ObjectMapper objectMapper = new ObjectMapper();
        List<JavaLibrary> libs = objectMapper.readValue(
                new File("src/main/java/universalJavaMapper/test/test.json"),
                new TypeReference<List<JavaLibrary>>(){}
                );


        var jlp = new JavaLibraryProvider(libs);
    }
}


