import java.util.Scanner;

public class Main {
    public static double[] calculateStats(int[] arr) {
        double[] result = new double[4];

        int sum = 0;

        for(int i : arr){
            sum += i;

        }


        double Average = (double) sum / arr.length;

        int Maximum = arr[0];
        int Minimum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > Maximum){
                Maximum = arr[i];
            }
        }


        for(int i = 1; i < arr.length; i++){
            if(arr[i] < Minimum){
                Minimum = arr[i];
            }
        }

        result[0] = sum;
        result[1] = Average;
        result[2] = Maximum;
        result[3] = Minimum;


        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arrString = text.split(",");
        int[] numbers = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
           numbers[i] = Integer.parseInt(arrString[i]);
        }
        double[] stats = calculateStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        System.out.println("Minimum: " + stats[3]);
    }
}
