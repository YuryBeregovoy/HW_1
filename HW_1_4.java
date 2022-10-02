public class HW_1_4 {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        System.out.println("Задание 4. \nВ массиве");
        int[][] intArray = {
                {1, -2, -3, -4, 0},
                {5,  6, -7, -8, 9}
        };
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
                if (intArray[i][j] > 0)
                    positive++;
                else if (intArray[i][j] !=0)
                    negative++;
            }
            System.out.println();
        }
        if (positive > negative)
        System.out.print("Количество положительных чисел больше количества отрицательных: " + positive + " > " + negative);
            else if (positive == negative)
            System.out.print("Количество положительных чисел равно количеству отрицательных: " + positive + " = " + negative);
            else
            System.out.print("Количество отрицательных чисел больше количества положительных: " + negative + " > " + positive);
    }
}