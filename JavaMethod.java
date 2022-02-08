import java.util.Scanner;

public class JavaMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = sc.nextLine();
        hello(name);
        sc.close();
    }
    static void hello(String name) {
        System.out.println("Hello " + name);
    }
}

