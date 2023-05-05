public final class Dimensions {

    private final int dimensions;
    private final int weight;
    private final String deliveryAddress;
    private final boolean flipped;
    private final String registrationNumber;
    private final boolean fragile;

    public Dimensions(int dimensions,
                      int weight,
                      String deliveryAddress,
                      boolean flipped,
                      String registrationNumber,
                      boolean fragile) {
        this.dimensions = dimensions; // габариты
        this.weight = weight;         //масса
        this.deliveryAddress = deliveryAddress; //адресс доставки
        this.flipped = flipped; //перевернутый
        this.registrationNumber = registrationNumber; // номер регистрации
        this.fragile = fragile; //хрупкий
    }

    public Dimensions setDimensions(int dimensions) {
        return new Dimensions(dimensions, weight, deliveryAddress, flipped, registrationNumber, fragile);
    }

    public Dimensions setWeight(int weight) {
        return new Dimensions(dimensions, weight, deliveryAddress, flipped, registrationNumber, fragile);
    }

    public Dimensions setDeliveryAddress(String deliveryAddress) {
        return new Dimensions(dimensions, weight, deliveryAddress, flipped, registrationNumber, fragile);
    }

    public Dimensions setFlipped(boolean flipped) {
        return new Dimensions(dimensions, weight, deliveryAddress, flipped, registrationNumber, fragile);
    }

    public Dimensions setRegistrationNumber(String registrationNumber) {
        return new Dimensions(dimensions, weight, deliveryAddress, flipped, registrationNumber, fragile);
    }

    public Dimensions setFragile(boolean fragile) {
        return new Dimensions(dimensions, weight, deliveryAddress, flipped, registrationNumber, fragile);
    }

    public int getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFlipped() {
        return flipped;
    }

    public boolean isFragile() {
        return fragile;
    }

}
