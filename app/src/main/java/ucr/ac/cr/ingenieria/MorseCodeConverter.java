package ucr.ac.cr.ingenieria;

public class MorseCodeConverter {
    private static final String[] MORSE_CODE = {
            ".-", "-...", "-.-.", "-..",
            ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--",
            "--.."};

    private static final String INVALID_CHAR_CODE = "? ";
    private static final String SPACE_CODE = "/ ";

    public static String toMorseCode(String text) {
        StringBuilder morseCodeBuilder = new StringBuilder();

        for (char c : text.toUpperCase().toCharArray()) {
            if (Character.isWhitespace(c)) {
                morseCodeBuilder.append(SPACE_CODE);
                continue;
            }
            if (Character.isLetter(c)) {
                int index = c - 'A';
                morseCodeBuilder.append(MORSE_CODE[index]).append(" ");
                continue;
            }
            morseCodeBuilder.append(INVALID_CHAR_CODE);
        }
        return morseCodeBuilder.toString().trim();
    }
}
