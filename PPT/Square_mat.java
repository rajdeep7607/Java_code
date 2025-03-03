import java.util.Scanner;
public class Square_mat {
    public static void main(String[] args) {

        int leftSum=0;
        int rightSum=0;
        int totalSum;
        Scanner sc = new Scanner(System.in);


        int[][] matrix = new int[4][4];

    
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < 4; i++) {
            leftSum += matrix[i][i];
            rightSum += matrix[i][3 - i]; 
        }
        totalSum=leftSum + rightSum;
        System.out.println(totalSum);
    }
}