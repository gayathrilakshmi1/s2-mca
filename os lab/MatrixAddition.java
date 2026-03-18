import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        m = sc.nextInt();
        n = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];

        System.out.println("Enter elements of Matrix A:");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                B[i][j] = sc.nextInt();

        System.out.println("Matrix Addition:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
