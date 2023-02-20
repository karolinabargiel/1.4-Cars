package sii.sup;

public class Producent {
    private final String model;
    private final String type;

    public Producent(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Producent: "
                 + model + " "
                 + type;
    }
}
