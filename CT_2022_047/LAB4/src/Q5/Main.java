package Q5;

public class Main {
    public static void main(String[] args) {
    // Create and set up lecture
    Lecturer  lecturer = new Lecturer() ;
    lecturer.setLecturerName("Dr.Smith");
    lecturer.setCourseTeaching("Object Oriented Programming!");

    //create abd  set uo Course
    Course course = new Course();
    course.setCourseName("Object Oriented Programming!");
    course.setCourseCode("CS101");
    course.setLecturer(lecturer);

    //Create and set up Student
     Student student =new Student();
     student.setStudentName("john Doe");
     student.setDegreeName("BICT Bachalar Of Information And Communication Technology!");
     student.setCourseFollowing("Object Oriented Programming!");

     System.out.println("======Course Info===");
     System.out.println("Course:"+course.getCourseName() + "("+course.getCourseCode()+")");
     System.out.println("Lecturer:"+ course.getLecturer().getLecturerName());


     System.out.println("\n=== Student Info===");
     System.out.println("Stident:"+student.getStudentName());
     System.out.println("Degree:" + student.getDegreeName());
     System.out.println("Course: " + student.getCourseFollowing());

    }
}
