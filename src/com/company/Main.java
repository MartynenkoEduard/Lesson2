
package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercise_1();
        // Exercise_2();
        //Exercise_3();
        //Exercise_4();
        // Exercise_5();
        //Exercise_6();
        // Exercise_7();
        //Exercise_8();
        //Exercise_9();
       // Exercise_10();

    }


    private static void Exercise_1() {
        int a;
        System.out.println("Введите число: ");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();


        if ((a % 2 == 0) && (a != 0)) {
            System.out.println("Число четное");
        } else if ((a % 2 != 0) && (a != 0)) {
            System.out.println("Число нечетное");
        } else
            System.out.println("Введеное число не должно равняться нулю");
        }




    private static void Exercise_2() {
        System.out.println("Введите число: ");
        int b;
        Scanner input = new Scanner(System.in);
        b = input.nextInt();
        if ((b % 3 == 0) && (b != 0) && (b % 9 != 0)) {
            System.out.println("Число кратное трём");
        } else if ((b % 5 == 0) && (b != 0)) {
            System.out.println("Число кратное пяти");
        } else if ((b % 9 == 0) && (b != 0)) {
            System.out.println("Число кратное девяти");
        } else if (b == 0) {
            System.out.println("Введеное число не должно равняться нулю");
        }
    }

    public static void Exercise_3() {


        System.out.println("Введите число a :");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Введите число b :");

        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();

        if (b != 0) {
            double c = a / b;
            System.out.println("a / b = " + c);
        } else {
            System.out.println("Ошибка ввода. Число не должно равняться 0");

        }
    }

    private static void Exercise_4() {
        System.out.println("В каком году была основана Одесса?");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        if (y == 1794) {
            System.out.println("Верно. Молодец");
        } else {
            System.out.println("Вы ошиблись, Одесса была основана в 1794 году");
        }
    }

    public static void Exercise_5() {
        System.out.println("Введите год");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 400 != 0) && (year % 4 != 0)) {
            System.out.println("Год не является высокосным");
        } else {
            System.out.println("Год высокосный");
        }

    }

    public static void Exercise_6() {
        System.out.println("Введите стоимость покупки");
        Scanner y = new Scanner(System.in);
        double amount = y.nextInt();
        if (amount > 1000) {
            System.out.println("Вам предоставляется скидка 5 %\n" + "Сумма с учетом скидки " + (amount - (amount * 0.05)));
        } else if ((amount > 500) && (amount < 1000)) {
            System.out.println("Вам предоставляется скидка 3 %\n" + "Сумма с учетом скидки "
                    + (amount - (amount * 0.03)));
        } else {
            System.out.println("Стоимость покупки " + amount);
        }
    }

    private static void Exercise_7() {
        System.out.println("Вычисление стоимости разговора по телефону.\n"
                + "Стоимость одной минуты разговора  - 10 грн.\nВ выходные дни предоставляется скидка - 20 %\n"
                + "Введите исходные данные:");
        System.out.println("Длительность разговора (целое количество минут)");
        Scanner input = new Scanner(System.in);
        int callDuration = input.nextInt();
        System.out.println("День недели (1 — понедельник, ... 7 — воскресенье)");
        int dayOfWeek = input.nextInt();
        if (dayOfWeek <= 5)  {
            System.out.println("Общая стоимость разговора: " + (callDuration * 10) + "грн.");
        } else if (dayOfWeek <= 7) {
            System.out.println(" Вам предоставляется скидка 20%  - " + (callDuration * 2) + "грн." + "\n" +
                    "Общая стоимость разговора:" + ((callDuration * 10) - (callDuration * 2)) + "грн.");
        } else  {
            System.out.println("Ошибка ввода");
    }

    private static void Exercise_8() {
        System.out.println("Выводится случайное трехзначное число");

        double number = Math.random() * 899 + 100;

            double hundreds = number / 100 % 10;
            double tens = number / 10 % 10;
            double units = number % 10;

        System.out.println("Первая цифра - " + hundreds + "\n" +
                "Вторая цифра - " + tens + "\n" +
                "Третья цифра - " + units + "\n");
        if (hundreds > units)
            System.out.println("Первая цифра больше последней");
        else if (units > hundreds)
            System.out.println("Последняя цифра больше первой");
        if (hundreds > tens)
            System.out.println("Первая цифра больше второй");
        else if (tens > hundreds)
            System.out.println("Вторая цифра больше первой");
        if (units > tens)
            System.out.println("Третья цифра больше второй");
        else if (tens > units)
            System.out.println("Вторая цифра больше третьей");
    }

    public static void Exercise_9() {

        String[] unit = {"", "один", "два", "три", "четыре", "пять", "шесть",
                "семь", "восемь", "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать",
                "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] ten = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] hundred = {"", "cто", "двести", "триста", "четыреста", "пятсот", "шестьсот", "семсот", "восемсот", "девятьсот", "тысяча",};
        String[] thousand = {"", "одна тысяча", "две тысячи", "три тысячи", "четыре тысячи", "пять тысяч", "шесть тысяч", "семь тысяч",
                "восемь тысяч", "девять тысяч", "десять тысяч"};


        Scanner input = new Scanner(System.in);
        System.out.println("Число от 0 до 10000: ");
        int number = input.nextInt();


        int thousands = number / 1000;
        int hundreds = number / 100 % 10;
        int tens = number / 10 % 10;
        int units = number % 10;

        if ((number >= 1000) && (number < 10000)) {
            System.out.println(thousand[thousands] + " " + hundred[hundreds] + " "
                    + ten[tens] + " " + unit[units]);
        } else if ((number >= 100) && (number < 1000)) {
            System.out.println(hundred[hundreds] + " " + ten[tens] + " " + unit[units]);
        } else if ((number < 100) && (number > 20)) {
            System.out.println(ten[tens] + " " + unit[units]);
        } else if ((number < 20) && (number != 0)) {
            System.out.println(unit[number]);
        } else if (units == 0)
            System.out.println("ноль");
    }


    public static void Exercise_10() {

        double x = 5;
        System.out.println(" x  - " + x);
        double y = 3;
        System.out.println(" y  - " + y);

        double x1 = x;
        x = (x < y) ? ((x + y) / 2) : x1 * y * 2;
        y = (x > y) ? ((x1 + y) / 2) : x1 * y * 2;

        System.out.println("x = " + x + "  " + "y = " + y);
    }
}}



