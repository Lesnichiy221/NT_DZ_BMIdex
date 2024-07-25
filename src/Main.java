public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 88;
        double height = 1.8;
        double bmiIndex = service.calculateBmi(height, (int) weight);

        System.out.printf("Ваш индекс массы тела: " + bmiIndex);

    }
}