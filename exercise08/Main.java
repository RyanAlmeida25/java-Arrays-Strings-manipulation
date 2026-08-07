/*
Create a program that helps prepare eye-catching yard sale signs. Read a sign text and print it with all letters toggled (uppercase becomes lowercase and vice versa), then print how many spaces it contains. Finally, read the day's forecasted high and low temperatures and print the temperature range to help plan for shade.


*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String signText = scanner.nextLine();
        String result = "";
        int spaces = 0;
        

        for (int i = 0; i < signText.length(); i++){
            char c = signText.charAt(i);

            if(Character.isUpperCase(c)){
                result += Character.toLowerCase(c);
            }else if (Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            }else{
                result += c;
            }

            if(c == ' '){
                spaces++;
            }
        }
        


        int highTemp = scanner.nextInt();
        

        int lowTemp = scanner.nextInt();
        

        int tempRange = highTemp - lowTemp;
        
        System.out.println(result);
        System.out.println(spaces);
        System.out.println(tempRange);
    }
}
