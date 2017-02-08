package lab4;

/**
 *
 * @author Tatum Thomas
 */
public class Company {
    private String companyName;
    private String establishedDate;
    private HRPersonnel hr;

    public Company(String companyName, String establishedDate) {
        this.companyName = companyName;
        this.establishedDate = establishedDate;
        hr = new HRPersonnel();
    }
    public void hireEmployee(String firstName, String lastName, String ssn, String cubeID) {
        hr.hireEmployee(firstName, lastName, ssn, cubeID);
        hr.outputReport(ssn);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(String establishedDate) {
        this.establishedDate = establishedDate;
    }

    public HRPersonnel getHr() {
        return hr;
    }

    public void setHr(HRPersonnel hr) {
        this.hr = hr;
    }

    
    
}
