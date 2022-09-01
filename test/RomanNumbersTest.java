import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbersTest {

    @Test
    void shouldReturnIfor1() {
        assertEquals("I", toRomanNumber(1));
    }
    @Test
    void shouldReturnIIfor2() {
        assertEquals("II", toRomanNumber(2));
    }

    @Test
    void shouldReturnIIIfor3() {
        assertEquals("III", toRomanNumber(3));
    }


    private String toRomanNumber(int number) {
        String result = "";
        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }

}
