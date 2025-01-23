package main.java;

public class App {

  private static Employee[] employees = new Employee[5];

  public static void main(String[] args) {
    employees[0] = new Employee("Roman", "Avtotester", "halimov_ne@mail.ru", "8-901-364-1631", 250,
        39);
    employees[1] = new Employee("NeRoman", "Vtotester", "hamov_ne@mail.ru", "8-901-564-1631", 260,
        40);
    employees[2] = new Employee("Romans", "Avtotesters", "halimovs_ne@mail.ru", "8-902-364-1631",
        270, 41);
    employees[3] = new Employee("Oman", "Avtester", "alimov_ne@mail.ru", "8-801-364-1631", 280, 42);
    employees[4] = new Employee("man", "tester", "imov_ne@mail.ru", "8-905-364-1631", 290, 43);
    for (int i = 0; i < 5; i++) {
      System.out.println(employees[i]);
    }
  }

}
