package studentgradingsystem;

public class ReportCard {
    private Student student;

    public ReportCard(Student student) {
        this.student = student;
    }

    public int calculateTotal() {
        int total = 0;
        for (Subject subject : student.getSubjects()) {
            total += subject.getMarks();
        }
        return total;
    }

    public double calculateAverage() {
        return (double) calculateTotal() / student.getSubjects().length;
    }

    public char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }

    public void printReport() {
        System.out.println("----- Report Card -----");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNumber());
        System.out.println("Subjects:");
        for (Subject s : student.getSubjects()) {
            System.out.println(s.getName() + ": " + s.getMarks());
        }
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }
}

