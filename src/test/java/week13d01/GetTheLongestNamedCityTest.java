package week13d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetTheLongestNamedCityTest {

    @Test
    public void testGetTheLongestNamedCity(){
        GetTheLongestNamedCity get = new GetTheLongestNamedCity();
        assertEquals(true, "Jászfelsőszentgyörgy".equals(get.getLongestCity()));
    }

}