public final class Keyboard {
    private final String type;
    private final boolean backlit;
    private final double weight;

    public Keyboard(String type, boolean backlit, double weight) {
        this.type = type;
        this.backlit = backlit;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public boolean isBacklit() {
        return backlit;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n" + "     Тип: " + type + "\n" +
                "     Наличие подсветки: " + backlit + "\n" +
                "     Вес: " + weight + " кг.";
    }
}
