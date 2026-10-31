import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;
    private ArrayList<Integer> selectedAnswers;

    public Quiz() {
        questions = new ArrayList<>();
        selectedAnswers = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        if (question == null) {
            throw new IllegalArgumentException("Question cannot be null.");
        }

        questions.add(question);
        selectedAnswers.add(-1);
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    public Question getQuestion(int index) {
        return questions.get(index);
    }

    public void saveAnswer(int questionIndex, int answerIndex) {
        if (questionIndex < 0 || questionIndex >= questions.size()) {
            throw new IllegalArgumentException("Invalid question number.");
        }

        if (answerIndex < 0
                || answerIndex >= questions.get(questionIndex).getOptions().size()) {
            throw new IllegalArgumentException("Invalid answer option.");
        }

        selectedAnswers.set(questionIndex, answerIndex);
    }

    public int getSelectedAnswer(int index) {
        return selectedAnswers.get(index);
    }

    public int getAnsweredCount() {
        int count = 0;

        for (int answer : selectedAnswers) {
            if (answer != -1) {
                count++;
            }
        }

        return count;
    }

    public int getUnansweredCount() {
        return getTotalQuestions() - getAnsweredCount();
    }

    public int calculateScore() {
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            if (selectedAnswers.get(i) != -1
                    && questions.get(i).isCorrect(selectedAnswers.get(i))) {
                score++;
            }
        }

        return score;
    }

    public int getIncorrectAnswers() {
        return getAnsweredCount() - calculateScore();
    }

    public double calculatePercentage() {
        if (questions.isEmpty()) {
            return 0.0;
        }

        return calculateScore() * 100.0 / questions.size();
    }
}