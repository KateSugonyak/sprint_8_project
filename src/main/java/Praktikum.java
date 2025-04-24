public class Praktikum {

    public static void main(String[] args) {
        String nameToCheck = "Тимоти Шаламе"; // Тестируемое имя
        Account account = new Account(nameToCheck);

        if (account.checkNameToEmboss()) {
            System.out.println("Имя \"" + nameToCheck + "\" можно напечатать на карте");
        } else {
            System.out.println("Имя \"" + nameToCheck + "\" не соответствует требованиям");
        }
    }
}