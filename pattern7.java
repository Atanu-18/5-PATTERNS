// Inverted Half Pyramid with Numbers
// 12345
// 1234
// 123
// 12
// 1
public class pattern7 {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int  i = 1; i <= n; i++) {
            //inner loop
            for(int j = 1; j <= n-i+1;j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // for (int i = n; i >= 1; i--) {
        //     // inner loop
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }                                    it also be corrected
    }
}
