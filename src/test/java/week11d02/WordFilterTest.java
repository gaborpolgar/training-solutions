package week11d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void wordsWithChar() {
        List<String> texts = List.of("Coca", "cocoa", "talál", "eszik", "lány");
        WordFilter filter = new WordFilter();
        assertEquals(List.of("Coca", "cocoa"), filter.wordsWithChar(texts, 'c'));
        List<String> result = List.of("Coca", "cocoa");
        assertEquals(true, result.equals(filter.wordsWithChar(texts, 'c')));
    }
}