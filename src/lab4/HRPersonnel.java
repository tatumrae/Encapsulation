package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatum Thomas
 */
public class HRPersonnel {
    private List<Employee> employees;

    public HRPersonnel() {
        employees = new ArrayList();
    } 
    
    public void hireEmployee(String firstName, String lastName, String ssn, String cubeID) {
        Employee employee = new Employee(firstName, lastName, ssn);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSsn(ssn);
        employees.add(employee);
        completeOrientationWithNewHire(employee, cubeID);
    }
    
    public void completeOrientationWithNewHire(Employee employee, String cubeID) {
        employee.doFirstTimeOrientation(cubeID);     
    }    
    
    public void outputReport(String ssn) {
        Employee e = null;
        
        // find employee in list
        for(Employee emp : employees) {
            if(emp.getSsn().equals(ssn)) {
                e = emp;
                break;
            } else {
                // if not found end method prematurely
                return;
            }
        }

        // if found run report
        if(e.isMetWithHr() && e.isMetDeptStaff()
           && e.isReviewedDeptPolicies() && e.isMovedIn()) {
            
            e.getReportService().outputReport();
            
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
}
