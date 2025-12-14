import java.util.Scanner;

public class BSCA {

    public static boolean start(Scanner scanner) {
        String courseName = "Bachelor of Science in Customs Administration (BSCA)";
        String description = "BSCA prepares students for careers in customs, import/export, and trade compliance. "
                + "The program covers customs laws, import/export regulations, logistics, and business management.";

        String[] skills = {
                "Knowledge of customs and trade laws",
                "Attention to detail",
                "Analytical and problem-solving skills",
                "Communication and negotiation",
                "Organizational skills"
        };

        String salary = "Entry-level: P18,000 - P28,000 per month\nWith experience: P35,000 - P60,000+ per month";

        String[] universities = {
                "Philippine School of Customs Administration",
                "AMA Computer University",
                "STI College",
                "University of Cebu",
                "Far Eastern University",
                "University of Mindanao",
                "Lyceum of the Philippines University",
                "Technological Institute of the Philippines (TIP)"
        };

        String[] requirements = {
                "High School Diploma, Entrance Exam, Interview",
                "High School Diploma, Admission Exam",
                "High School Diploma, Entrance Exam",
                "High School Diploma, Admission Exam",
                "High School Academic Records, Entrance Exam",
                "High School Diploma, Entrance Exam",
                "High School Diploma, Admission Exam",
                "Grade 12 Report Card, Entrance Exam"
        };

        String[] otherRequirements = {
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "PSA Birth Certificate, 2x2 ID"
        };

        String[] tuition = {
                "P25,000 - P45,000 per semester",
                "P20,000 - P30,000 per semester",
                "P20,000 - P32,000 per semester",
                "P40,000 - P80,000 per semester",
                "P30,000 - P60,000 per semester",
                "P20,000 - P40,000 per semester",
                "P25,000 - P50,000 per semester",
                "P60,000 - P120,000 per semester"
        };

        String[] scholarships = {
                "Merit-Based Scholarship, Government Assistance",
                "AMA Academic Scholarship, Merit-Based Grants",
                "STI Academic Scholarship, Merit-Based Grants",
                "UC Academic Scholarship, Need-Based Grants",
                "FEU Academic Scholarship, Merit-Based Grants",
                "UM Academic Scholarship, Merit-Based Grants",
                "Lyceum Academic Scholarship, Merit-Based Grants",
                "TIP Academic Scholarship, Merit-Based Grants"
        };

        return CourseTemplate.startCourse(scanner, courseName, description, skills, salary, universities, requirements, otherRequirements, tuition, scholarships);
    }
}
