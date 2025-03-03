public class Sum {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,7,6,8};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int avg=sum/arr.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
