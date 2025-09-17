class Student {
    public String courseTitle;
    public Course course;

    public Student(Course course) {
        this.courseTitle = course.title;
        this.course = course;
    }

    public void displayStudent() {
        course.displayCourse();
    }
}