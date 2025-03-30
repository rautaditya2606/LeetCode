
class diagonalSum {

    public static int sum(int mat[][]) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 5, 23},
            {12, 15, 40},
            {1, 5, 10}
        };
        System.out.println(sum(mat));
    }
}