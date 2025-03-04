/*class Student {

    int rollno;
    String name;

}
public class For_each {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 167;
        s1.name = "Rajdeep";

        Student s2 = new Student();
        s2.rollno = 60;
        s2.name = "Asad";

        Student s3 = new Student();
        s3.rollno = 14;
        s3.name = "Aryan";

        Student stdu[] = new Student[3];
        stdu[0]=s1;
        stdu[1]=s2;
        stdu[2]=s3;
        
        for(Student std : stdu){
            System.out.println(std.name +" : " +std.rollno);
        }
    }
}
*/

//Int

class For_each{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        for(int num : arr){
            System.out.println(num);
        }
    }
}