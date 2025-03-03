class Student{

    String name;
    int age;

    public void printinfo(){

        System.out.println(this.name);
        System.out.println(this.age);
    }

    public Student(String name , int age){
        this.name=name;
        this.age=age;

    }
}

public class Oop{
    public static void main(String[] args){

        
        Student std1=new Student("Rajdeep",20);
        std1.printinfo();


        Student std2=new Student("Sweta",20);
        std2.printinfo();
        
    }
}