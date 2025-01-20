import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords(); //объявляем метод к таске 1.1
        checkSumSign(); //объявляем метод к таске 1.2
        printColor(); //объявляем метод к таске 1.3
        //compareNumbers();//объявляем метод к таске 1.4
        //summNumbers(); //объявляем метод к таске 1.5
        //celoeChislo();//объявляем метод к таске 1.6
        //trueOrFalseChislo();//объявляем метод к таске 1.7
        //strokaChislo(); //объявляем метод к таске 1.8
        //visokosnYear(); //объявляем метод к таске 1.9
        //massiveOdiNol(); //объявляем метод к таске 1.10
        //massiveNolSto(); //объявляем метод к таске 1.11
        //massiveUmnozhimDva(); //объявляем метод к таске 1.12
        //massiveKvadrat(); //объявляем метод к таске 1.13
        //massiveChislo(); //объявляем метод к таске 1.14

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");



    }

    public static void checkSumSign() {
        //Scanner scanner = new Scanner(System.in); //Вводим сканер для возможности самим вписать в консоль числа
        //System.out.println("Введите первое слагаемое");
        int a = 5;
        //System.out.println("Введите второе слагаемое"); //сканер замокан для примера реализации
        int b = 10;
        if ((a + b) > 0) { //первое условие
            System.out.println("Сумма положительная");
        } else if ((a + b) < 0) { //условие, если первое не прошло
            System.out.println("Сумма отрицательная");
        } else { //условие, при котором отсутствуют иные варианты
            System.out.println("Сумма равно 0");
        }

    }

    public static void printColor() {
        //Scanner scanner = new Scanner(System.in); //Вводим сканер для возможности самим вписать в консоль число
        //System.out.println("Введите число для определения цвета");
        int value;
        value = 10;

        if (value <= 0) {
            System.out.println("Красный");
        } else if ((value > 0) && (value <= 100)) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }

    }

    public static void compareNumbers() {
        //Scanner scanner = new Scanner(System.in);
        int b = 10;
        //System.out.println("Введите число a");
        int a = 7;
        if (a >= b) {
            System.out.println("a >= b"); //можно было это задать и отдельной переменной
        } else {
            System.out.println("a < b");
        }

    }

    public static void summNumbers() {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите число a");
        int a = 7; //scanner.nextInt();
        //System.out.println("Введите число b");
        int b = 10; //scanner.nextInt();
        if ((a + b >= 10) && (a + b <= 20)) { // && логическое И
            System.out.println("true"); // скорее всего не правильно, возможно через boolean надо было делать
        } else {
            System.out.println("false");
        }

    }

    public static void celoeChislo() {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите число a");
        int a = 6; //scanner.nextInt();
        if (a >= 0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }

    public static void trueOrFalseChislo() {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите число a");
        int a = 4; //scanner.nextInt();
        boolean b = false; //вот теперь через boolean)
        boolean c = true;
        if (a >= 0) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static void strokaChislo() {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите количество строк");
        int a = 4; //scanner.nextInt();
        String b = "Зачем так сложно, Астон?".repeat(a); // вот этот repeat я подсмотрел, не придумал как умножить строку на число
        if ((a > 0) && (a <= 5)) {
            System.out.println(b);
        } else {
            System.out.println("Много не надо выводить");
        }


    }

    public static void visokosnYear() {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите год");
        int year = 1700;//scanner.nextInt();
        boolean a = true;
        boolean b = false;
        if (year % 4 == 0) {  //здесь проверяем первое условие, что год делится без остатка на 4
            if (year % 100 == 0) { //здесь проверяем первое условие, что год делится без остатка на 100
                if (year % 400 == 0) { //здесь проверяем первое условие, что год делится без остатка на 400
                    System.out.println(a);
                } else {
                    System.out.println(b);
                }

            }
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void massiveOdiNol() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

        }
    }

    public static void massiveNolSto() {
        int[] arr = new int[101];
        for (int i = 0; i < 101; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void massiveUmnozhimDva() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //теперь намного изящнее
        for (int i = 0; i < 12; i++) { //запускаем цикл по элементам

            if (arr[i] < 6) {// проверяем условие и умножаем
                System.out.println(arr[i] * 2);
            }
        }

    }

    public static void massiveKvadrat() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] = 1);
                } else {
                    System.out.print(arr[i][j] = 0);
                } //вот здесь надо было скорее всего через Array как в 14
            }
        }
    }

    public static void massiveChislo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int len = scanner.nextInt();
        int initialValue = 5;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println(Arrays.toString(arr)); // хорошо в лекции про это рассказали
        }
    }
}








