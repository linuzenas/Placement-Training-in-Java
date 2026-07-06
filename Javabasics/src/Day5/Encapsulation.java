package Day5;

public class Encapsulation {

    private int empId;
    private String empName;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

    	Encapsulation e = new Encapsulation();

        e.setEmpId(1001);
        e.setEmpName("Rahul");
        e.setSalary(45000);

        System.out.println(e.getEmpId());
        System.out.println(e.getEmpName());
        System.out.println(e.getSalary());

    }

}