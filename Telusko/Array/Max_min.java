public class Max_min {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,7,6,8};
        int max=0 , min=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println(max);
        System.out.println(min);
    }
}
