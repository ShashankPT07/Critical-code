class Student {
    public int studentId = 12345;
    public String name = "Alice Johnson";
    public char grade = 'A'; 
    public boolean isFullTime = true;
    public float height = 1.65f;
    public double gpa = 3.85;
    public long phoneNumber = 9876543210L;

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Full-time: " + isFullTime);
        System.out.println("Height: " + height + " m");
        System.out.println("GPA: " + gpa);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
