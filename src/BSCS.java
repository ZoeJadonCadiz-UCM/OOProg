import java.util.Scanner;

public class BSCS {

    public static boolean start(Scanner scanner) {
        String courseName = "Bachelor of Science in Computer Science (BSCS)";
        String description = "The Bachelor of Science in Computer Science (BSCS) focuses on software development, algorithms, programming languages, and computational theory. Students learn to design, implement, and maintain computer systems and applications.";

        String[] skills = {
            "Strong problem-solving and logical thinking",
            "Programming and coding knowledge",
            "Analytical and critical thinking",
            "Attention to detail",
            "Ability to work in teams and communicate effectively"
        };

        String salary = "Entry-level: P22,000 - P35,000 per month\nWith experience: P45,000 - P90,000 or more";

        String[] universities = {
            "CIIT Philippines",
            "AMA Computer University",
            "STI Colleges",
            "Ateneo de Manila University",
            "University of the Immaculate Conception",
            "St. Louis University (Baguio)",
            "Technological Institute of the Philippines (TIP)",
            "University of Cebu (UC)"
        };

        String[] requirements = {
            "Full Grade 12 Report Card, Medical Clearance/Certificate, Certificate of Good Moral Character",
            "High School Form 138, High School Form 137, Certificate of Good Moral Character",
            "High School Form 138 & 137, Certificate of Good Moral Character",
            "Completed online application through Ateneo Blue Eagle Admissions (BEA) portal, High school academic records",
            "Placement exam result, Certificate of Good Moral Character",
            "Good academic standing and senior high completion will factor in, Qualify through a Qualifying Exam (QE)",
            "Grade 12 Report Card, Certificate of Good Moral Character",
            "High school diploma, Certificate of Good Moral Character"
        };

        String[] otherRequirements = {
            "Birth certificate, 2x2 ID Picture",
            "Birth certificate, Copy of Moving-up Certificate",
            "Birth certificate, Medical Certificate",
            "Birth certificate, Standardized results",
            "Birth certificate, ID Photos, Report Card",
            "Birth certificate, Personality test and interview",
            "PSA Birth certificate, ID photo",
            "Birth certificate, High School Report Card (Form 138)"
        };

        String[] tuition = {
            "P40,000 - P55,000 per semester",
            "P20,000 - P30,000 per semester",
            "P20,000 - P32,000 per semester",
            "P98,000 - P104,000 per semester",
            "P25,000 - P45,000 per semester",
            "P25,000 - P40,000 per semester",
            "P60,000 - P120,000 per semester",
            "P40,000 - P80,000 per semester"
        };

        String[] scholarships = {
            "Academic Excellence Scholarship, Need-Based Financial Assistance",
            "Merit Scholarship, Entrance Scholarship Program",
            "STI Open Scholarship (SOS), Government Educational Assistance Programs",
            "Ateneo Academic Scholarship, Financial Assistance for Eligible Students",
            "Academic Merit Scholarship, Need-Based Scholarship",
            "SLU Academic Scholarship, Grants for High Performing Students",
            "TIP Academic Scholarship, Special Scholarships for Engineering/IT Students",
            "University of Cebu Academic and Merit-Based Scholarships"
        };

        return CourseTemplate.startCourse(scanner, courseName, description, skills, salary, universities, requirements, otherRequirements, tuition, scholarships);
    }
}
