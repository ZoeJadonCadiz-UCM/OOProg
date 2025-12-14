import java.util.Scanner;

public class BSA {

    public static boolean start(Scanner scanner) {
        String courseName = "Bachelor of Science in Accountancy (BSA)";
        String description = "BSA trains students in accounting, auditing, taxation, and finance. "
                + "Graduates can become accountants, auditors, and financial analysts.";

        String[] skills = {
                "Numerical and analytical skills",
                "Attention to detail",
                "Problem-solving",
                "Ethical judgment",
                "Time management"
        };

        String salary = "Entry-level: P20,000 - P30,000 per month\nWith experience: P40,000 - P80,000+ per month";

        String[] universities = {
                "University of the Philippines - Diliman",
                "Ateneo de Manila University",
                "De La Salle University",
                "Far Eastern University",
                "University of Santo Tomas",
                "AMA Computer University",
                "STI College",
                "University of Cebu"
        };

        String[] requirements = {
                "High School Diploma, Entrance Exam, Interview",
                "High School Academic Records, Admission Exam",
                "High School Diploma, Admission Exam",
                "High School Academic Records, Entrance Exam",
                "High School Academic Records, Admission Exam",
                "High School Diploma, Admission Exam",
                "High School Diploma, Entrance Exam",
                "High School Diploma, Admission Exam"
        };

        String[] otherRequirements = {
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, ID photo",
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo",
                "Birth certificate, 2x2 photo"
        };

        String[] tuition = {
                "P50,000 - P100,000 per semester",
                "P95,000 - P110,000 per semester",
                "P90,000 - P120,000 per semester",
                "P30,000 - P60,000 per semester",
                "P40,000 - P80,000 per semester",
                "P20,000 - P30,000 per semester",
                "P20,000 - P32,000 per semester",
                "P40,000 - P80,000 per semester"
        };

        String[] scholarships = {
                "UP Academic Scholarship, Government Grants",
                "Ateneo Academic Scholarship, Merit-Based Grants",
                "DLSU Academic Scholarship, Merit-Based Grants",
                "FEU Academic Scholarship, Need-Based Grants",
                "UST Academic Scholarship, Merit-Based Assistance",
                "AMA Academic Scholarship, Merit-Based Grants",
                "STI Academic Scholarship, Merit-Based Assistance",
                "UC Academic Scholarship, Need-Based Assistance"
        };

        return CourseTemplate.startCourse(scanner, courseName, description, skills, salary, universities, requirements, otherRequirements, tuition, scholarships);
    }
}
