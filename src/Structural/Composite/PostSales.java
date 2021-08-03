package Structural.Composite;

public class PostSales implements Employee{
    private String name;
    private long empId;
    private String position;

    public PostSales(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmpDetails() {
        System.out.println(empId + position);
    }
}
