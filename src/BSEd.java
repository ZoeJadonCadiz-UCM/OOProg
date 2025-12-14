import java.util.Scanner;

public class BSEd {

    public static boolean start(Scanner scanner) {
        String courseName = "Bachelor of Secondary Education (BSEd)";
        String description = "BSEd prepares students to become professional secondary school teachers. "
                + "The program covers pedagogy, curriculum design, classroom management, and teaching methods.";

        String[] skills = {
                "Communication and presentation skills",
                "Patience and empathy",
                "Creativity in lesson planning",
                "Leadership and classroom management",
                "Critical thinking and problem-solving"
        };

        String salary = "Entry-level: P18,000 - P25,000 per month\nWith experience: P30,000 - P50,000 or more";

        String[] universities = {
                "University of the Philippines Diliman",
                "Ateneo de Manila University",
                "De La Salle University",
                "University of Santo Tomas",
                "Philippine Normal University",
                "Far Eastern University",
                "University of Mindanao",
                "West Visayas State University"
        };

        String[] requirements = {
                "High School Diploma, NSAT result, Medical Clearance",
                "High School Academic Records, Entrance Exam",
                "High School Form 138 & 137, Certificate of Good Moral Character",
                "High School Academic Records, Admission Exam",
                "High School Diploma, Entrance Exam, Interview",
                "High School Academic Records, Admission Exam",
                "High School Diploma, Entrance Exam",
                "High School Diploma, Admission Exam"
        };

        String[] otherRequirements = {
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, ID photo",
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, ID photo",
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, 2x2 ID photo",
                "Birth certificate, 2x2 ID photo"
        };

        String[] tuition = {
                "P20,000 - P40,000 per semester",
                "P90,000 - P100,000 per semester",
                "P60,000 - P100,000 per semester",
                "P40,000 - P80,000 per semester",
                "P25,000 - P50,000 per semester",
                "P30,000 - P60,000 per semester",
                "P15,000 - P35,000 per semester",
                "P20,000 - P40,000 per semester"
        };

        String[] scholarships = {
                "UP Academic Scholarship, Teacher Education Grant",
                "Ateneo Academic Scholarship, Need-Based Assistance",
                "DLSU Academic Scholarship, Merit-Based Grants",
                "UST Academic Scholarship, Merit-Based Financial Aid",
                "PNU Academic Scholarship, Government Educational Assistance",
                "FEU Academic Scholarship, Need-Based Grants",
                "UM Academic Scholarship, Merit-Based Assistance",
                "WVSU Academic Scholarship, Government Educational Assistance"
        };

        return CourseTemplate.startCourse(scanner, courseName, description, skills, salary, universities, requirements, otherRequirements, tuition, scholarships);
    }
}
