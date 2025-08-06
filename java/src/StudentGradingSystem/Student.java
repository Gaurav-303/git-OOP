package StudentGradingSystem;

public class Student {
    private String name;
    private int rollNumber;
    private Subject[] subjects;

    public Student(String name, int rollNumber, Subject[] subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Subject[] getSubjects() {
        return subjects;
    }
}

