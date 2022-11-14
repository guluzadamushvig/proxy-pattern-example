public class Main {
    public static void main(String[] args) {
       StudentService studentService = new StudentServiceProxy();
       studentService.studentServiceMethod();
    }
}
