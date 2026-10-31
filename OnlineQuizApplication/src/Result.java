public class Result {
    private Student student;
    private Quiz quiz;

    public Result(Student student, Quiz quiz) {
        if (student == null || quiz == null) {
            throw new IllegalArgumentException("Student and quiz are required.");
        }

        this.student = student;
        this.quiz = quiz;
    }

    public int getTotalMarks() {
        return quiz.calculateScore();
    }

    public double getPercentage() {
        return quiz.calculatePercentage();
    }

    public int getIncorrectAnswers() {
        return quiz.getIncorrectAnswers();
    }

    public int getUnansweredAnswers() {
        return quiz.getUnansweredCount();
    }

    public String getStatus() {
        return getPercentage() >= 40.0 ? "PASS" : "FAIL";
    }
}