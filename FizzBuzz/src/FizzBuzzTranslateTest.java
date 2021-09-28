import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @Test
    @DisplayName("5")
    void testNumber5() {
        int numberTest = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.getFizzBuzzTranslate(numberTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("3")
    void testNumber3() {
        int numberTest = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.getFizzBuzzTranslate(numberTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("30")
    void testNumber30() {
        int numberTest = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.getFizzBuzzTranslate(numberTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("26")
    void testNumber26() {
        int numberTest = 26;
        String expected = "Hai Sáu";
        String result = FizzBuzzTranslate.getFizzBuzzTranslate(numberTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("35")
    void testNumber35() {
        int numberTest = 35;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.getFizzBuzzTranslate(numberTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("31")
    void testNumber31() {
        int numberTest = 31;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.getFizzBuzzTranslate(numberTest);
        assertEquals(expected,result);
    }
}