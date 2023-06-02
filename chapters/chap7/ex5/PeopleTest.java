package chapters.chap7.ex5;

public class PeopleTest {
    public static void main(String[] args){
        Person person1 = new Person("khoi", "06/05");
        Employee employee1 = new Employee("hung", "03/12", 30000);
        Manager manager1 = new Manager("Elon", "unknown", Integer.MAX_VALUE);
        manager1.setAssistant(employee1);
        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = employee1;
        people[2] = manager1;
        for(Person person : people){
            System.out.println(person);
        }
    }
    
}
