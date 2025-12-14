import java.util.Scanner;

public class BSMT {

    public static boolean start(Scanner scanner) {
        String courseName = "Bachelor of Science in Marine Transportation (BSMT)";
        String description = "BSMT prepares students for careers in shipping, navigation, and maritime operations. "
                + "The program covers navigation, ship operations, safety at sea, and maritime laws.";

        String[] skills = {
                "Navigation and maritime knowledge",
                "Problem-solving skills",
                "Leadership and teamwork",
                "Physical fitness and endurance",
                "Attention to detail"
        };

        String salary = "Entry-level: P20,000 - P35,000 per month\nWith experience: P50,000 - P100,000+ per month";

        String[] universities = {
                "Philippine Merchant Marine Academy (PMMA)",
                "University of Cebu Maritime College",
                "STI College Maritime Program",
                "AMA Computer University Maritime Program",
                "Ateneo de Manila University Maritime Studies",
                "Maritime Academy of Asia and the Pacific (MAAP)",
                "Lyceum of the Philippines University",
                "Technological Institute of the Philippines"
        };

        String[] requirements = {
                "High School Diploma, Entrance Exam, Medical Certificate",
                "High School Diploma, Admission Exam, Medical Clearance",
                "High School Diploma, Entrance Exam",
                "High School Diploma, Admission Exam",
                "High School Diploma, Admission Exam",
                "High School Diploma, Entrance Exam, Physical Fitness Test",
                "High School Diploma, Admission Exam",
                "High School Diploma, Admission Exam"
        };

        String[] otherRequirements = {
                "Birth certificate, 2x2 ID photo, Medical Certificate",
                "Birth certificate, 2x2 ID photo, Medical Clearance",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo, Medical Certificate",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo"
        };

        String[] tuition = {
                "P40,000 - P80,000 per semester",
                "P40,000 - P70,000 per semester",
                "P20,000 - P32,000 per semester",
                "P20,000 - P30,000 per semester",
                "P98,000 - P104,000 per semester",
                "P45,000 - P90,000 per semester",
                "P30,000 - P60,000 per semester",
                "P60,000 - P120,000 per semester"
        };

        String[] scholarships = {
                "PMMA Academic Scholarship, Government Maritime Assistance",
                "UC Merit-Based Scholarship",
                "STI Academic Scholarship",
                "AMA Academic Scholarship",
                "Ateneo Merit-Based Scholarship",
                "MAAP Scholarship Programs",
                "Lyceum Merit-Based Scholarship",
                "TIP Academic Scholarship"
        };

        return CourseTemplate.startCourse(scanner, courseName, description, skills, salary, universities, requirements, otherRequirements, tuition, scholarships);
    }
}
