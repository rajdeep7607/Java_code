public class Chocolates {
    public static int calculateDays(int chocolates, int wrappers) {
        int totalDays = 0;


        while (chocolates > 0) {

            totalDays += chocolates;
            wrappers += chocolates;
            chocolates = wrappers / 7;
            wrappers = wrappers % 7;
        }

        return totalDays;
    }

    public static void main(String[] args) {

        System.out.println(calculateDays(0, 6)); 
        System.out.println(calculateDays(11, 50)); 
    }
}
