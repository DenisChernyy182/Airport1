public final class Screen {
    private final double size;
    private final String type;
    private final double weight;

    public Screen(double size, String type, double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n" + "     Диагональ: " + size + "\n" +
                "     Тип: " + type + "\n" +
                "     Вес: " + weight + " кг.";
    }
}
