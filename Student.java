import java.util.Scanner; 
public class Student { 
private String studentId; 
private String name; 
private int extraActivities; 
public Student(String studentId, String name, int extraActivities) { 
this.studentId = studentId; 
this.name = name; 
this.extraActivities = extraActivities; 
}  
 public String getStudentId() { 
     return studentId; 
    } 

public void setStudentId(String studentId) { 
     this.studentId = studentId; 
    } 
public String getName() { 
    return name; 
} 

 public void setName(String name) { 
    this.name = name; 
 } 

 public int getExtraActivities() { 
 return extraActivities; 
 }
public void setExtraActivities(int extraActivities) { 
 this.extraActivities = extraActivities;
 }  
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 System.out.println("Enter student number:");
 int numberOfStudents = scanner.nextInt(); 
  Student[] students = new Student[numberOfStudents]; 
  for (int i = 0; i < numberOfStudents; i++) { 
    System.out.println("Enter student ID:"); 
     String studentId = scanner.next(); 

 System.out.println("Enter student name:"); 
 String name = scanner.next(); 
 
 System.out.println("Enter number of extra activities:");  
 int extraActivities = scanner.nextInt(); 

 students[i] = new Student(studentId, name, extraActivities); 
} 
 for (Student student : students) { 
System.out.println("Student ID: " + student.getStudentId());
 System.out.println("Student Name: " + student.getName());
 System.out.println("ExtraActivities: " + student.getExtraActivities());
System.out.println(); 
} 
 
    scanner.close(); 
  }
}
