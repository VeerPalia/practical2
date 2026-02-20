

public class EvenNumbers {
    public static void main(String[] args) {

        int min = 2;
        int max = 100;
        int sum = 0;

        System.out.print("Even Numbers: ");

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println();
        System.out.println("Minimum Even Number: " + min);
        System.out.println("Maximum Even Number: " + max);
        System.out.println("Total Sum: " + sum);
    }
}
