import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your day of birth: ");
        int dayOfBirth = scanner.nextInt();

        System.out.println("Enter your month of birth: ");
        int monthOfBirth = scanner.nextInt();

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        Calendar todayCalendar = Calendar.getInstance();
        Calendar birthCalendar = Calendar.getInstance();

        birthCalendar.set(yearOfBirth, monthOfBirth - 1, dayOfBirth);

        int age = todayCalendar.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR);

        if (todayCalendar.get(Calendar.DAY_OF_YEAR) < birthCalendar.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        System.out.println("Your age is: " + age + " years");
        scanner.close();
    }
}
