package day09.step1;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    // 오른쪽 클릭 -> 생성 -> 생성자 -> 멤버변수 선택
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take( int money ){
        this.money += money;
        passengerCount++;
    }
    // 오른쪽 클릭 -> 생성 -> toString()
    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                ", passengerCount=" + passengerCount +
                ", money=" + money +
                '}';
    }
}
