public final class Dimensions {
    private final double length;
    private final double width;
    private final double height;

    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Dimensions setLength(double length) {
        return new Dimensions(length, width, height);
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(length, width, height);
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(length, width, height);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return (length * width * height);
    }

    public String toString() {
        return "Длина- " + length + "мм.;" + "\n" + "Ширина- " + width + "мм.;"
                + "\n" + "Высота- " + height + "мм.;";
    }

    public double volumeOfGoods(){
        return getLength() * getHeight() * getWidth();
    }

}
