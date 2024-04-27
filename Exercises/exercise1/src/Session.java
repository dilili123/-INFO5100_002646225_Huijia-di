import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Session {
    // 
 
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        if (students.size() < 20) {
            students.add(student);
        }
    }

    public void printAverageScores() {
        for (Student s : students) {
            System.out.println(s.getName() + "'s Average Score: " + s.calculateAverageScore());
        }
    }

    public void printQuizScoresInOrder() {
        ArrayList<Double> allScores = new ArrayList<>();
        for (Student s : students) {
            allScores.addAll(s.getQuizScores());
        }
        Collections.sort(allScores);
        System.out.println("Sorted Quiz Scores: " + allScores);
    }

    public void printPartTimeStudentNames() {
        System.out.println("Part-Time Students:");
        for (Student s : students) {
            if (s instanceof PartTime) {
                System.out.println(s.getName());
            }
        }
    }

    public void printFullTimeStudentExamScores() {
        System.out.println("Full-Time Students' Exam Scores:");
        for (Student s : students) {
            if (s instanceof FullTime) {
                ((FullTime) s).printExamScores();
            }
        }
    }
}

    

