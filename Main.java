import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numeration = scanner.nextLine().split(" ");
        String[] allStudents = scanner.nextLine().split(" ");
        LinkedList<String> students = new LinkedList<>();
        for(String s: allStudents){
            students.addLast(s);
        }
        for (int i=0; i<Integer.parseInt(numeration[1]); i++){
            String student1 = scanner.next();
            String student2 = scanner.next();
            students.remove(student1);
            students.add(students.indexOf(student2),student1);
        }
        students.stream().forEach(s -> System.out.print(s+" "));
    }
}