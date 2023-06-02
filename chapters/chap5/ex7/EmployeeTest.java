package chapters.chap5.ex7;

public class EmployeeTest{
    public static void main(String[] args){
        Employee e1 = new Employee("khoi", "nguyen", 69000.5);
        Employee e2 = new Employee("bob", "bob", 59000.5);
        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
        e1.setSalary(e1.getSalary()*1.1);
        e2.setSalary(e2.getSalary()*1.1);
        System.out.println(e2.getSalary());
        System.out.println(e1.getSalary());
    }
}