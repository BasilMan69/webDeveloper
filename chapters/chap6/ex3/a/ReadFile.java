package chapters.chap6.ex3.a;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;

public class ReadFile {
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("E:\\GitHub\\webDeveloper\\chapters\\chap6\\ex3\\a\\FileToRead.txt"));
            while(input.hasNext()){
                input.useDelimiter(Pattern.compile("[^a-zA-Z]"));
                String n = input.next();
                System.out.print(n + " ");
            }
            input.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        }
        

    }   
}
