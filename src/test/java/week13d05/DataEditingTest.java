package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataEditingTest {

    @Test
    void countingDifferentLetters() {
        DataEditing edit = new DataEditing();
        assertEquals(3, edit.countingDifferentLetters("almaAL3+=ŐÚ"));
    }
}