import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");

        if (components.length != 4) {
            throw new IllegalArgumentException("Некорректное количество компонентов в переданной строке с данными");
        }

        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];

        if (!isValidPhoneNumber(components[INDEX_PHONE])) {
            throw new IllegalArgumentException("Неверный формат номера телефона");
        }

        if (!isValidEmail(components[INDEX_EMAIL])) {
            throw new IllegalArgumentException("Неправильный формат e-mail");
        }

        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        // Проверка формата номера телефона
        // Реализация зависит от требований к формату номера телефона
        // В данном примере просто проверяем, что номер состоит только из цифр
        return phoneNumber.matches("\\d+");
    }

    private boolean isValidEmail(String email) {
        // Проверка формата e-mail
        // Реализация зависит от требований к формату e-mail
        // В данном примере просто проверяем, что e-mail содержит символ @
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