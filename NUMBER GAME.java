import java.util.Scanner;

class Student {
    private String name;
    private int totalSubjects;
    private double[] subjectMarks;

    public Student(String name, int totalSubjects) {
        this.name = name;
        this.totalSubjects = totalSubjects;
        this.subjectMarks = new double[totalSubjects];
    }

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextDouble();
        }
    }

    public double calculateAverage() {
        double totalMarks = 0;
        for (double mark : subjectMarks) {
            totalMarks += mark;
        }
        return totalMarks / totalSubjects;
    }

    public String calculateGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Subjects: " + totalSubjects);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter total subjects: ");
        int totalSubjects = scanner.nextInt();

        Student student = new Student(name, totalSubjects);
        student.inputMarks();
        student.displayResult();
    }

}
