package chapters.chap12.ex2;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.nio.charset.*;

public class ContactList {
    private ArrayList<Contact> contacts;

    public ContactList(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    public void writeToFile(String fileName) {
        boolean hasFile = false;
        try {
            File contactFile = new File(fileName);
            if (contactFile.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("File's name: " + contactFile.getName());
            hasFile = true;
        } catch (IOException e) {
            catchException(e);
        }
        if (hasFile) {
            try {
                FileWriter myWriter = new FileWriter(fileName);
                for(Contact c: contacts){
                    myWriter.write("Name: " + c.getName() +"\tAddress: "+ c.getAddress()+"\tPhone Number: "+ c.getPhoneNumber()+"\n");
                }
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            }catch (IOException e) {
                catchException(e);
            }
        }
    }
    public void readContactFile(String fileName){
        try{
            FileReader reader = new FileReader(fileName, Charset.forName("UTF8"));
            char[] chars = new char[1000];
            reader.read(chars);
            String str = String.valueOf(chars);
            while(str.indexOf("Name: ")!= -1){
                int nameIndex = str.indexOf("Name: ")+6;
                int endIndex = str.indexOf("\t");
                String name = str.substring(nameIndex, endIndex);
                str = str.substring(endIndex+1);

                int addressIndex = str.indexOf("Address: ")+9;
                endIndex = str.indexOf("\t");
                String address = str.substring(addressIndex, endIndex);
                str = str.substring(endIndex+1);

                int pNumIndex = str.indexOf("Phone Number: ")+14;
                endIndex = str.indexOf("\n");
                int pNum = Integer.parseInt(str.substring(pNumIndex, endIndex));
                str = str.substring(endIndex+1);

                contacts.add(new Contact(name, address, pNum));
            }
            System.out.println("Read successfully");
            reader.close();
        }catch (IOException e) {
            catchException(e);
        }
    }
    
    public static void catchException(Exception e){
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}
