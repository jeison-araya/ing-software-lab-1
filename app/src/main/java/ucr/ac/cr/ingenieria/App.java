package ucr.ac.cr.ingenieria;

/**
 * Morse code converter application.
 * - Converts the word received from args into morse code.
 */
public class App 
{
    public static void main(String[] args )
    {
        int numArgs = args.length;

        if (numArgs != 1) {
            System.out.println("Must receive one argument");
        }
        else {
            String morseCode = MorseCodeConverter.toMorseCode(args[0]);
            System.out.println("Code generated: " + morseCode);
        }
    }
}
