public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("ale","gob","via roma");
        Employee employee2 = new Employee("mario","rossi","via asd");

        Badge badge1 = new Badge(employee1);
        badge1.showBadgeDetails();

        Badge badge2 = new Badge(employee2);
        badge2.showBadgeDetails();
    }
}