import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoboPizza {

    public static void main(String[] args) {
        List<BikeTimeCalculator> bikes = new ArrayList<BikeTimeCalculator>() {{
            add(new BikeTimeCalculator("Иван"));
            add(new BikeTimeCalculator("Василий"));
            add(new BikeTimeCalculator("Инга"));
        }};
        List<CarTimeCalculator> cars = new ArrayList<CarTimeCalculator>() {{
            add(new CarTimeCalculator("Ольга"));
            add(new CarTimeCalculator("Пётр"));
        }};
        List<HumanTimeCalculator> humans = new ArrayList<HumanTimeCalculator>() {{
            add(new HumanTimeCalculator("Анна"));
            add(new HumanTimeCalculator("Дмитрий"));
            add(new HumanTimeCalculator("Алексей"));
        }};
        loop(bikes,cars,humans);
    }

    private static void loop(            List<BikeTimeCalculator> bikes,
                                  List<CarTimeCalculator> cars,
                                  List<HumanTimeCalculator> humans) {
        CourierSelector selector = new CourierSelector(bikes, cars, humans);

        DeliveryInfo delivery = null;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите расстояние в метрах => ");
            int distance = scanner.nextInt();
            delivery = selector.selectDelivery(distance);
            if (delivery != null) {
                System.out.println(
                        "Пицца будет доставлена через " + delivery.getTime() + " минут(у,ы)."
                );
                System.out.println("Ваш курьер - " + delivery.getName() + ".");
            } else {
                System.out.println("Доступных курьеров не найдено");
            }
        } while (delivery != null);
    }
}