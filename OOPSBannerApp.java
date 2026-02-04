/**
 * UC5: Render OOPS Banner using Nested Loops
 *
 * Goal:
 * Enhance UC4 by printing the banner using nested loops
 * instead of String.join(), improving loop control
 * and understanding of multi-dimensional arrays.
 *
 * Concepts:
 * - Nested Loops
 * - 2D Arrays
 * - Iteration Control
 * - Refactoring
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[][] banner = {

                {"    ***    ", "    ***    ", " *******   ", "    ******* "},
                {"  **   **  ", "  **   **  ", " **     ** ", "  **       "},
                {" **     ** ", " **     ** ", " **     ** ", "    **     "},
                {" **     ** ", " **     ** ", " *******   ", "      **   "},
                {" **     ** ", " **     ** ", " **        ", "         **"},
                {"  **   **  ", "  **   **  ", " **        ", "         **"},
                {"    ***    ", "    ***    ", " **        ", "  *******  "}
        };

        // Outer loop → rows
        for (int i = 0; i < banner.length; i++) {

            // Inner loop → letters
            for (int j = 0; j < banner[i].length; j++) {

                System.out.print(banner[i][j] + " ");
            }

            // move to next line after printing row
            System.out.println();
        }
    }
}
