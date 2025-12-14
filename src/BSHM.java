import java.util.Scanner;

public class BSHM {

    public static boolean start(Scanner scanner) {
        String courseName = "Bachelor of Science in Hospitality Management (BSHM)";
        String description = "BSHM prepares students for careers in hotels, resorts, and tourism-related industries. "
                + "The program covers hotel operations, food and beverage management, event planning, and customer service.";

        String[] skills = {
                "Customer service and communication",
                "Organization and planning",
                "Problem-solving",
                "Leadership and teamwork",
                "Attention to detail"
        };

        String salary = "Entry-level: P15,000 - P25,000 per month\nWith experience: P30,000 - P60,000 or more";

        String[] universities = {
                "University of the Philippines - Diliman",
                "Ateneo de Manila University",
                "De La Salle-College of St. Benilde",
                "STI College",
                "AMA Computer University",
                "University of Cebu",
                "Cebu Technological University",
                "Lyceum of the Philippines University"
        };

        String[] requirements = {
                "High School Diploma, NSAT/Entrance Exam",
                "High School Academic Records, Interview",
                "High School Form 138 & 137, Certificate of Good Moral Character",
                "High School Academic Records, Entrance Exam",
                "High School Diploma, Admission Exam",
                "High School Diploma, Entrance Exam",
                "High School Diploma, Certificate of Good Moral Character",
                "High School Diploma, Entrance Exam"
        };

        String[] otherRequirements = {
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, ID photo",
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo"
        };

        String[] tuition = {
                "P40,000 - P80,000 per semester",
                "P98,000 - P104,000 per semester",
                "P50,000 - P90,000 per semester",
                "P20,000 - P32,000 per semester",
                "P20,000 - P30,000 per semester",
                "P40,000 - P80,000 per semester",
                "P20,000 - P40,000 per semester",
                "P30,000 - P60,000 per semester"
        };

        String[] scholarships = {
                "UP Academic Scholarship, Merit-Based Grants",
                "Ateneo Academic Scholarship, Need-Based Assistance",
                "DLS-CSB Academic Scholarship, Merit-Based Grants",
                "STI Academic Scholarship, Merit-Based Grants",
                "AMA Academic Scholarship, Merit-Based Grants",
                "UC Academic Scholarship, Need-Based Assistance",
                "CTU Academic Scholarship, Merit-Based Grants",
                "Lyceum Academic Scholarship, Merit-Based Grants"
        };

        return CourseTemplate.startCourse(scanner, courseName, description, skills, salary, universities, requirements, otherRequirements, tuition, scholarships);
    }
}
