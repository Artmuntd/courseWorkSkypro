
public class Main {

  static Employee[]employees;
    public static void main(String[] args) {
      employees = new Employee[10];
      employees[0] = new Employee("Артемович Артем Артемов",3,39000);
      employees[1] = new Employee("Владмировский Владимир Владимирович",3,13000);
        employees[2] = new Employee("Светланова Света Светланова",4,23000);
        employees[3] = new Employee("Маринова Марина Мариновна",4,32000);
        employees[4] = new Employee("Олегов Олег Олегович",2,33000);
        employees[5] = new Employee("Никитин Никита Никитич",2,35000);
        employees[6] = new Employee("Анольев Анатолий Анатольевич",2,33000);
        employees[7] = new Employee("Семенович Семен Семенов",5,100000);
        employees[8] = new Employee("Иванов Иван Иванович",4,70000);
        employees[9] = new Employee("Петров Петр Петрович",1,53000);

      fullName();
      
    }
    public static void fullName() {

      for (int i = 0; i< employees.length; i++){
      System.out.println(employees[i].getFullName());
    }
  }
}