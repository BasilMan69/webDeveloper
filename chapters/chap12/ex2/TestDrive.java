package chapters.chap12.ex2;

public class TestDrive {
    public static void main(String[] args){
        Contact c1 = new Contact("khoi", "Hanoi", 911);
        Contact c2 = new Contact("hung", "Toronto", 1234);
        ContactList cList = new ContactList();
        cList.addContact(c1);
        cList.addContact(c2);
        cList.readContactFile("./contact.txt");
        cList.writeToFile("./contact2.txt");
    }
}
