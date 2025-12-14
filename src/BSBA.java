import java.util.Scanner;

public class BSBA {

    public static boolean start(Scanner scanner) {
        String courseName = "Bachelor of Science in Business Administration (BSBA)";
        String description = "BSBA trains students in business management, finance, marketing, and entrepreneurship. "
                + "Students learn leadership, decision-making, and problem-solving skills for business careers.";

        String[] skills = {
                "Leadership and management",
                "Financial analysis",
                "Marketing skills",
                "Problem-solving",
                "Communication and teamwork"
        };

        String salary = "Entry-level: P18,000 - P28,000 per month\nWith experience: P35,000 - P80,000+ per month";

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
