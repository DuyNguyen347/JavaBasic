
public class Object {
    public static void main(String[] args){
        //Object obj = new Object();
        //smartPhone phone = obj.new smartPhone("Redmi K30","Xiaomi",2020,3000.0);
        smartPhone phone = new smartPhone("Redmi K30","Xiaomi",2020,3000.0);
        phone.infor();
        smartPhone phone2 = new smartPhone("Note 10","Xiaomi",2021);
        // price = 0 ( if price is string then price = null)
        phone2.infor();
        System.out.println(phone);
        Redmi redmi = new Redmi("K40","xiaomi",2019,3001,4,"750G");
        System.out.println("Sub class");
        System.out.println(redmi.toString());
    }
    // note : declare STATIC or add Object obj = new Object(); int main
    public static class smartPhone{
        String name;
        String nameCompany;
        int year;
        double price;
        smartPhone(){

        }
        smartPhone(String name,String nameCompany,int year){
            this.name = name;
            this.nameCompany = nameCompany;
            this.year = year;
        }
        smartPhone(String name,String nameCompany,int year,double price){
            this.name = name;
            this.nameCompany = nameCompany;
            this.year = year;
            this.price = price;
        }
        public String toString(){
            return name + "\n" + nameCompany + "\n" + year + "\n" + price; 
        }
        void infor(){
            System.out.println("This smartphone is " + this.name + " of " + this.nameCompany);
            System.out.println("Year is " + this.year + " and price is " + this.price);
        }
    }
    public static class Redmi extends smartPhone{
        int ram ;
        String chip;
        Redmi(){

        }
        Redmi(String name,String nameCompany,int year,double price,int ram,String chip){
            super(name,nameCompany,year,price);
            this.ram = ram;
            this.chip = chip;
        }
        public String toString(){
            return super.toString() + this.ram + "\n" + this.chip;
        }
    }
}

