public enum RAM {;
    private final String type;
    private final int volume;
    private final double weight;

    RAM(String type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n" + "     Тип: " + type + "\n" +
                "     Объем: " + volume + "\n" +
                "     Вес: " + weight + " кг.";
    }
}


