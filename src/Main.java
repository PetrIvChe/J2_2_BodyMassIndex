public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(1.79);
        System.out.println("Ваш индекс массы тела " + bodyMassIndex);

    }
    }

