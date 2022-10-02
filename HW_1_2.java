public class HW_1_2 {
   //Задание 2.
   public static void main(String[] args) {
       int n = 15;
       int sum = 0;
       int[] F = new int[n];
           F[0] = 0;
           F[1] = 1;
           for (int i = 2; i < n; i++) {
             F[i] = F[i - 1] + F[i - 2];
                 if (F[i] % 2 == 0) {
                 sum = sum + F[i];
                 }
           }
       System.out.println("Задание 2. Сумма всех чётных элементов последовательности Фибоначчи до " + n + "-го равна " + sum +".");
   }
}
