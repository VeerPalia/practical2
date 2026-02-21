public class pattern {
    public static void main(String[] args) {

        // =========================
        // OUTPUT 1
        // =========================

        // Part 1: Decreasing Star Pattern
        System.out.println("OUTPUT 1:\n");

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Number Pattern
        int num = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;

                if (num == 10) {
                    num = 1; // reset after 9
                }
            }
            System.out.println();
        }

        // =========================
        // OUTPUT 2
        // =========================

        System.out.println("\nOUTPUT 2:\n");

        int n = 5;

        // Star Pyramid
        for (int i = 1; i <= n; i++) {

            for (int space = n; space > i; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Alphabet Reverse Pattern
        for (int i = 5; i >= 1; i--) {

            for (int space = 5; space > i; space--) {
                System.out.print(" ");
            }

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}