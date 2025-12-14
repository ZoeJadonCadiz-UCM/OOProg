import java.util.Scanner;

public class BSN {

    public static boolean start(Scanner scanner) {
        String courseName = "Bachelor of Science in Nursing (BSN)";
        String description = "The Bachelor of Science in Nursing (BSN) prepares students to become professional nurses. "
                + "The program covers patient care, anatomy, pharmacology, and clinical practice in hospitals and healthcare facilities.";

        String[] skills = {
                "Compassion and empathy",
                "Strong communication and interpersonal skills",
                "Critical thinking and problem-solving",
                "Attention to detail",
                "Ability to work under pressure"
        };

        String salary = "Entry-level: P18,000 - P25,000 per month\nWith experience: P30,000 - P60,000 or more";

        String[] universities = {
                "University of the Philippines Manila",
                "Ateneo de Manila University",
                "St. Paul University Manila",
                "Cebu Doctors' University",
                "Far Eastern University",
                "University of Santo Tomas",
                "West Visayas State University",
                "Mindanao State University - Marawi"
        };

        String[] requirements = {
                "High School Diploma, NSAT/Nursing Aptitude Test result, Medical Clearance",
                "High School Academic Records, Entrance Exam, Interview",
                "High School Form 138 & 137, Certificate of Good Moral Character, Entrance Exam",
                "High School Diploma, Entrance Exam, Medical Clearance",
                "High School Academic Records, University Admission Exam",
                "High School Academic Records, University Admission Exam, Interview",
                "High School Diploma, Entrance Exam, Certificate of Good Moral Character",
                "High School Diploma, Entrance Exam, Certificate of Good Moral Character"
        };

        String[] otherRequirements = {
                "Birth certificate, 2x2 ID photo, Vaccination record",
                "Birth certificate, ID photos, Medical Certificate",
                "Birth certificate, 2x2 ID photo, Medical Clearance",
                "Birth certificate, ID photos, Medical Clearance",
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, ID photo, Medical Certificate",
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, 2x2 ID photo, Medical Clearance"
        };

        String[] tuition = {
                "P40,000 - P80,000 per semester",
                "P98,000 - P104,000 per semester",
                "P50,000 - P90,000 per semester",
                "P30,000 - P60,000 per semester",
                "P35,000 - P70,000 per semester",
                "P40,000 - P80,000 per semester",
                "P20,000 - P40,000 per semester",
                "P15,000 - P35,000 per semester"
        };

        String[] scholarships = {
                "UP Academic Scholarship, Government Educational Assistance Programs",
                "Ateneo Academic Scholarship, Need-Based Financial Assistance",
                "St. Paul Merit-Based Scholarship, Need-Based Grants",
                "Cebu Doctors Academic Scholarship, Merit-Based Financial Assistance",
                "FEU Academic Scholarship, Need-Based Grants",
                "UST Academic Scholarship, Merit-Based Financial Aid",
                "WVSU Academic Scholarship, Government Educational Assistance",
                "MSU-Marawi Academic Scholarship, Merit-Based Grants"
        };

        return CourseTemplate.startCourse(scanner, courseName, description, skills, salary, universities, requirements, otherRequirements, tuition, scholarships);
    }
}
