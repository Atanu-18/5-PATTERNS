//inverted Half Pyramid(rotated by 180 deg)
//    *
//   **
//  ***
// ****
public class pattern5 {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 1; i <= n; i++) {
            // inner loop --> for space 
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" "); 
            }
            // inner loop --> for printing star
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
