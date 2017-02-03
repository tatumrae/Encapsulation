/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Date;

/**
 *
 * @author Tatum Thomas
 */
public class ReportService {

    private Employee employee;

    public ReportService(Employee employee) {
        this.employee = employee;
    }

    public void reportMetWithHR(String formattedDate) {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " met with Hr on "
                + formattedDate);
    }

    public void reportMetDepartmentStaff(String formattedDate) {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " met with Dept. Staff on "
                + formattedDate);
    }

    public void reportMovedIntoCubicle(String formattedDate, String cubeId) {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " moved into cubicle "
                + cubeId + " on " + formattedDate);
    }

    public void reportReviewedDeptPolicies(String formattedDate) {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " reviewed Dept policies on "
                + formattedDate);
    }
}
