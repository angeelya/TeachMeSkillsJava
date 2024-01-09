package work32.home.data_transfer_object;

public class Account {
    private String from;
    private String to;
    private Integer sum;

    public Account(String from, String to, Integer sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", sum=" + sum +
                '}';
    }
}
