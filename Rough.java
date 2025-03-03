public class Rough {
    
        public static void main(String[] args) {
            String name1 = "Alice";
            String name2 = "Bob";
            String name3 = "Charlie";
            int num=90;
            // Left-justify using %15s (with a negative sign to left-align)
            System.out.printf("%15s%d is a student\n", name1,num);
            System.out.printf("%-15s is a student\n", name2);
            System.out.printf("%-15s is a student\n", name3);
        }
    }
    
