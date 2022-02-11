public class javaStart {
    public static void main(String[] args){
        System.out.println("Hello, I am Duy from Da Nang");
        System.out.println("I am 21 years old");
        // sysout
        int x =122;
        System.out.println("MY number is : " +x);
        float y = 3.112f;
        System.out.println(y);
        boolean z = false;
        System.out.println(z);
        for(int i=0;i<=5;i++){
            System.out.println();
            for(int j=0;j<5;j++)
            System.out.print("%");
        }
        System.out.println();
        // array
        String[] cars = {"Tesla","Vin","BMW"} ;
        // or String[] cars = new String[3];
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
        //2D array
        System.out.println();
        String[][] Cars = new String[2][2];
        Cars[0][0] = "Ranger";
        Cars[0][1] = "Vin";
        Cars[1][1] = "Tesla";
        Cars[1][0] = "lambo";
        for(int i=0;i<Cars.length;i++){
            System.out.println();
            for(int j=0;j<Cars[i].length;j++){
                System.out.print(Cars[i][j]+ " ");
            }
        }
        // final = const in C++ (can't update value)
        final double pi = 3.1432;
        System.out.println(pi);
    }
}