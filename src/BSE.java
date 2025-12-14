import java.util.Scanner;

public class BSE {

    public static boolean start(Scanner scanner) {
        String courseName = "Bachelor of Science in Entrepreneurship (BSE)";
        String description = "BSE trains students to start and manage their own businesses. "
                + "The program covers business planning, marketing, finance, and innovation management.";

        String[] skills = {
                "Leadership and decision-making",
                "Financial management",
                "Marketing and sales",
                "Problem-solving",
                "Networking and negotiation"
        };

        String salary = "Entry-level: P20,000 - P30,000 per month\nWith experience: P50,000 - P100,000+ per month";

        String[] universities = {
                "Ateneo de Manila University",
                "De La Salle University",
                "University of the Philippines - Diliman",
                "AMA Computer University",
                "STI College",
                "University of Cebu",
                "Far Eastern University",
                "Lyceum of the Philippines University"
        };

        String[] requirements = {
                "High School Diploma, Entrance Exam, Interview",
                "High School Academic Records, Admission Exam",
                "High School Diploma, NSAT, Interview",
                "High School Diploma, Admission Exam",
                "High School Diploma, Entrance Exam",
                "High School Diploma, Admission Exam",
                "High School Academic Records, Entrance Exam",
                "High School Diploma, Admission Exam"
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
                "P90,000 - P120,000 per semester",
                "P95,000 - P110,000 per semester",
                "P50,000 - P100,000 per semester",
                "P20,000 - P30,000 per semester",
                "P20,000 - P32,000 per semester",
                "P40,000 - P80,000 per semester",
                "P30,000 - P60,000 per semester",
                "P30,000 - P60,000 per semester"
        };

        String[] scholarships = {
                "Ateneo Academic Scholarship, Need-Based Grants",
                "DLSU Academic Scholarship, Merit-Based Grants",
                "UP Academic Scholarship, Government Grants",
                "AMA Academic Scholarship, Merit-Based Assistance",
                "STI Academic Scholarship, Merit-Based Assistance",
                "UC Academic Scholarship, Need-Based Assistance",
                "FEU Academic Scholarship, Merit-Based Grants",
                "Lyceum Academic Scholarship, Merit-Based Grants"
        };

        return CourseTemplate.startCourse(scanner, courseName, description, skills, salary, universities, requirements, otherRequirements, tuition, scholarships);
    }
}
