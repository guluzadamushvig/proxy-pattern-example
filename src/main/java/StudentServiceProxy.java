public class StudentServiceProxy extends StudentService{

    @Override
    public void studentServiceMethod(){
        System.out.println("Student Service Proxy Method Worked"); ;
        super.studentServiceMethod();
    }
}
