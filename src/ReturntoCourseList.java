import java.util.Scanner;

public class ReturntoCourseList {

    // ask if they want to return to list of courses
    public static boolean askReturnToCourses(Scanner scanner) {
        String returnList;
        while (true) {
            System.out.print("\nDo you want to return to the list of courses? (YES or NO): ");

            returnList = scanner.nextLine().trim().toLowerCase();

            if (returnList.equals("yes")) return true;
            if (returnList.equals("no")) return false;
            
            System.out.println("Please enter YES or NO only.");
        }
    }
}
