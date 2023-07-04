package model;

public class Car {
    private String name;
    private String model;
    private int horsePower;

    public Car(String name, String model, int horsePower) {
        this.name = name;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(byte horsePower) {
        this.horsePower = horsePower;
    }
}
