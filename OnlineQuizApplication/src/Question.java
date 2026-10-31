import java.util.ArrayList;

public class Question {
    private String questionText;
    private ArrayList<String> options;
    private int correctAnswerIndex;

    public Question(String questionText, ArrayList<String> options,
                    int correctAnswerIndex) {
        if (questionText == null || questionText.trim().isEmpty()) {
            throw new IllegalArgumentException("Question text cannot be empty.");
        }

        if (options == null || options.size() < 2) {
            throw new IllegalArgumentException("At least two options are required.");
        }

        if (correctAnswerIndex < 0 || correctAnswerIndex >= options.size()) {
            throw new IllegalArgumentException("Invalid correct answer.");
        }

        this.questionText = questionText;
        this.options = new ArrayList<>(options);
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getOptions() {
        return new ArrayList<>(options);
    }

    public String getOption(int index) {
        return options.get(index);
    }

    public boolean isCorrect(int selectedAnswerIndex) {
        return selectedAnswerIndex == correctAnswerIndex;
    }
}