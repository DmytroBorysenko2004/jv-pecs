package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String koleso;
    public Truck(String color , String name , String koleso) {
        super(color, name);
        this.koleso = koleso;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
