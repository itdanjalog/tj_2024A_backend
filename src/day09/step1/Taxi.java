package day09.step1;

public class Taxi {
    String company;
    int passengerCount;
    int money;

    public Taxi(String company) {
        this.company = company;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "company='" + company + '\'' +
                ", passengerCount=" + passengerCount +
                ", money=" + money +
                '}';
    }
}
