/*package Facebook;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class FacebookTest {
  private Facebook facebook = new Facebook();

  private void assertTrue(final Boolean cond) {

    return;
  }

  protected void assertEqual(final Object expected, final Object actual) {

    if (!(Utils.equals(expected, actual))) {
      IO.print("Actual value (");
      IO.print(((Object) actual));
      IO.print(") different from expected (");
      IO.print(((Object) expected));
      IO.print(")\n");
    }
  }

  public void facebookConstructorTest() {

    return;
  }

  public void registerTest() {

    if (!(Utils.equals(facebook.register("user1", "user1@hotmail.com", "1234"), null))) {
      IO.print("User Adicionado\n");
    }

    if (!(Utils.equals(facebook.register("user2", "user2@hotmail.com", "12345"), null))) {
      IO.print("User Adicionado\n");
    }

    assertEqual(facebook.register("user1 - Novo", "user1@hotmail.com", "1234"), null);
    assertEqual(
        ((Object) facebook.getUserByEmail("user1@hotmail.com").getStatus()),
        FacebookQuotes.LOGGED_INQuote.getInstance());
    assertEqual(
        ((Object) facebook.getUserByEmail("user2@hotmail.com").getStatus()),
        FacebookQuotes.LOGGED_INQuote.getInstance());
  }

  public void showUsersTest() {

    facebook.printAllUsers(facebook.getUsers());
  }

  public static void main() {

    FacebookTest FacebookTest = new FacebookTest();
    FacebookTest.facebookConstructorTest();
    FacebookTest.registerTest();
    FacebookTest.showUsersTest();
    return;
  }

  public FacebookTest() {}

  public String toString() {

    return "FacebookTest{" + "facebook := " + Utils.toString(facebook) + "}";
  }
}
*/