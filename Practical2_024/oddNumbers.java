public class oddNumbers {
    public static void main(String[] args) {

        // ===== PART 1 : 1 to 100 =====
        System.out.println("Odd Numbers Between 1 to 100:");

        int sum100 = 0;
        int min100 = 0;
        int max100 = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {

                if (min100 == 0) {
                    min100 = i;
                }

                max100 = i;
                sum100 += i;

                System.out.print(i + " ");
            }
        }

        System.out.println("\nMinimum Odd Number (1-100): " + min100);
        System.out.println("Maximum Odd Number (1-100): " + max100);
        System.out.println("Total Sum (1-100): " + sum100);

        // ===== PART 2 : 1 to 50 =====
        System.out.println("\nOdd Numbers Between 1 to 50:");

        int sum50 = 0;
        int count50 = 0;

        int first = 0, second = 0, third = 0;
        int last1 = 0, last2 = 0, last3 = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {

                System.out.print(i + " ");
                sum50 += i;
                count50++;

                // first three
                if (first == 0) first = i;
                else if (second == 0) second = i;
                else if (third == 0) third = i;

                // last three
                last3 = last2;
                last2 = last1;
                last1 = i;
            }
        }

        System.out.println("\nTotal Three Minimum Odd Numbers: " + (first + second + third));
        System.out.println("Total Three Maximum Odd Numbers: " + (last1 + last2 + last3));
        System.out.println("Average (1-50): " + (sum50 / (double) count50));
    }
}