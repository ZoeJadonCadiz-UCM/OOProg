import java.util.Scanner;

public class BSCE {

    public static boolean start(Scanner scanner) {
        String courseName = "Bachelor of Science in Civil Engineering (BSCE)";
        String description = "The Bachelor of Science in Civil Engineering (BSCE) focuses on designing, constructing, and maintaining infrastructure projects like buildings, roads, bridges, and water systems. Students learn structural analysis, construction management, and materials science.";

        String[] skills = {
            "Strong analytical and problem-solving skills",
            "Mathematics and physics proficiency",
            "Creativity in design and planning",
            "Attention to detail",
            "Ability to work in teams and communicate effectively"
        };

        String salary = "Entry-level: P25,000 - P40,000 per month\nWith experience: P50,000 - P100,000 or more";

        String[] universities = {
            "Technological Institute of the Philippines (TIP)",
            "University of the Philippines Diliman",
            "Mapúa University",
            "De La Salle University",
            "University of Santo Tomas",
            "University of San Carlos",
            "Cebu Technological University",
            "Mindanao State University - Iligan Institute of Technology"
        };

        String[] requirements = {
            "Grade 12 Report Card, Certificate of Good Moral Character",
            "High School Academic Records, Entrance Exam Result",
            "High School Form 138 & 137, Certificate of Good Moral Character",
            "High School Academic Records, Online Application Form",
            "High School Academic Records, Admission Exam",
            "High School Diploma, Certificate of Good Moral Character",
            "High School Diploma, Transcript of Records",
            "High School Diploma, Admission Test Result"
        };

        String[] otherRequirements = {
            "Birth certificate, 2x2 ID Picture",
            "Birth certificate, ID photo",
            "Birth certificate, Medical Clearance",
            "Birth certificate, ID photos",
            "Birth certificate, ID photo",
            "Birth certificate, 2x2 photo",
            "Birth certificate, 2x2 photo",
            "Birth certificate, 2x2 photo"
        };

        String[] tuition = {
            "P50,000 - P100,000 per semester",
            "P35,000 - P50,000 per semester",
            "P45,000 - P95,000 per semester",
            "P60,000 - P110,000 per semester",
            "P40,000 - P80,000 per semester",
            "P30,000 - P60,000 per semester",
            "P20,000 - P40,000 per semester",
            "P15,000 - P35,000 per semester"
        };

        String[] scholarships = {
            "TIP Academic Scholarship, Engineering Merit Scholarship",
            "UP Academic Scholarship, Government Educational Assistance",
            "Mapúa Academic Scholarship, Engineering Entrance Scholarship",
            "DLSU Academic Scholarship, Need-Based Financial Assistance",
            "UST Academic Scholarship, Merit-Based Grants",
            "USC Academic Scholarship, Dean's List Grant",
            "CTU Academic Scholarship, Merit-Based Financial Assistance",
            "MSU-IIT Academic Scholarship, Government Educational Assistance"
        };

        return CourseTemplate.startCourse(scanner, courseName, description, skills, salary, universities, requirements, otherRequirements, tuition, scholarships);
    }
}
