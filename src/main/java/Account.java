public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null || name.isEmpty()) {
            return false;
        }

        int length = name.length();
        if (length < 3 || length > 19) {
            return false;
        }

        int spaceIndex = name.indexOf(' ');
        int lastSpaceIndex = name.lastIndexOf(' ');

        // Проверяем, что есть ровно один пробел и он не в начале/конце
        if (spaceIndex != lastSpaceIndex || spaceIndex == -1) {
            return false;
        }

        if (spaceIndex == 0 || spaceIndex == length - 1) {
            return false;
        }

        return true;
    }
}