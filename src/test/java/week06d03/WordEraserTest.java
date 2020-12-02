package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordEraserTest {
    @Test
    void wordsSplitToArray(){
        WordEraser eraser = new WordEraser();
        assertEquals("Dió Körte Eper Szeder", eraser.eraseWord("Alma Dió Körte Alma Eper Szeder Alma", "Alma"));
    }

}