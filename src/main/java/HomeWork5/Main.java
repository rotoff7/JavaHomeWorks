package HomeWork5;

public class Main {
    public static void main(String[] args) {
        PhoneBook phones = new PhoneBook();
        phones.PhoneNameAdd("Меригольд");
        phones.PhoneNameAdd("Смирнов");
        phones.PhoneNameAdd("Романова");
        phones.PhoneNameAdd("Палмер");
        phones.PhoneNameAdd("Шепард");
        phones.generateNumbers();
        System.out.println("\nКнига после заполненения:");
        phones.printPhoneBook();
        System.out.println("\nОтсортированная книга по кол-ву номеров:");
        phones.sortedPrint();
    }
}