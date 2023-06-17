public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double heightInMeters = 1.87;
        int roundedBmi = service.calculate(weight, heightInMeters);
        System.out.println("Индекс массы тела = " + roundedBmi);
    }
}