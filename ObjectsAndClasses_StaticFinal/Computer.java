public class Computer {
    private final String processor = "";
    private final String ram = "";
    private final String information = "";
    private final String keyboard = "";
    private final String screen = "";
    private String vendor = "";
    private String name = "";
    private double totalWeight = 0;

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getInformation() {
        return information;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getScreen() {
        return screen;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Компьютер" + "\n" + "\t" +
                "Производитель" + vendor +"\n" + "\t" +
                "Название" + name + "\n" +
                "Процессор" + processor + "\n" +
                "Оперативная память" + ram +"\n" +
                "Накопитель информации" + information + "\n" +
                "Клавиатура" + keyboard + "\n" +
                "Экран" + screen + "\n" +
                "Общая масса компьютера" +   "\n" ;
    }
    public Computer(String vendor, String name ){
        this.vendor = vendor;
        this.name = name;
    }
//    public Computer(CPU cpu, RAM ram,InformationStorage InformationStorage, Screen screen, Keyboard keyboard){
//    }
}
