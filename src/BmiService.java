public class BmiService {
    public int calculate(double weight, double heightInMeters) {
        double bmi = weight / (heightInMeters * heightInMeters);
        int roundedBmi = (int) bmi;
        return roundedBmi;
    }
}
