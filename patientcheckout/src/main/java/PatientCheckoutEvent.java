public class PatientCheckoutEvent {

    public String firstName;
    public String middleName;
    public String lastName;
    public String ssn;

    public PatientCheckoutEvent(){}

    public PatientCheckoutEvent(String firstName, String middlename, String lastName, String ssn) {
        this.firstName = firstName;
        this.middleName = middlename;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "PatientCheckoutEvent{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
