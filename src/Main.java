public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 98; // ввести данные в кг
        double height = 1.87; // ввести данные в метрах
        int bmi = service.calculate(mass, height);
        System.out.println(bmi);
    }
}

