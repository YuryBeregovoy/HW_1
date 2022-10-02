public class HW_1_1 {
    //Задание 1.
    public static void main(String[] args) {
        int n = 6;
        int sum = 0;
        int[] intArray =
                {1, 2, n, 5, n, 7, 8};
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] != n) {
                sum = sum + intArray[i];
            }
        }
        System.out.println("Задание 1. Сумма всех элементов массива за исключением числа n равна " + sum);
    }
}
