public final class InformationStorage {
    private final InformationStorageType type;
    private final int volume;
    private final double weight;

    public InformationStorage(InformationStorageType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public InformationStorageType getType() {
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
                "     Объем памяти: " + volume + "\n" +
                "     Вес: " + weight + " кг.";
    }
}
