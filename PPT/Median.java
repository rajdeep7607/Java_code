import java.util.Arrays;
import java.util.Scanner;
public class Median {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int midIndex = a.length / 2;
        int median=a[midIndex];
        
        System.out.println(median);
    }
}
