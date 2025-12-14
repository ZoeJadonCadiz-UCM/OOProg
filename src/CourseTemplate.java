import java.util.Scanner;

public class CourseTemplate {

    public static boolean startCourse(Scanner scanner, String courseName, String description, String[] skills, String salary, String[] universities, String[] requirements, String[] otherRequirements, String[] tuition, String[] scholarships) {
        System.out.println("\nYou chose " + courseName);
        System.out.println("\nDescription:\n" + description);
        System.out.println("\nSkills Needed:");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }
        System.out.println("\nAverage Salary in the Philippines:\n" + salary);

        // ask if user likes the program
        String likeProgram;
        while (true) {
            System.out.print("\nDo you like this program? (YES or NO): ");
            likeProgram = scanner.nextLine().trim().toLowerCase();
            if (likeProgram.equals("yes") || likeProgram.equals("no")) break;
            System.out.println("Please enter YES or NO only.");
        }

        if (likeProgram.equals("no")) {
            System.out.println("\nNo worries! You can choose another program.");
            return true;
        }

        // ask if use wants to see universities
        String interestedUni;
        while (true) {
            System.out.print("\nAre you interested in suggested universities offering this course? (YES or NO): ");
            interestedUni = scanner.nextLine().trim().toLowerCase();
            if (interestedUni.equals("yes") || interestedUni.equals("no")) break;
            System.out.println("Please enter YES or NO only.");
        }

        if (interestedUni.equals("no")) {
            System.out.println("\nAlright! You have plenty of programs to choose from.");
            return true;
        }

        // display ang mga universities
        System.out.println("\nSuggested Universities Offering " + courseName + ":");
        for (int i = 0; i < universities.length; i++) {
            System.out.println((i + 1) + ". " + universities[i]);
        }

        int uniChoice;
        while (true) {
            System.out.print("\nSelect a university (1-" + universities.length + "): ");
            if (scanner.hasNextInt()) {
                uniChoice = scanner.nextInt();
                scanner.nextLine();
                if (uniChoice >= 1 && uniChoice <= universities.length) break;
            } else {
                scanner.nextLine();
            }
            System.out.println("Please enter a valid number between 1 and " + universities.length + ".");
        }

        int index = uniChoice - 1;
        System.out.println("\nYou selected: " + universities[index]);
        System.out.println("\nAdmission Requirements: " + requirements[index]);
        System.out.println("Other Requirements: " + otherRequirements[index]);
        System.out.println("Tuition Fee Estimate: " + tuition[index]);
        System.out.println("Scholarship Offers: " + scholarships[index]);

        String proceed;
        while (true) {
            System.out.print("\nDo you want to proceed with research/admission for this university? (YES or NO): ");
            proceed = scanner.nextLine().trim().toLowerCase();
            if (proceed.equals("yes") || proceed.equals("no")) break;
            System.out.println("Please enter YES or NO only.");
        }

        if (proceed.equals("no")) {
            System.out.println("\nNo problem! You can research or apply later.");
            return ReturntoCourseList.askReturnToCourses(scanner);
        }

        System.out.println("\nGreat! We will help you with research and admission details for " + universities[index] + ".");
        return ReturntoCourseList.askReturnToCourses(scanner);
    }
}
