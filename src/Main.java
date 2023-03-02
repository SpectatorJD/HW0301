
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int storage = 0;
        int salary = 15000;
        int month = 0;
        while (storage < 2459000) {
            month = month + 1;
            storage = storage + salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + storage);
        }
        System.out.println("Итоговая сумма накоплений " + storage);

    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.print("\n");
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int population = 12_000_000;
        int born = 17;
        int dead = 8;
        int dif = born - dead;
        //System.out.println(dif);
        for (int i = 1; i <= 10; i++) {
            population = population + (population * dif / 1000);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        int i = 1;
        for (; total < 12000000; i++) {
            total = total + salary * 100 / 7;
            System.out.println("Месяц " + i + " сумма накоплений " + total);

        }
        System.out.println("Итоговая сумма накоплений" + total);
    }

    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        int total = 0;
        int i = 1;
        for (; total < 12000000; i++) {
            total = total + salary * 100 / 7;
            if
            (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + total);
            }

        }
        System.out.println("Итоговая сумма " + total);

    }

    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15000;
        int total = 0;
        int i = 1;
        for (; i <= 108; i++) {
            total = total + salary * 100 / 7;
            if
            (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + total);
            }

        }
        System.out.println("Итоговая сумма накоплений " + total);

    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 7;
        while (friday <= 31) {
            friday++;

            if (friday % 7 == 0) {
                System.out.println("Сегодня пятница " + friday + "-e число. Необходимо подготовить отчет.");
            }
        }
    }


    public static void task8() {
        System.out.println("Задача 8");
        int year = 2023;
        int before = year - 200;
        int after = year + 100;
        while (before < year) {
            before++;
            if (before % 79 ==0) {
                System.out.println(before);
            }
        }
        while (after > year) {
            after--;
            if (after % 79 ==0) {
                System.out.println(after);
            }
        }

    }
}






