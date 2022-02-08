import java.util.ArrayList;
public class StringVsArrayString {
    public static void main(String[] args){
        // way 1: can't modified number of element , less flexiable
        // String[] animals = new String[4];
        // animals[0] = "cat";
        // animals[1] = "dog";
        // animals[2] = "bird";
        // animals[3] = "fish";
        // animals[4] = "dragon";
        // for(int i=0;i<animals.length;i++){
        //     System.out.println(animals[i]);
        // }
        // way 2 : arraylist , more flexiable
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");
        animals.add("fish");
        animals.add("dragon");
        for(int i=0;i<animals.size();i++){
            System.out.println(animals.get(i));
        }
        // or : for each
        for(String i : animals){
            System.out.println(i);
        }
    }
}
