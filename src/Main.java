import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
List<String> studentList=new ArrayList<>();
studentList.add("Ahmad");
studentList.add("Ali");
studentList.add("Mohammad");
studentList.add("Sara");

//other methods
        studentList.remove(0);
        studentList.add(0,"John");
        studentList.set(2,"Mary");
        System.out.println(studentList);


//call method from another package
        collections.ListExample.myStudents(studentList);

    }
}