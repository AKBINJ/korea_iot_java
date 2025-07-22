package org.example.chapter02;

public class Z_Review {
    public static void main(String[] args) {
        // 1.
        // *****
        // ****
        // ***
        // **
        // *

        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2.
        // *****
        //  ****
        //   ***
        //    **
        //     *

        int rows = 5;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for(int k = 0; k < rows - i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
