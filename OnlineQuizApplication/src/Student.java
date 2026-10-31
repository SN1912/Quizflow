public class Student {
    private String name;
    private String rollNumber;
    private String department;

    public Student(String name, String rollNumber, String department) {
        if (name == null || name.trim().isEmpty()
                || rollNumber == null || rollNumber.trim().isEmpty()
                || department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("All student details are required.");
        }

        this.name = name.trim();
        this.rollNumber = rollNumber.trim();
        this.department = department.trim();
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getDepartment() {
        return department;
    }
}