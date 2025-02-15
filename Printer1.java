public class Printer1 {
    public static void main(String[] args) {
        StudentDirectory1 directory = new StudentDirectory1();
        directory.addStudent("Alice", 90);
        directory.addStudent("Bob", 85);
        directory.addStudent("Alice", 95);
        

        System.out.println("Before removal:");
        System.out.println(directory.findStudent("Alice"));
        System.out.println(directory.getALLStudents());
        directory.removeStudent("Alice");
        System.out.println("After removal:");
        System.out.println(directory.findStudent("Alice"));
        System.out.println(directory.getALLStudents());

    }

}
