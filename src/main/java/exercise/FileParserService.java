package exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileParserService {

    public static final String DELIMITER = ", ";

    public List<List<String>> readFromCsv(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(this::parseLines)
                    .collect(Collectors.toList());
        }
    }

    public List<String> parseLines(String line) {
        return Arrays.asList(line.split(DELIMITER));
    }
}
