import java.util.*;

public class Disarium {
        public static void main(String[] args)
        {    
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to check Disarium :");
            int n = sc.nextInt();
            int count = 0;
            int temp = n;
            int sumcount=0;
            if(n==0)
            {
                count=1;
            }
            else{
                while(temp>0)
                {
                    temp/=10;
                    count++;
                }
            }

    temp=n;
        
    while(temp>0)
    {
        int digit=temp % 10;
        sumcount += (int) Math.pow(digit, count);
        temp/=10;
        count--;
    }
    if (sumcount == n)
    {
        System.out.println(n + " is a Disarium number!!");
    } 
    else
    {
        System.out.println(n + " is not a Disarium number!!");
    }
}
}