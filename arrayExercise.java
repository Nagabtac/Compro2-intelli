import java.util.Scanner;
public class arrayExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        int[][] numbers = new int[rows][columns];
        System.out.println(numbers[1][1]);
        System.out.println(numbers[2][0]);

        for(int i = 0;i <columns; i++){
            for(int j =0;j<columns;i++){
            System.out.println("Enter value for rows and columns at index" + numbers[i][j]);
            numbers[i][j] = input.nextInt();
            }
        }
        for(int i = 0;i <columns; i++){
            for(int j =0;j<columns;i++){
        System.out.print(numbers[i][j]);
            }
        }
    }

}
