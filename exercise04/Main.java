import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int donationId = scanner.nextInt();
        double dailySpending = scanner.nextDouble();
        int shelfCode = scanner.nextInt();
        
        
        String donationFormated = String.valueOf(donationId);
        int[] formatToInt = new int[donationFormated.length()];
        int sum = 0;
        
        

        for(int i = 0; i < donationFormated.length(); i++){
            char c = donationFormated.charAt(i);
            int cFormated = c - '0';
            double powerResult = Math.pow(cFormated, i + 1);
            
            sum += (int) powerResult;
            
        }
         if(sum == donationId){
             System.out.println("Priority");
         }else{
             System.out.println("Standard");
        }
        
        
        double monthSpent = dailySpending * 30;
        
        System.out.printf("%.2f%n", monthSpent);
        
        
        
        String shelfCodeFormated = String.valueOf(shelfCode);
        

        char ch = shelfCodeFormated.charAt(1);
        int chFormated = ch - '0';
        
        if(chFormated % 2 == 0){
            System.out.println("Refrigerated");
        }else{
            System.out.println("Dry Storage");
        }
        
        scanner.close();
    }
}
