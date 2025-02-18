package com.mypackage;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        //create Scanner
        Scanner input = new Scanner(System.in);
        try {
        //create a 2d array with the given data
        System.out.print("Enter The rows for the array: ");
            int rows = input.nextInt();

        System.out.print("Enter The columns of the array: ");
            int columns = input.nextInt();

        //initialize array rows and columns
        int[][]sumOfDiagElem = new int[rows][columns];
                                        /*{{1,2,3,},
                                        {4,5,6},
                                        {7,8,9}};*/

        for(int i = 0; i <rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print("Enter elements for the matrix: ");
                sumOfDiagElem[i][j]=input.nextInt();
            }
        }

        System.out.println("\n-----Given Data printed----");
        for(int i = 0; i <rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(sumOfDiagElem[i][j]);
            }
        }
        System.out.println(" ");
        //print the primary diagonals
        System.out.println("-----print primary diagonal-----");
        int primeDiag = sumOfDiagElem[0][0] + sumOfDiagElem[1][1] + sumOfDiagElem[2][2];
        System.out.println("Sum of Primary Diagonal: "+ primeDiag);
        //System.out.println(sumOfDiagElem[0][0]);

        //prints the Secondary Diagonal
        System.out.println("-----Print Secondary Diagonal-----");
        int secDiag = sumOfDiagElem[2][0] + sumOfDiagElem[1][1] + sumOfDiagElem[0][2];
        System.out.println("Sum Of Secondary Diagonal: "+ secDiag);} 
        catch (Exception e) {
            System.out.println("Enter a valid Number");
            
        }
    }
}
