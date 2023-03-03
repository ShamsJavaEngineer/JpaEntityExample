public class Main{
    public static void main(String[] args){
        System.out.println("HI i am Shams");

        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Shams");
        emp.setDesignation("Java Developer");

        String employee = emp.toString(emp.getId(), emp.getName() , emp.getDesignation());
        System.out.println(employee);

    }
}