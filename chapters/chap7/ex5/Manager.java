package chapters.chap7.ex5;

public class Manager extends Employee {
    private Employee assistant;
    public Manager(String name, String bday, double salary){
        super(name, bday, salary);
    }
    public void setAssistant(Employee assistant) {
        this.assistant = assistant;
    }
    @Override
    public String toString(){
        return "Manager " + this.getName() + " has an assistant called " + assistant.getName();
    }
}
