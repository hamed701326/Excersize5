package question2;

public class Address {
    private String city;
    private String zone;
    private String street;
    private String alley;
    private long postCode;

    public Address(String city, String zone, String street, String alley, long postCode) {
        this.city = city;
        this.zone = zone;
        this.street = street;
        this.alley = alley;
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public long getPostCode() {
        return postCode;
    }

    public void setPostCode(long postCode) {
        this.postCode = postCode;
    }
}
