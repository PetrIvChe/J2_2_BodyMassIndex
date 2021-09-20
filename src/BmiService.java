public class BmiService {

    public double calculate( double height) {
        double weight = 80;
        double bodyMassIndex = weight / (height * height);
        return bodyMassIndex;
    }
}
