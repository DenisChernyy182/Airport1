public class Computer {
    public static CPU cpu;
    public static  RAM ram;
    public static  InformationStorage information;
    public static  Keyboard keyboard;
    public static  Screen screen;
    public final String vendor;
    private final String name;
    private double totalWeight;

    public Computer(String vendor, String name ){
        this.vendor = vendor;
        this.name = name;
    }

    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setInformationStorage(InformationStorage information) {
        this.information = information;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setTotalWeight(){
        this.totalWeight = totalWeight;
    }
    public CPU getCPU(){
        return cpu;
    }
    public RAM getRAM(RAM ram){
        return Computer.ram;
    }

    public InformationStorage getinformationStorage(){
        return information;
    }

    public Keyboard getKeyboard(){
        return keyboard;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }
    public double getTotalWeight() {
        return totalWeight = cpu.getWeight() + ram.getWeight() + information.getWeight() + keyboard.getWeight() +
                screen.getWeight() ;
    }

    public String toString() {
        return "Компьютер" + "\n" +
                "Производитель: " + vendor + "\n" +
                "Название: " + name + "\n" +
                "Процессор: " + cpu + "\n" +
                "Оперативная память: " + ram + "\n" +
                "Накопитель информации: " + information + "\n" +
                "Клавиатура: " + keyboard + "\n" +
                "Экран: " + screen + "\n" +
                "Общая масса компьютера: " + getTotalWeight() + " кг";
    }



}
