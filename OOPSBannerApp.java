/**
 * UC4: Render OOPS Banner using Arrays and Loop
 *
 * Goal:
 * Refactor previous use cases by storing banner patterns
 * inside a 2D array and printing them using a loop.
 *
 * Concepts:
 * - Arrays
 * - Nested Data Structure
 * - Looping
 * - Code Refactoring
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

        // Loop through rows
        for (String[] row : banner) {

            // join letters in each row
            System.out.println(String.join(" ", row));
        }
    }
}
