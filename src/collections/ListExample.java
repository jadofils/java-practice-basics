package collections;

import java.util.List;

public class ListExample {
    public static void myStudents(List<String> students){

        //print all of all students
        System.out.println("All students:");
        for (String student:students){
            System.out.println(student);
        }
        //count all students
        System.out.println("Number of students: " + students.size());

        //check if the students existence
        if(!students.contains("John")){
            System.out.println("John is not in the list");
        }

    }
}
