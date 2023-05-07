public final class StorageOfCargoInformation {
    private final double weight;
    private final Dimensions dimensions;
    private final String address;
    private final boolean turnOver;
    private final String registrationNumber;
    private final boolean fragile;
    private final double length;
    private final double width;
    private final double height;

    public StorageOfCargoInformation(double weight,
                                     String address,
                                     Dimensions dimensions,
                                     String registrationNumber,
                                     boolean turnOver,
                                     boolean fragile,
                                     double length,
                                     double width,
                                     double height)
    {
        this.weight = weight;
        this.address = address;
        this.registrationNumber = registrationNumber;
        this.length = length;
        this.width = width;
        this.height = height;
        this.dimensions = dimensions;
        this.turnOver = turnOver;
        this.fragile = fragile;
    }

    public StorageOfCargoInformation setWeight(double weight) {
        return new StorageOfCargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile, length, width, height);
    }

    public double getWeight() {
        return weight;
    }


    public StorageOfCargoInformation setAddress(String address) {
        return new StorageOfCargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile, length, width, height);
    }

    public String getAddress() {
        return address;
    }

    public StorageOfCargoInformation setDimensions(Dimensions dimensions) {
        return new StorageOfCargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile, length, width, height);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public StorageOfCargoInformation setRegistrationNumber(String registrationNumber) {
        return new StorageOfCargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile, length, width, height);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public StorageOfCargoInformation setTurnOver(boolean turnOver) {
        return new StorageOfCargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile, length, width, height);
    }

    public boolean canTurnOver() {
        return turnOver;
    }

    public StorageOfCargoInformation setFragile(boolean fragile) {
        return new StorageOfCargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile, length, width, height);
    }

    public boolean isFragile() {
        return fragile;
    }

    public StorageOfCargoInformation setLength(double length){
        return new StorageOfCargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile, length, width, height);}

    public StorageOfCargoInformation setWidth(double width){
        return new StorageOfCargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile, length, width, height);}

    public StorageOfCargoInformation setHeight(double height) {
        return new StorageOfCargoInformation(weight, address, dimensions,
                registrationNumber, turnOver, fragile, length, width, height);
    }

    public String toString() {
        return "вес- " + weight + "\n" + "адрес- " + address + "\n" + dimensions +
                "\n" + "регистрационный номер-  " + registrationNumber;
    }
}

