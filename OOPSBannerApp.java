/**
 * UC6: Refactor Banner Logic into Functions
 *
 * Goal:
 * Improve the modularity and reusability of the banner application
 * by creating helper methods that generate patterns for each character
 * (O, P, S) instead of hardcoding them inside the array.
 *
 * Flow:
 * Helper methods return 7-line character patterns which are used
 * during banner array initialization. The main method assembles
 * these patterns and prints the banner using a loop.
 *
 * Concepts Used:
 * Static Methods, Helper Methods, Method Abstraction,
 * DRY Principle, Array Initialization via Methods,
 * and Loop-Based Rendering.
 */


public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Assemble banner
        String[][] banner = {
                {O[0], O[0], P[0], S[0]},
                {O[1], O[1], P[1], S[1]},
                {O[2], O[2], P[2], S[2]},
                {O[3], O[3], P[3], S[3]},
                {O[4], O[4], P[4], S[4]},
                {O[5], O[5], P[5], S[5]},
                {O[6], O[6], P[6], S[6]}
        };

        // Print banner
        for (String[] row : banner) {
            System.out.println(String.join(" ", row));
        }
    }

    // Helper method for O
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

    // Helper method for P
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

    // Helper method for S
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
