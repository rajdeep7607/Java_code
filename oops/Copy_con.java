class Student{

    String name;
    int age;

    public void printinfo(){

        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){

    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;

    }
}

public class Copy_con{
    public static void main(String[] args){

        
        Student std1=new Student();
        std1.name="Rajdeep";
        std1.age=20;
        std1.printinfo();

        Student std2=new Student(std1);
        std2.printinfo();
        
    }
}