package Builder.With;

public class Company {
    public static void main(String[] args) {
        Employee employee1=new Employee.EmployeeBuilder().setAddress("usa").setName("ammu").build();
        System.out.println("emplyee : "+employee1.getName());
    }
}
