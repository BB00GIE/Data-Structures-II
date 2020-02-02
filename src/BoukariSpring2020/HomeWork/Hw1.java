package BoukariSpring2020.HomeWork;

import javax.swing.text.StyledEditorKit;
import java.util.*;
public class Hw1 {
    // Search through a matrix
    public static void main(String[] args){

        //Matrix search test
        //int[][] a = create2DMatrix();
        //SearchMatrix(5,a);

        //Symmetric Matrix test
        //nt[][] b = MakeSymmetricMatrix();
        //SearchSymmetricMatrix(5,b);

        //Add Matrix test
        System.out.print(AddMatrix()[0][0]);

    }

    public static int[][] create2DMatrix(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter in number of Columns: ");
        int col = in.nextInt();
        System.out.println("Enter in number of Rows: ");
        int row = in.nextInt();
        int[][] out = new int[col][row];
        for (int i = 0; i < col; i++){
            for (int j = 0; j<row; j++){
                System.out.println("Enter in Data: ");
                out[i][j] = in.nextInt();
            }
        }

        return out;
    }

    public static int[][] MakeSymmetricMatrix() {
        Scanner in = new Scanner(System.in);
        int col = in.nextInt();
        int[][] out = new int[col][col];
        for (int i = 0; i < col; i++){
            for( int j = i; j < col; j++){
                System.out.println("Enter in Data: ");
                out[i][j] = in.nextInt();
                out[j][i]  = out[i][j];

            }
        }
        return out;
    }

    public static void SearchMatrix(int target, int[][] data){
        int rowPos = -1;
        int colPos = -1;
        int i = 0;
        Boolean found = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in number of Columns: ");
        int numCol = in.nextInt();
        System.out.println("Enter in number of Rows: ");
        int numRow = in.nextInt();
        while(!found && i < numCol){
            for(int j = 0; j < numRow; j++){
                if (data[i][j] == target) {
                    colPos = i;
                    rowPos = j;
                    found = true;
                }
            }
            i++;
        }
        System.out.printf("Target at position Column: %d , Row: %d", colPos, rowPos);

    }

    public static void SearchSymmetricMatrix(int target, int[][] data){
        int rowPos = -1;
        int colPos = -1;
        int i = 0;
        Boolean found = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in number of Columns and Rows: ");
        int numCol = in.nextInt();
        while (!found && i < numCol){
            for (int j = i; j < numCol; j ++){
                if (data[i][j] == target){
                    rowPos = j;
                    colPos = i;
                    found = true;
                }
            }
            i++;
        }
        System.out.printf("Target at position Column: %d , Row: %d", colPos, rowPos);

    }


    public static int[][] AddMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in number of Columns: ");
        int col = in.nextInt();
        System.out.println("Enter in number of Rows: ");
        int row = in.nextInt();
        int[][] a = new int[col][row];
        int[][] b = new int[col][row];
        int[][] c = new int[col][row];
        for(int i = 0;i<col;i++){
            for(int j = 0;j<row;j++){
                System.out.println("Enter Data for A: ");
                a[i][j] = in.nextInt();
            }
        }
        for(int i = 0;i<col;i++){
            for(int j = 0;j<row;j++){
                System.out.println("Enter Data for B: ");
                b[i][j] = in.nextInt();
            }
        }
        for(int i = 0;i<col;i++){
            for(int j = 0;j<row;j++){

                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

}
