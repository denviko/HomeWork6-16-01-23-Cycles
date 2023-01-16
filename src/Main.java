public class Main {

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();
        Task10();


    }

    public static void Task1() {
        System.out.println("Задача №1");
        for (int i = 1; i < 11; i++) {
            System.out.println("Итерация " + i);
        }
    }


    public static void Task2() {
        System.out.println("Задача №2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Итерация " + i);
        }
    }

    public static void Task3() {
        System.out.println("Задача №3");
        for (int i = (0 + 2); i < 18; i = i + 2) {
            System.out.println("Чётные " + i);
        }
    }

    public static void Task4() {
        System.out.println("Задача #4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println("Итерация " + i);
        }
    }

    public static void Task5() {
        System.out.println("Задача №5");
        for (int i = 1904; i < 2096; i = i + 4)
            System.out.println(i + " год является високосным");
    }

    public static void Task6() {
        System.out.println("Задача №6");
        for (int i = 7; i < 105; i = i + 7)
            System.out.println("Итерация " + i);
    }

    public static void Task7() {
        System.out.println("Задача №7");
        for (int i = 1; i < 1024; i = i * 2)
            System.out.println("Итерация " + i);
    }

    public static void Task8() {
        System.out.println("Задача №8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + (", сумма накоплений равна ") + total + (" рублей"));
        }

    }

    public static void Task9() {
        System.out.println("Задача №9");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary / 100;
            System.out.println(("Месяц ") + i + (", сумма накоплений равна ") + total + (" рублей"));

        }
    }

    public static void Task10() {
        System.out.println("Задача №10");
        int total=0;
        for (int i = 1; i < 11; i++) {
            total=total+2;
            System.out.println("2*" + i + "=" + total);
        }

    }
}






