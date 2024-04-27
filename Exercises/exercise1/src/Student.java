import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


abstract class Student {
    protected String name;
    protected int id;
    protected ArrayList<Double> quizScores;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.quizScores = new ArrayList<>(15);
    }

    public void addQuizScore(double score) {
        if (quizScores.size() < 15) {
            quizScores.add(score);
        }
    }

    public double calculateAverageScore() {
        if (quizScores.isEmpty()) return 0;
        double sum = 0;
        for (double score : quizScores) {
            sum += score;
        }
        return sum / quizScores.size();
    }

    public List<Double> getQuizScores() {
        return quizScores;
    }

    public String getName() {
        return name;
    }

    abstract public void printDetails();


}