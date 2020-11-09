package pSight.pages;

public enum Role {
    BUSINESS_PROFESSIONAL("Business Professional"),
    SOFTWARE_DEVELOPMENT("Software Development");

    private String value;

    Role(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }
}
