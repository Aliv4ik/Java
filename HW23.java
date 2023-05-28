public class HW23 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println((i + " x " + 3 + " = " + i * 3));
            i++;
        }


        double result = 0;
        for (int j = 1; j <= 100; j++) {
            result += j;
        }
        System.out.println("Cереднє арифметичне = " + result / 100);




        test(498);
    }

    public static void test(int number) {
        int result2 = number;
        int iterationCount = 0;
        if (number < 50) {
            System.out.println("Ви ввели надто маленьке число");
        } else {
            while (result2 >= 50) {
                result2 = result2 / 2;
                iterationCount++;
            }
            System.out.println("Число: " + result2);
            System.out.println("Кількість ітерацій: " + iterationCount);
        }
    }
}