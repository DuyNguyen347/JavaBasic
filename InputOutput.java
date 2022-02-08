import java.util.Scanner;

// import javax.naming.directory.SchemaViolationException;

// import org.xml.sax.SAXNotRecognizedException;

public class InputOutput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you");
        int age = scanner.nextInt();

        System.out.println("Hey " + name);
        System.out.println("You are " + age);
        scanner.close();
    }
    
}
