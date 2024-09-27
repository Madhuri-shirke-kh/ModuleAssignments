class Student {
    
    private String name;
    private int age;
    private String studentId;

   
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int age) {
        this.age = age;
    }

     
    public String getStudentId() {
        return studentId;
    }

    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}


public class StudentDemo {
    public static void main(String[] args) {

        Student student = new Student("Madhuri shirke", 20, "12345");

        
        System.out.println("Before updating student details:");
        student.displayDetails();

        
        student.setName("Madhuri shirke");
        student.setAge(21);
        student.setStudentId("67890");

        
        System.out.println("\nAfter updating student details:");
        student.displayDetails();
    }
}