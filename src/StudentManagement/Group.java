package StudentManagement;

import Exceptions.StudentNotFoundException;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Group {

    //private Set<Student> students = new HashSet<>();//HashSet is used to avoid duplicates (not ordered)
    private Set<Student> students = new TreeSet<>();//HashSet is used to avoid duplicates (ordered)

    public void addStudent(Student student){
        students.add(student);

    }
    public void removeStudent(Student student){
        try {
            if (!students.contains(student))
                throw new StudentNotFoundException("Student not found", 1000);

            students.remove(student);
            System.out.println("Student removed successfully");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
    }
    public void removeStudent(long id){

    }
    public void listStudents(){

    }
    public void modifyStudent(Long id, Student newStudent){

    }
    public Set<Student> getAdmittedStudents(){
        Set<Student> result = new HashSet<>();
        return result;
    }

    public double getAverageGrade(){
        return 0;
    }

}
