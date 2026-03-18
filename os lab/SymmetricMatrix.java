import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int n, i, j;
        boolean flag = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix: ");
        n = sc.nextInt();

        int[][] A = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (A[i][j] != A[j][i]) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is NOT Symmetric");
    }
}