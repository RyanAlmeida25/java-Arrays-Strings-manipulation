public class Main {
    public static String checkLength(String userName){
        int lengthUser = userName.length();
        boolean isLong = false;
        if(lengthUser >= 6){
            isLong = true;
        }
        return "Username length: " + lengthUser + "\n"
            +  "Long enough: " + isLong;
    }

    public static String checkStart(String userName){
        boolean user_ = false;
        boolean admin_ = false;

        if(userName.startsWith("user_")){
            user_ = true;
        }
        if(userName.startsWith("admin_")){
            admin_ = true;
        }

        return "Starts with user_: " + user_ + "\n" +
               "Starts with admin_: " + admin_;
    }

    public static String modifyUsername(String userName){
        String sub = userName.substring(0,5);
        String sub2 = sub.toUpperCase();

        return "First 5 chars: " + sub + "\n" +
               "Uppercase: " + sub2;
    }
    
    
    public static void main(String[] args) {
        String username = "user_123admin";
        
        System.out.println("Length Check:");
        System.out.println(checkLength(username));
        
        System.out.println("\nPrefix Check:");
        System.out.println(checkStart(username));
        
        System.out.println("\nModified Username:");
        System.out.println(modifyUsername(username));
    }
}
