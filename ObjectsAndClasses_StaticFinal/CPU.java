public enum CPU {;
    private final double frequency;
    private final String cores;
    private final int manufacturer;
    private final double weight;

    CPU(double frequency, String cores, int manufacturer, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getCores() {
        return cores;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n" + "     Частота: " + frequency + "\n" +
                "     Количество ядер: " + cores + "\n" +
                "     Производитель: " + manufacturer + "\n" +
                "     Вес: " + weight + " кг.";
    }
}
