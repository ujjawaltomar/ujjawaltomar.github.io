 class  Pen {
     String color;
     String type;

     public void write() {
         System.out.println("Writing something");
     }

     public void printColor() {
         System.out.println(this.color);
     }
 }
 class Student{
    String name;
    int age;
    public  void printInfo(){
        System.out.println(this.name);
    }
 }




public class OOPS {
    public static void main(String args[]){


      //  Pen pen1 = new Pen();
        //pen1.color = "blue";
      //  pen1.type="gel";
        //pen1.write();


       // Pen pen2 = new Pen();
      //  pen2.color="black";
        //pen2.type="ballpoint";


      //  pen1.printColor();
     //pen2.printColor();
        Student s1 = new Student();
        s1.name="ujjwal";
        s1.age=22;
        s1.printInfo();
    }
}
