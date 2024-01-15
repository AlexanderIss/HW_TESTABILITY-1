public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_020;
        int miles = service.calculate(price); // должно получиться 501
        System.out.println(miles);
    }
}
