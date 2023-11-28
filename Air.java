public class Air implements Transport{
    private String status;
    public String mediumofTransport() {
        return "By air";
    }
    public double deliveryCharge() {
        return 1000.90;
    }
    public void setstatus(String status) {
        this.status = status;
    }
    public String status() {
        return status;
    }
}
