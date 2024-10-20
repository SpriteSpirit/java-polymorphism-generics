package transport;

public class Truck extends Transport implements Competing {
    public final float SPEED = 200;
    // constructors                                     --------------------------------------------*********
    public Truck(String brand, String model) {
        this(brand, model, 1.5f);
    }

    public Truck(String brand, float engineVolume) {
        this(brand, "No model", engineVolume);
    }

    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    // functional methods                                          --------------------------------------------*********
    @Override
    public void startMoving() {
        System.out.printf("%s %s from %s class is starting%n", getBrand(), getModel(), getClass().getSimpleName());
    }

    @Override
    public void finishMoving() {
        System.out.printf("%s %s from %s class is stopping%n", getBrand(), getModel(), getClass().getSimpleName());
    }

    @Override
    public void pitStop() {
        System.out.printf(
                "%s %s is in a pit-stop%n",
                getBrand(), getModel());
    }

    @Override
    public String getBestLapTime() {
        return RandomGenerator.generateTime();
    }

    @Override
    public float getMaxSpeed() {
        return RandomGenerator.generateSpeed(SPEED);
    }
}
