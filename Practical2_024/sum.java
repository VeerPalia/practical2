public class sum {
    public static void main(String[] args) {

        int total = 0;

        for (int i = 1; i <= 100; i += 2) {
            total += i;
        }

        System.out.println("Total Sum of Odd Numbers (1-100): " + total);
    }
}