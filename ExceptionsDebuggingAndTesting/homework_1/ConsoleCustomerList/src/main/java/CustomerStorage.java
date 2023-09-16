import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public boolean addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];

        if (components.length != 4) {
//            throw new IllegalArgumentException("Некорректное количество компонентов в переданной строке с данными");
            return false;
        }

        if (!isValidPhoneNumber(components[INDEX_PHONE])) {
            throw new IllegalArgumentException("Неверный формат номера телефона");
        }

        if (!isValidEmail(components[INDEX_EMAIL])) {
            throw new IllegalArgumentException("Неправильный формат e-mail");
        }
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));

        return true;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
    }

    private boolean isValidEmail(String email) {
        return email.contains("@");
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}