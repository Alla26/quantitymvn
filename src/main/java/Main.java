import ru.netology.sqr.quantitymvn.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println("Количество чисел, квадраты которых попали в диапазон:   " + service.calcSqrt(-100, 200));
    }
}