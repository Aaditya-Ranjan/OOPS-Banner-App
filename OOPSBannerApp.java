/**
 * UC7: Store Character Pattern in a Class
 *
 * Goal:
 * Enhance the banner application by introducing a static inner
 * class 'CharacterPattern' that encapsulates a character and
 * its corresponding 7-line banner pattern.
 *
 * Flow:
 * CharacterPattern objects are created for O, P, and S.
 * These objects store pattern data which is retrieved using
 * getter methods. The main method assembles banner rows
 * and prints them using a loop.
 *
 * Concepts Used:
 * Encapsulation, Inner Static Class, Constructors,
 * Arrays of Objects, Getter Methods, and Modularity.
 */
public class OOPSBannerApp {

    // ⭐ Inner Static Class
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {

        // Create objects
        CharacterPattern O =
                new CharacterPattern('O', getOPattern());

        CharacterPattern P =
                new CharacterPattern('P', getPPattern());

        CharacterPattern S =
                new CharacterPattern('S', getSPattern());

        CharacterPattern[] word = {O, O, P, S};

        // Print banner
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    // Utility methods (reuse UC6 methods)

    public static String[] getOPattern() {
        return new String[]{
                "    ***    ",
                "  **   **  ",
                " **     ** ",
                " **     ** ",
                " **     ** ",
                "  **   **  ",
                "    ***    "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                " *******   ",
                " **     ** ",
                " **     ** ",
                " *******   ",
                " **        ",
                " **        ",
                " **        "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                "  *******  ",
                " **        ",
                "    **     ",
                "      **   ",
                "        ** ",
                "        ** ",
                "  *******  "
        };
    }
}
