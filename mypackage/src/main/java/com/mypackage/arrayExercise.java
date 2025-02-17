package com.mypackage;
import java.util.Scanner;
public class arrayExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        int[][] numbers = new int[rows][columns];

        for(int i = 0;i <=rows; i++){
            for(int j =0;j<=columns;i++){
            System.out.println("Enter value ");
            
            
            }
        }
        for(int i = 0;i <=rows; i++){
            for(int j =0;j<=columns;i++){
        System.out.print(numbers[i][j]);
            }
        }





        input.close();
    }

}
