public class BmiService {
    public double calculate(double w, double h) {

        double bmInd = (w / (h * h));
        return bmInd;
    }
}
