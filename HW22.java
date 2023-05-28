public class HW22 {
    public static void main(String[] args) {
        int age = 15;
        if (age < 0) {
            System.out.println("Невірний вік");
        } else if (age < 18) {
            System.out.println("Ви ще не повнолітній");
        } else  {
            System.out.println("Ви стали дорослим");
        }



        int a = 170;
        int b = 15;
        int result = a / b;
        String text = "Ділиться " + result;
        String text2 = "Ділиться з залишком " + a % b;
        if (a % b == 0) {
            System.out.println(text);
        } else {
            System.out.println(text2);
        }


        int yearsWorked = 5;
        int salary = 7000;
        if (yearsWorked < 1) {
            // не делаем ничего
        } else if (yearsWorked < 3) {
            salary *= 1.1;
        } else {
            salary *= 1.2;
        }
        if (salary < 4000) {
            salary += 1000;
        } else {
            salary += 500;
        }
        System.out.println("Заробітна плата: " + salary);


    }
}

