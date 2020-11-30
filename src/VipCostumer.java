public class VipCostumer {
    private String name;
    private int creditLimit;
    private String emailaddress;

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public VipCostumer(String name, int creditLimit, String emailaddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailaddress = emailaddress;
    }

    public VipCostumer(String name, int creditLimit) {
        this(name,creditLimit,"default@gmail.com");
    }

    public VipCostumer() {
        this("default name", 3000, "default@gmail.com");
    }

    @Override
    public String toString() {
        return "VipCostumer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", emailaddress='" + emailaddress + '\'' +
                '}';
    }
}
