package day12.step1;

public class VIPCustomer extends Customer{

    private  int agentID;
    double saleRatio;

    public VIPCustomer(){
        // 현재 클래스내 customerGrade 변수가 없으니까.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
    public int getAgentID(){
        return agentID;
    }
}
