public class Seatransport implements Transport{
    private String status;
    public String mediumofTransport() {
        return "By sea";
    }

    public double deliveryCharge() {
        return 500.09;
    }
    public void setstatus(String status) {
        this.status = status;
    }
    public String status() {
        return status;
    }
}
