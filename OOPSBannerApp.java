/**
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * Goal:
 * Improve scalability by storing character patterns in a HashMap
 * for quick lookup and reuse while constructing the banner.
 *
 * Flow:
 * CharacterPattern objects are stored in a HashMap with the
 * character as the key. The program retrieves patterns for the
 * word "OOPS", assembles banner rows, and prints them using
 * nested loops.
 *
 * Concepts Used:
 * HashMap, Collections Framework, Encapsulation,
 * Static Utility Methods, Nested Loops, and Modularity.
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Inner Static Class
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }

    // ⭐ Build HashMap
    public static Map<Character, CharacterPattern> buildPatternMap() {

        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern('O', getOPattern()));
        map.put('P', new CharacterPattern('P', getPPattern()));
        map.put('S', new CharacterPattern('S', getSPattern()));

        return map;
    }

    // ⭐ Rendering Function
    public static void renderBanner(String message,
                                    Map<Character, CharacterPattern> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                CharacterPattern cp = map.get(ch);

                if (cp != null) {
                    line.append(cp.getPattern()[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }

    // Patterns (reuse from UC6/7)

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
