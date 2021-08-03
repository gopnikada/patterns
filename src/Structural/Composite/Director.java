package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Director implements Employee{
    private String name;
    private long empId;
    private String position;
    private List<Employee> employees = new ArrayList<Employee>();


    public Director(String name, long empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }



    @Override
    public void showEmpDetails() {
        System.out.println("DIRECTOR EPTA"+empId+position);

        for(Employee employee: employees){
            employee.showEmpDetails();
        }
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
}
