public class Main {
    public static void main(String[] args) {
        Session session = new Session();

        // 
        for (int i = 0; i < 10; i++) {
            PartTime pt = new PartTime("PartTime Student " + i, i);
            for (int j = 0; j < 15; j++) {
                pt.addQuizScore(Math.random() * 100);
            }
            session.addStudent(pt);
        }

        for (int i = 0; i < 10; i++) {
            FullTime ft = new FullTime("FullTime Student " + i, i, Math.random() * 100, Math.random() * 100);
            for (int j = 0; j < 15; j++) {
                ft.addQuizScore(Math.random() * 100);
            }
            session.addStudent(ft);
        }

        // 调用 
        session.printAverageScores();
        session.printQuizScoresInOrder();
        session.printPartTimeStudentNames();
        session.printFullTimeStudentExamScores();
    }
}
