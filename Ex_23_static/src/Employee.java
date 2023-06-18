public class Employee {


    public String name, surname, address;


    public Employee(String name,String surname,String address){
        this.name=name;
        this.surname=surname;
        this.address=address;
    }

    public String getEmployeeDetails(){
        return "The employee name is "+name+
                ", his surname is "+surname+
                ", and his address is "+address;
    }
}
