import java.util.*;
public class Angry_proffesor {
    public static void main(String[] args) {
        
        int temp=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]<=0){
                temp+=1;
            }

        }
        if(temp>=k){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
    }
