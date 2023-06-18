
public class Badge {


    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode(){
        return "XYZ"+employee.name+employee.surname+"XYZ";
    }

    public void showBadgeDetails(){
        System.out.println(totalNumberOfEmployees);
        System.out.println(employee.getEmployeeDetails());
        System.out.println(generateBadgeIdCode());
    }

}
