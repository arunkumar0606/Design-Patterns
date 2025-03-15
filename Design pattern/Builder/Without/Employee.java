package Builder.Without;

public class Employee {

    private String name;
    private int age;
    private String email;
    private int experience;
    private String gender;
    private String address; 


    public Employee(String name, int age, String email, int experience, String gender, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.experience = experience;
        this.gender = gender;
        this.address = address;
    }
    
    public String getName(){
        return this.name;
    }

    
}
