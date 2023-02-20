package homework.three;

import java.util.Arrays;

public class Car {
    private Color color;
    private final Model model;
    private final int year;
    private Wheel wheel;
    private final Engine engine;
    private String[] options;

    public Car(Color color, Model model, int year, Wheel wheel, Engine engine, String[] options) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheel = wheel;
        this.engine = engine;
        this.options = options;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }


    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", model=" + model +
                ", year=" + year +
                ", wheel=" + wheel +
                ", engine=" + engine +
                ", options=" + Arrays.toString(options) +
                '}';
    }
}
