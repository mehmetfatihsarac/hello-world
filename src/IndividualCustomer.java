public class IndividualCustomer extends Customer {
    private String nationalId;

    public IndividualCustomer(String name, String phoneNumber, String nationalId) {
        super(name, phoneNumber);
        this.nationalId = nationalId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
