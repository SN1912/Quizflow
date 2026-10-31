# QuizFlow – Online Quiz Application

A Java Swing-based Online Quiz Application developed using Core Java. It allows students to take subject-based MCQ quizzes, track their progress, and view their results.

## Features

- Student registration
- Subject selection
- Multiple-choice questions (MCQs)
- 20 questions across two subjects
- 20-minute quiz timer
- Previous and Next question navigation
- Automatic answer evaluation
- Result calculation with percentage
- Pass/fail status
- Leaderboard

## Subjects

- Java Programming
- Object-Oriented Programming (OOP)

## Technologies Used

- Java
- Java Swing
- Object-Oriented Programming
- VS Code

## Project Structure

```text
OnlineQuizApplication/
├── src/
│   ├── Main.java
│   ├── Student.java
│   ├── Question.java
│   ├── Quiz.java
│   └── Result.java
├── README.md
└── .gitignore
```

## How to Run

### 1. Compile the project

Open the terminal in the project folder and run:

```bash
javac -d out src/*.java
```

### 2. Run the application

```bash
java -cp out Main
```

## Quiz Rules

- Total questions: 20
- Total duration: 20 minutes
- Correct answer: 1 mark
- Negative marking: None
- Passing percentage: 40%

## Developer

Developed as an academic Java project.

## License

This project is available for educational purposes.