package lab4;

/**
 *
 * @author Tatum Thomas
 */
public class HRPersonnel {
    private Employee employee;
    
    public void hireEmployee(String firstName, String lastName, String ssn, String cubeID) {
        Employee employee = new Employee(firstName, lastName, ssn);
        completeOrientationWithNewHire(employee, cubeID);
    }
    
    public void completeOrientationWithNewHire(Employee employee, String cubeID) {
        employee.doFirstTimeOrientation(cubeID);     
    }    
    
    public void outputReport(Employee employee) {
//        // if found run report
        if(employee.isMetWithHr() && employee.isMetDeptStaff()
           && employee.isReviewedDeptPolicies() && employee.isMovedIn()) {
            
            employee.getReportService().outputReport();
            
        }
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
