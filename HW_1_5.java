public class HW_1_5 {
    public static void main(String[] args) {
        System.out.println("Задание 5. \nЗаданный массив");
        int[][] Matrix = {
             // Следующая срока не выполняется для демонстрации проверки условия квадратной матрицы
             //   {1, 0, 0, 0},
                {5, 6, 0, 0},
                {6, -3, 4, 0},
                {2, 7, -8, 9}
        };
            for (int i = 0; i < Matrix.length; i++) {
                for (int j = 0; j < Matrix[i].length; j++) {
                    System.out.print(Matrix[i][j] + " ");
                }
                System.out.println();
            }
            // Проверка квадратная ли матрица
        if (Matrix.length != Matrix[0].length) {
            System.out.println("НЕ является нижней треугольной матрицей, т.к. не является квадратной матрицей");
            System.exit(1);
        }
        else {
            for (int i = 0; i < Matrix.length; i++) {
                for (int j = 0; j < Matrix[i].length; j++) {
                    if (Matrix[i][j] != 0 && i < j) {
                        System.out.println("НЕ является нижней треугольной матрицей");
                        return;
                    }
                }
            }
            System.out.println("Является нижней треугольной матрицей");
        }
    }
}