import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController
{
    //var double
    private static double passengerCarMaxWeight = 3500.0; // kg
    //var int
    private static int passengerCarMaxHeight = 2000; // mm
    //var int
    private static int controllerMaxHeight = 3500; // mm

    //var int
    private static int passengerCarPrice = 100; // RUB
    //var int
    private static int cargoCarPrice = 250; // RUB
    //var int
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args)
    {
        System.out.println("Сколько автомобилей сгенерировать?");

        //var Scanner
        Scanner scanner = new Scanner(System.in);
        //var int
        int carsCount = scanner.nextInt();
            //var int - i
        for(int i = 0; i < carsCount; i++)
        {
            //var Car
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car); //var int
            if(price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */                                //var Car
    private static int calculatePrice(Car car)
    {
        //var int
        int carHeight = car.height;
        //var int
        int price = 0;
        if (carHeight > controllerMaxHeight)
        {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        }
        else if (carHeight > passengerCarMaxHeight)
        {   //var double
            double weight = car.weight;
            //Грузовой автомобиль
            if (weight > passengerCarMaxWeight)
            {
                price = cargoCarPrice;
                if (car.hasVehicle) {
                    price = price + vehicleAdditionalPrice;
                }
            }
            //Легковой автомобиль
            else {
                price = passengerCarPrice;
            }
        }
        else {
            price = passengerCarPrice;
        }
        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */                            //var String
    private static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }
}