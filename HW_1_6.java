public class HW_1_6 {
    public static void main(String[] args) {
        System.out.println("Задание 6. \nЗаданны две квадратные матрицы");
        int i;
        int[][] a = {
                {1, 1, 0, 0},
                {5, 6, 0, 0},
                {6, -3, 4, 0},
                {2, 7, -8, 9}
        };

        int[][] b = {
                {2, 0, -4, 0},
                {4, 6, 3, 4},
                {6, 3, 7, 0},
                {1, 5, -6, 8}
        };
        //Вычисляем длину и ширину массива c/d исходя из
        // наибольших размеров представленных массивов A и B:
        int m = Math.max (a.length, b.length);
        int n = Math.max (a[0].length, b[0].length);

        System.out.println("Первая:");
        for (i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Вторая:");
        for (i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма матриц: ");
        int[][] c = new int[m][n];
        for (i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Разность матриц: ");
        int[][] d = new int[m][n];
        for (i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = a[i][j] + b[i][j]*-1;
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

