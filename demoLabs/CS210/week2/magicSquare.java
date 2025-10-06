import java.util.Scanner;
public class magicSquare 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] magicSquare = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                magicSquare[i][j] = sc.nextInt();
            }
        }
        
        if (isMagicSquare(magicSquare)) {
            System.out.println("The array is a magic square!");
        } else {
            System.out.println("The array is NOT a magic square.");
        }
    }
    
    public static boolean isMagicSquare(int[][] square) {
        int n = square.length;
        
        for (int i = 0; i < n; i++) {
            if (square[i].length != n) {
                return false;
            }
        }
        
        int magicSum = 0;
        for (int j = 0; j < n; j++) {
            magicSum += square[0][j];
        }
        
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += square[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }
        
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += square[i][j];
            }
            if (colSum != magicSum) {
                return false;
            }
        }
        
        int diag1Sum = 0;
        for (int i = 0; i < n; i++) {
            diag1Sum += square[i][i];
        }
        if (diag1Sum != magicSum) {
            return false;
        }
        
        int diag2Sum = 0;
        for (int i = 0; i < n; i++) {
            diag2Sum += square[i][n - 1 - i];
        }
        if (diag2Sum != magicSum) {
            return false;
        }
        
        return true;
    }
}