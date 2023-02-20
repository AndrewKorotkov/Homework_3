package homework.three;


public class CarShowroom {

    public static void main(String[] args) {

        Car car = new Car(Color.BLACK, Model.COUPE, 2023, Wheel.MEDIUM, Engine.PETROL,
                new String[]{Options.CRUISECONTROL.toString(), Options.NAVIGATION.toString()});
        System.out.println(car);

        Service service = new Service();
        car = service.addOptions(Options.SAFETY, car);

        System.out.println(car);

        car = service.deleteOptions(Options.CRUISECONTROL, car);
        System.out.println(car);

    }
}
