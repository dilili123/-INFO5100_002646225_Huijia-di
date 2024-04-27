class FullTime extends Student {
    private double[] examScores = new double[2];

    public FullTime(String name, int id, double exam1, double exam2) {
        super(name, id);
        this.examScores[0] = exam1;
        this.examScores[1] = exam2;
    }

    public void printExamScores() {
        System.out.println("Exam Scores for " + name + ": " + examScores[0] + ", " + examScores[1]);
    }

    @Override
    public void printDetails() {
        System.out.println("Full-Time Student: " + name + ", ID: " + id);
    }
}