
/*
Create a program that processes course information. Create three methods that handle different aspects of string processing:

    Create the method `formatCourseInfo` that:
        Receives a course string such as "MATH101:Algebra:Monday,Wednesday:9AM"
        Splits it by ":" and returns a formatted string:

    Course Code: MATH101
    Course Name: Algebra
    Days: Monday,Wednesday
    Time: 9AM

    Create the method `createCourseList` that:
        Receives an array of course codes: ["MATH101", "ENG202", "HIST101"]
        Creates a comma-separated list and returns:

    Available Courses: MATH101, ENG202, HIST101

    Create the method `formatSchedule` that:
        Receives a string of days: "Monday,Wednesday,Friday"
        Splits it by commas and joins the parts with " | "
        Returns: "Monday | Wednesday | Friday"*



*/
public class Main {

    public static String formatCourseInfo(String curso){
        String[] texto = curso.split(":");
        
        return "Course Code: " + texto[0] +
               "\nCourse Name: " + texto[1] +
               "\nDays: " + texto[2] +
               "\nTime: " + texto[3];
    }

    public static String createCourseList(String[] curso){
        String texto = String.join(", ", curso);


        return "Available Courses: " + texto;
    }   

    public static String formatSchedule(String dias){
        String[] texto = dias.split(",");
        String textoFormatado = String.join(" | ", texto);

        return textoFormatado;
    }
    
    
    public static void main(String[] args) {

        String courseInfo = "MATH101:Algebra:Monday,Wednesday:9AM";
        String[] courseCodes = {"MATH101", "ENG202", "HIST101"};
        String days = "Monday,Wednesday,Friday";
        

        System.out.println("Course Information:");
        System.out.println(formatCourseInfo(courseInfo));
        
        System.out.println("\nCourse List:");
        System.out.println(createCourseList(courseCodes));
        
        System.out.println("\nSchedule Format:");
        System.out.println(formatSchedule(days));
    }
}
