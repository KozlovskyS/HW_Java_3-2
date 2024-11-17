public class BmiService {
    public int calculate(double weight, double hight) {
        int bmIndex = (int) ((weight / (hight * hight)));
        return bmIndex;
    }
}
