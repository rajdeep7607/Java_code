import java.util.*;

public class Evil_odious{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        int count=0;
        int temp=n;
        while(temp>0){
            if(temp%2!=0){
                count+=1;
            }
            temp=temp/2;
        }
        if(count%2==0){
            System.out.println(n+ " is a evil number.");
        }
        else{
            System.out.println(n+" is a Odious number.");
        }
    }
}