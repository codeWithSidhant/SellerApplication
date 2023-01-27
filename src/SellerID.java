public class SellerID {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int phoneNumber;
    private String shopAddress;

    public SellerID(String firstName, String lastName, String emailAddress, int phoneNumber, String shopAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.shopAddress = shopAddress;
    }

    public SellerID(SellerID Source) {
        this.firstName = Source.firstName;
        this.lastName = Source.lastName;
        this.emailAddress = Source.emailAddress;
        this.phoneNumber = Source.phoneNumber;
        this.shopAddress = Source.shopAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }
}
