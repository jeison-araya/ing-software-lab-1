package ucr.ac.cr.ingenieria;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MorseCodeConverterTest {
    @Test
    public void testToMorseCode() {
        String input = "HELLO";
        String expectedOutput = ".... . .-.. .-.. ---";
        String actualOutput = MorseCodeConverter.toMorseCode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMorseCodeWithSpace(){
        String input = "HELLO WORLD";
        String expectedOutput = ".... . .-.. .-.. --- / .-- --- .-. .-.. -..";
        String actualOutput = MorseCodeConverter.toMorseCode(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMorseCodeWithInvalidChar(){
        String input = "HELLO WORLD!";
        String expectedOutput = ".... . .-.. .-.. --- / .-- --- .-. .-.. -.. ?";
        String actualOutput = MorseCodeConverter.toMorseCode(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
