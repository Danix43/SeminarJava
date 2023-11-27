public class MyMatrix {

    public static void printm(int[][] m, int r, int c) {
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mn(int[][] a, int[][] b, int r, int c) {
        int[][] x = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                for (int k = 0; k <= r; k++) {
                    x[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printm(x, r, c);
    }

    public static void main(String[] args) {
        int[][] x = { { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 } };

        int r, c;
        r = c = 2;

        mn(x, x, r, c);
    }
}