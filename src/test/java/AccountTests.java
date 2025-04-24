import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTests {

    @Test
    @DisplayName("positive test")
    @Description("check correct owner name")
    public void testValidName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("no space test")
    @Description("check owner name without space")
    public void testNoSpace() {
        Account account = new Account("ТимотейШевроле");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("two space test")
    @Description("check owner name with two spaces")
    public void testTwoSpaces() {
        Account account = new Account("Тимоти Ша Ламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("first space test")
    @Description("check owner name with space in the start")
    public void testSpaceAtStart() {
        Account account = new Account(" ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("last space test")
    @Description("check owner name with space in the end")
    public void testSpaceAtEnd() {
        Account account = new Account("ТимотиШаламе ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("too short name test")
    @Description("check two symbols owner name ")
    public void testTooShort() {
        Account account = new Account("АБ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("too long name test")
    @Description("check twenty symbols owner name ")
    public void testTooLong() {
        Account account = new Account("Тимоти Шаламемемемем");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("null name test")
    @Description("check null owner name ")
    public void testNullInput() {
        Account account = new Account(null);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("empty name test")
    @Description("check empty owner name ")
    public void testEmptyInput() {
        Account account = new Account("");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("minimum name test")
    @Description("check three symbols owner name ")
    public void testMinimumValidLength() {
        Account account = new Account("Т Ш");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("maximum name test")
    @Description("check nineteen symbols owner name ")
    public void testMaximumValidLength() {
        Account account = new Account("Тимоти Шаламемемеме");
        assertTrue(account.checkNameToEmboss());
    }
}