class StudentRunner {
    public static void main(String[] args) {
        Course course = new Course("Data Structures");
        Student student = new Student(course);
        student.displayStudent();
    }
}