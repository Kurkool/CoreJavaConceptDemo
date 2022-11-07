package myPack;

public class Employee {
    public String id;
    public String firstName;
    public String lastName;
    public String department;
    public String position;

    public Employee(String id, String firstName, String lastName, String department, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
    }

    public Employee() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void printDetails(){
        System.out.println("Employee Details:\n" +
                "id:" + this.getId() + "\n" +
                "firstName:" + this.getFirstName() + "\n" +
                "lastName:" + this.getLastName() + "\n" +
                "department:" + this.getId() + "\n" +
                "position:" + this.getPosition());
    }
}
