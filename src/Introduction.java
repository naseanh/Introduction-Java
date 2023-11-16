import java.util.Date;

public class Introduction {
    private static String generateFullName(String firstName, String lastName, char middleInitial){
        return firstName + " " + middleInitial + ". " + lastName;
    }

    public static String generateMessage(){
        char MIDDLE_INITIAL = 'L';
        String LAST_NAME = "Hicks";
        String FIRST_NAME = "NaSean";
        String fullName = generateFullName(FIRST_NAME, LAST_NAME, MIDDLE_INITIAL);
        Date date = new Date();
        int YEARS_OF_PUBLIC_SERVICE = 22;

        return "Hello, today is " + date + "!  My name is " + fullName + ". I have served the public for " + YEARS_OF_PUBLIC_SERVICE + " years.";
    }
    public static void main(String[] args) {
        System.out.println(generateMessage());
        //End program.

    }
}
