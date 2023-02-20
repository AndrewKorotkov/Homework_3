package homework.three;

public class Service {

    public Car updateColor(Color color, Car car) {
        car.setColor(color);
        return car;
    }

    public Car updateWheel(Wheel wheel, Car car) {
        car.setWheel(wheel);
        return car;
    }

    public Car addOptions(Options options, Car car) {

        int lenght = car.getOptions().length;
        String[] s = new String[lenght + 1];
        for (int i = 0; i < lenght; i++) {
            s[i] = car.getOptions()[i];
        }
        s[lenght] = options.toString();
        car.setOptions(s);
        return car;
    }

    public Car deleteOptions(Options options, Car car) {

        int lenght = car.getOptions().length;
        String[] output = new String[lenght - 1];
        int count = 0;
        for (String i : car.getOptions()) {
            if (!i.equals(options.toString())) {
                output[count++] = i;
            }
        }
        car.setOptions(output);
        return car;
    }
}
