public class HW_1_3 {
    //Задание 3.
    public static void main(String[] args) {
        int[] mass =
                {0, 1, 2, 3, 4, 5, 6, 7};
        int a = mass.length;
        int j = 0;
        int[] massInv = new int[a];
           for (int i = mass.length-1; i >= 0 ; i--, j++) {
           massInv[j] = mass[i];
           }
        System.out.println("Задание 3. \nМассив ");
    for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println ();
        System.out.println("инвертируется в");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(massInv[i] + " ");
        }
    }
}

