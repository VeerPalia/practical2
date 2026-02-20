
public class FullPyramid {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = rows; i >= 1; i--) {

            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}