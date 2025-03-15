package Builder.With;

public class Employee {
    private final String name;
    private final int age;
    private final String email;
    private final int experience;
    private final String gender;
    private final String address; 

    private Employee(EmployeeBuilder employeeBuilder){

        this.name=employeeBuilder.name;
        this.age=employeeBuilder.age;
        this.email=employeeBuilder.email;
        this.experience=employeeBuilder.experience;
        this.gender=employeeBuilder.gender;
        this.address=employeeBuilder.address;
    }
    public String getName(){
        return this.name;
    }

    public static class EmployeeBuilder{
        private String name;
        private int age;
        private String email;
        private int experience;
        private String gender;
        private String address;
    

    public EmployeeBuilder setName(String name ){
        this.name=name;
        return this;
    }


    public EmployeeBuilder setAge(int age) {
        this.age = age;
        return this;
    }


    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }


    public EmployeeBuilder setExperience(int experience) {
        this.experience = experience;
        return this;
    }


    public EmployeeBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }


    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Employee build(){
        return new Employee(this);
    }

}

}
