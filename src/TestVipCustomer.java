public class TestVipCustomer {
    public static void main(String[] args) {
        VipCostumer vipCustomer = new VipCostumer("midas",2600,"kosmas@gamil.com");
        VipCostumer vipCostumer2 = new VipCostumer("kosmidas", 500);
        VipCostumer vipCostumer3 = new VipCostumer();
        System.out.println(vipCustomer.toString());
        System.out.println(vipCostumer2.toString());
        System.out.println(vipCostumer3.toString());
    }
}
