public final class RAM {
    private final RAMType type;
    private final int volume;
    private final double weight;

    public RAM(String type, int volume, double weight) {
        this.type = RAMType.valueOf(type);
        this.volume = volume;
        this.weight = weight;
    }

    public RAMType getType() {
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


