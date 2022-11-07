package myPack;

public class EmployeeValidation {
    public void validateInput(Employee emp) throws InvalidUserDetailException{
        if(emp.getName().length()<3){
            throw new InvalidUserDetailException("Invalid Employee name " + emp.getName() + ". Must be at least 3 characters.");
        }else if(emp.getAge()<18||emp.getAge()>65){
            throw new InvalidUserDetailException("Invalid Employee age. Must be between 18 - 65 years old");
        }else if(!emp.getGender().equalsIgnoreCase("male")&&!emp.getGender().equalsIgnoreCase("female")){
            throw new InvalidUserDetailException("Invalid Employee gender, Only accepts either male or female.");
        }else{
            System.out.println("*** Employee Details ***");
            System.out.println("Name="+emp.getName() + ", Age="+emp.getAge()+", Gender="+emp.getGender());

        }
    }
}
