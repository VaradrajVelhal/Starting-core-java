//Down Half Pyramid
public class Pattern_3 {
    public static void main(String[] args) {
        for (int r = 5; r > 0; r--) {
            for (int c = 0; c < r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
