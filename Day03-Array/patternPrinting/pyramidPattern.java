// Expected Output

    //     *
    //    ***
    //   *****
    //  *******
    // *********

public class pyramidPattern {

    public static void main(String[] args) {
        int rows = 9; 
        
        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
          
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}