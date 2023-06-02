package chapters.chap7.ex5;

public class Employee extends Person{
    private double salary;
    public Employee(String name, String bday, double salary) {
        super(name, bday);
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return "Employee "+this.getName() + " has a salary of "+this.getSalary();
    }
}
