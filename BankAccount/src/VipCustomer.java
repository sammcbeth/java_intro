public class VipCustomer {

    private String name;
    private double credit_limit;
    private String email;

    public String getEmail() {
        return this.email;
    }

    public double getCredit_limit() {
        return this.credit_limit;
    }

    public String getName() {
        return this.name;
    }

    public VipCustomer(String name, double credit_limit) {
        this(name,credit_limit, "default@email.com");
    }

    public VipCustomer() {
        this("Default Name",10000, "default@email.com");

    }

    public VipCustomer(String name, double credit_limit, String email) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }
}
