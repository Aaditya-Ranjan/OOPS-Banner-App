/**
 * UC3: Render OOPS as Banner using String.join()
 *
 * Goal:
 * Refactor UC2 by replacing string concatenation (+)
 * with String.join() to improve memory efficiency,
 * readability, and maintainability.
 *
 * Actor: User
 *
 * Flow:
 * User runs the program → String.join() constructs each
 * line of the banner → program prints the OOPS banner → exits.
 *
 * Key Concepts:
 * - String.join()
 * - Memory Efficiency
 * - String Immutability
 * - Code Refactoring
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ","    ***    " , "    ***    " , " *******   " , "    ******* "));
        System.out.println(String.join(" ","  **   **  " , "  **   **  " , " **     ** " , "  **        "));
        System.out.println(String.join(" "," **     ** " , " **     ** " , " **     ** " , "    **      "));
        System.out.println(String.join(" "," **     ** " , " **     ** " , " *******   " , "      **    "));
        System.out.println(String.join(" "," **     ** " , " **     ** " , " **        " , "         ** "));
        System.out.println(String.join(" ","  **   **  " , "  **   **  " , " **        " , "         ** "));
        System.out.println(String.join(" ","    ***    " , "    ***    " , " **        " , "  *******   "));
    }
}
