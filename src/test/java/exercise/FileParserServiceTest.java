package exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FileParserServiceTest {

    private static final FileParserService fileParserService = new FileParserService();

    @Test
    public void parseLinesReturnSplitLine() {
        //given
        String line = "a, b";

        //when
        List<String> result = fileParserService.parseLines(line);

        //then
        Assertions.assertEquals(result.size(), 2);
        Assertions.assertEquals(result, Arrays.asList("a", "b"));
    }
}
