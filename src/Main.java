import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean checkLeapYear(int check) {
        boolean year = false;
        if (check % 4 == 0 && check % 100 != 0 || check % 400 == 0 ){
            year = true;
        }
        return year;
    } // таск 1

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        if (checkLeapYear(year)) {
            System.out.println(year + " год - високосный год");
        } else System.out.println(year + " год - невисокосный год");
    }

    public static String checkOSAndYearDevice(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String instruction = "0";
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                instruction = "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                instruction = "Установите версию приложения для iOS по ссылке";
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < currentYear) {
                instruction = "Установите облегченную версию приложения для Android по ссылке";
            } else {
                instruction = "Установите версию приложения для Android по ссылке";
            }
        }
        return instruction;
    } // таск 2

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2016;
        System.out.println(checkOSAndYearDevice(clientOS, clientDeviceYear));
    }

    public static int calculatorDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance >= 20 && distance <60) {
            return  2;
        } else if (distance >= 60 && distance <=100) {
            return  3;
        } else {
            return  0;
        }
    } // таск 3

    public static void task3() {
        System.out.println("Задача3");
        short deliveryDistance = 5;
        int deliveryDays = calculatorDays(deliveryDistance);
            if (deliveryDays == 0) {
                System.out.println ("Доставки нет");
        } else {
                System.out.println("Потребуется дней: " + deliveryDays);
            }
    }
}