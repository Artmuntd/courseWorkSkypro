public class Employee {

        private String fullName;

        private int department;

        private static int  count;

        private int id;

        private int salary;

        public  Employee (String fullName, int department, int salary) {
            this.fullName = fullName;
            this.department = department;
            this.salary = salary;
            this.count++;
            this.id = count;

        }

        public String getFullName(){
            return this.fullName;
        }

        public  int getDepartment(){
            return this.department;
        }
        public int getSalary(){
            return this.salary;
        }

        public int getId(){
            return this.id;
        }

        public void setDepartament(int department){
            this.department = department;
        }
        public void setSalary(int salary){
            this.salary = salary;
        }

        @Override
        public String toString(){
            return  "ФИО - " + fullName +
                    " id - " +  id +
                    " Отдел - " + department +
                    " Зарплата - " + salary;

        }



}
// в конструкторе при создание обьекта count инкриминтируем(count++). нужно id присвоить count.
