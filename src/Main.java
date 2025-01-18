import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //trueOrFalseChislo();//объявляем метод к таске 1.7
        //celoeChislo();//объявляем метод к таске 1.6
        //summNumbers(); //объявляем метод к таске 1.5
       // compareNumbers();//объявляем метод к таске 1.4
        //printColor(); //объявляем метод к таске 1.3
        //printThreeWords(); //объявляем метод к таске 1.1

        //checkSumSign(); //объявляем метод к таске 1.2
        strokaChislo(); //объявляем метод к таске 1.8
    }
/*
    public static void printThreeWords() {
        System.out.println("O"); //тупенько, но эффективно))
        System.out.println("r");
        System.out.println("a");
        System.out.println("n");
        System.out.println("g");
        System.out.println("e");
        System.out.println("B");
        System.out.println("a");
        System.out.println("n");
        System.out.println("a");
        System.out.println("n");
        System.out.println("a");
        System.out.println("A");
        System.out.println("p");
        System.out.println("p");
        System.out.println("l");
        System.out.println("e");
    }

    public static void checkSumSign() {
        Scanner scanner = new Scanner(System.in); //Вводим сканер для возможности самим вписать в консоль числа
        System.out.println("Введите первое слагаемое");
        int a = scanner.nextInt();
        System.out.println("Введите второе слагаемое");
        int b = scanner.nextInt();
        if ((a + b) > 0) { //первое условие
            System.out.println("Сумма положительная");
        } else if ((a + b) < 0) { //условие, если первое не прошло
            System.out.println("Сумма отрицательная");
        } else { //условие, при котором отсутствуют иные варианты
            System.out.println("Сумма равно 0");
        }

    }
    public static void printColor() {
        Scanner scanner = new Scanner(System.in); //Вводим сканер для возможности самим вписать в консоль число
        System.out.println("Введите число для определения цвета");
        int value;
        value = scanner.nextInt();

        if (value <= 0) {
            System.out.println("Красный");
        } else if ( (value > 0) && (value <= 100)) {
            System.out.println("Жёлтый");
        } else  {
            System.out.println("Зелёный");
        }

    }
    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        int b = 10;
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        if (a >= b) {
            System.out.println("a >= b"); //можно было это задать и отдельной переменной
        }  else  {
            System.out.println("a < b");
        }

    }
    public static void summNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        if ((a + b >= 10) && (a + b <= 20) ) { // && логическое И
            System.out.println("true"); // скорее всего не правильно, возможно через boolean надо было делать
        }  else  {
            System.out.println("false");
        }

    }
    public static void celoeChislo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }
    public static void trueOrFalseChislo () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        boolean b = false; //вот теперь через boolean)
        boolean c = true;
        if (a >= 0) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    } */
    public static void strokaChislo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int a = scanner.nextInt();
        String b = "Зачем так сложно, Астон?".repeat(a); // вот этот repeat я подсмотрел, как раз начиная с 11 версии
        if ((a > 0) && (a <= 5)) {
            System.out.println (b);
        } else {
            System.out.println("Много не надо выводить");
        }


    }

}