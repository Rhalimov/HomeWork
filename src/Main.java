import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        trueOrFalseChislo();//объявляем метод к таске 1.7
        //celoeChislo();//объявляем метод к таске 1.6
        //summNumbers(); //объявляем метод к таске 1.5
        //compareNumbers();//объявляем метод к таске 1.4
        //printColor(); //объявляем метод к таске 1.3
        printThreeWords(); //объявляем метод к таске 1.1

        //checkSumSign(); //объявляем метод к таске 1.2

    }

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

  /*  public static int checkSumSign() {
        Scanner scanner = new Scanner(System.in); //Вводим сканер для возможности самим вписать в консоль числа
        System.out.println("Введите первое слагаемое");
        int a = scanner.nextInt();
        System.out.println("Введите второе слагаемое");
        int b = scanner.nextInt();
        if ((a + b) > 0) {
            System.out.println("Сумма положительная");
        } else if ((a + b) < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма равно 0");
        }
return checkSumSign();
    }
    public static int printColor() {
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
        return printColor();
    }
    public static int compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        int b = 10;
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        }  else  {
            System.out.println("a < b");
        }
        return compareNumbers();
    }
    public static int summNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        if ((a + b >= 10) && (a + b <= 20) ) {
            System.out.println("true");
        }  else  {
            System.out.println("false");
        }
        return summNumbers();
    }
    public static int celoeChislo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        } return celoeChislo();
    } */
    public static int trueOrFalseChislo () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        } return trueOrFalseChislo();
    }
}