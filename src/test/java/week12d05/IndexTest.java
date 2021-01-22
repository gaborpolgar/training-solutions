package week12d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexTest {

    @Test
    public void indexTest(){
        Index index = new Index();
        assertEquals(2, index.lineCounter());
    }

}