//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double hight = 1.87;  //ввести рост в метрах
        double weight = 98;  //ввести вес в килограммах

/*  рост 1.87 ,вес 98
индекс массы = 28
 */
        int bmi = (int)(service.calculate(weight, hight)); //выводим округленное до целого значение
        System.out.println("Рост " + hight + " м," +" вес " + weight + " кг");
        System.out.println("Ваш индекс массы тела = " + bmi + " единиц");
    }
}