import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", "i7");
        CPU cpu = new CPU(2700, "intel", 100,2);
        computer.setCPU(cpu);
//        RAM ram = new RAM("Apace", 600,2);
//        computer.setRam(ram);
//        InformationStorage informationStorage = new InformationStorage("HDD", 200,2);
//        computer.setInformationStorage(informationStorage);
//        Screen screen = new Screen(54, "VA", 1.5);
//        computer.setScreen(screen);
//        Keyboard keyboard = new Keyboard("Intel", true, 0.5);
//        computer.setKeyboard(keyboard);
//
        System.out.println(computer);
//        System.out.println();
//
//        Computer computer1 = new Computer("уам", "iцус37");
//        CPU cpu1 = new CPU(1700, "AMD", 100,0.3);
//        computer1.setCPU(cpu1);
//        RAM ram1 = new RAM("Apaцвсce", 500,1.5);
//        computer1.setRam(ram1);
//        InformationStorage informationStorage1 = new InformationStorage("SSD", 200,2);
//        computer1.setInformationStorage(informationStorage);
//        Screen screen1 = new Screen(54, "IPS", 1.5);
//        computer1.setScreen(screen1);
//        Keyboard keyboard1 = new Keyboard("AMD", true, 1.5);
//        computer1.setKeyboard(keyboard1);
//
//        System.out.println(computer1);
    }
}
