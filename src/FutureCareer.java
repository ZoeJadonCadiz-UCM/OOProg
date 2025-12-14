import java.util.Scanner;

public class FutureCareer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        while (true) {
            System.out.print("Do you want to see your future career? (YES or NO): ");
            answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("yes") || answer.equals("no")) break;
            System.out.println("Please enter YES or NO only.\n");
        }

        if (answer.equals("no")) {
            System.out.println("That's okay! Your future is still up to you.");
            scanner.close();
            return; 
        }

        boolean continueChoosing = true;

        while (continueChoosing) {
            System.out.println("\nPlease choose your future career:");
            System.out.println("1. Bachelor of Science in Information Technology (BSIT)");
            System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
            System.out.println("3. Bachelor of Science in Civil Engineering (BSCE)");
            System.out.println("4. Bachelor of Science in Nursing (BSN)");
            System.out.println("5. Bachelor of Secondary Education (BSEd)");
            System.out.println("6. Bachelor of Science in Hospitality Management (BSHM)");
            System.out.println("7. Bachelor of Science in Entrepreneurship (BSE)");
            System.out.println("8. Bachelor of Science in Customs Administration (BSCA)");
            System.out.println("9. Bachelor of Science in Marine Transportation");
            System.out.println("10. Bachelor of Science in Business Administration (BSBA)");
            System.out.println("11. Bachelor of Science in Accountancy (BSA)");
            System.out.println("12. Bachelor of Science in Psychology");

            int choice;

            while (true) {
                System.out.print("\nEnter your choice (1 - 12): ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine(); // clear buffer
                    if (choice >= 1 && choice <= 12) break;
                } else {
                    scanner.nextLine();
                }
                System.out.println("Your selection doesn't match the existing choices.");
            }

            switch (choice) {
                case 1:
                    continueChoosing = BSIT.start(scanner);
                    break;
                case 2:
                    continueChoosing = BSCS.start(scanner);
                    break;
                case 3:
                    continueChoosing = BSCE.start(scanner);
                    break;
                case 4:
                    continueChoosing = BSN.start(scanner);
                    break;
                case 5:
                    continueChoosing = BSEd.start(scanner);
                    break;
                case 6:
                    continueChoosing = BSHM.start(scanner);
                    break;
                case 7:
                    continueChoosing = BSE.start(scanner);
                    break;
                case 8:
                    continueChoosing = BSCA.start(scanner);
                    break;
                case 9:
                    continueChoosing = BSMT.start(scanner);
                    break;
                case 10:
                    continueChoosing = BSBA.start(scanner);
                    break;
                case 11:
                    continueChoosing = BSA.start(scanner);
                    break;
                case 12:
                    continueChoosing = BSPSY.start(scanner);
                    break;
            }
        }

        System.out.println("\nThank you for using the program!");
        scanner.close();
    }
}
