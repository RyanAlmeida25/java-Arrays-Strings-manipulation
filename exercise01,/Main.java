public class Main {
    public static String getClassStats(int[] grades) {
        double average = 0;
        int nums = 0;
        int highest = grades[0];
        int lower = grades[0];
        int passing = 0;

        for(int i = 0; i < grades.length; i++){
            nums += grades[i];
            if(grades[i] > highest){
                highest = grades[i];
            }
            if(grades[i] < lower){
                lower = grades[i];
            }

            if(grades[i] > 60){
                passing++;
            }
        }

        average = (double) nums / grades.length;

        return "Class Average: " + average +
       "\nHighest Grade: " + highest +
       "\nLowest Grade: " + lower +
       "\nPassing Grades: " + passing + "/" + grades.length;
    }
    
    public static String getLetterGrades(int[] grades) {
        // Escreva seu código aqui
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;

        for(int i = 0; i < grades.length; i++){
            if(grades[i] >= 90){
                A++;
            }else if(grades[i] >= 80 && grades[i] < 90){
                B++;
            }else if(grades[i] >= 70 && grades[i] < 80){
                C++;
            }else if(grades[i] >= 60 && grades[i] < 70){
                D++;
            }else{
                F++;
            }
        }

        return "A (90-100): " + A +
       "\nB (80-89): " + B +
       "\nC (70-79): " + C +
       "\nD (60-69): " + D +
       "\nF (0-59): " + F;

    }
    
    public static String getImprovement(int[] start, int[] end) {


        int calc = 0;
        int sum = 0;

        double averegeimprovement = 0;
        int mostImprovement = 0;
        int studentsImproved = 0;

        for(int i = 0; i < start.length; i++){
            calc = end[i] - start[i];
            sum += calc;

            if(mostImprovement < calc){
                mostImprovement = calc;
            }

            if(calc > 0){
                studentsImproved++;
            }

        }
        
        averegeimprovement = (double) sum / start.length;



        return "Average Improvement: " + averegeimprovement + " points" +
        "\nMost Improved: " + mostImprovement + " points" +
        "\nStudents Improved: " + studentsImproved + "/" + start.length;
    }
    

        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};
        

        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));
        

        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));
        

        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));
    }
}
