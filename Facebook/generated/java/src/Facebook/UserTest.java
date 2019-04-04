/*package Facebook;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class UserTest {
  public User user =
      new User("testUser", "testEmail@hotmail.com", "testPassword", SetUtil.set(), SetUtil.set());
  public Facebook facebook = new Facebook();

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

  public void userConstructorTest() {

    User testUser =
        new User("testUser", "testEmail@hotmail.com", "testPassword", SetUtil.set(), SetUtil.set());
    assertTrue(Utils.equals(testUser.getName(), "testUser"));
    assertTrue(Utils.equals(testUser.getEmail(), "testEmail@hotmail.com"));
    assertTrue(Utils.equals(testUser.getPassword(), "testPassword"));
    assertTrue(Utils.empty(testUser.getFriends()));
    assertTrue(Utils.empty(testUser.getPosts()));
    return;
  }

  public void addRemoveFriendTest() {

    User u1 =
        new User(
            "testUser1", "testEmail1@hotmail.com", "testPassword1", SetUtil.set(), SetUtil.set());
    User u2 =
        new User(
            "testUser2", "testEmail2@hotmail.com", "testPassword2", SetUtil.set(), SetUtil.set());
    User u3 =
        new User(
            "testUser3", "testEmail3@hotmail.com", "testPassword3", SetUtil.set(), SetUtil.set());
    assertTrue(Utils.empty(u1.getFriends()));
    assertTrue(Utils.empty(u1.getPosts()));
    u1.addFriend(u2);
    assertTrue(Utils.equals(u1.getFriends().size(), 1L));
    Boolean forAllExpResult_2 = true;
    VDMSet set_4 = u1.getFriends();
    for (Iterator iterator_4 = set_4.iterator(); iterator_4.hasNext() && forAllExpResult_2; ) {
      User us = ((User) iterator_4.next());
      forAllExpResult_2 = Utils.equals(us.getName(), "testUser2");
    }
    assertTrue(forAllExpResult_2);

    assertTrue(Utils.equals(u2.getFriends().size(), 1L));
    Boolean forAllExpResult_3 = true;
    VDMSet set_5 = u2.getFriends();
    for (Iterator iterator_5 = set_5.iterator(); iterator_5.hasNext() && forAllExpResult_3; ) {
      User us = ((User) iterator_5.next());
      forAllExpResult_3 = Utils.equals(us.getName(), "testUser1");
    }
    assertTrue(forAllExpResult_3);

    u1.addFriend(u3);
    assertTrue(Utils.equals(u1.getFriends().size(), 2L));
    Long exists1Counter_3 = 0L;
    VDMSet set_6 = u1.getFriends();
    for (Iterator iterator_6 = set_6.iterator();
        iterator_6.hasNext() && (exists1Counter_3.longValue() < 2L);
        ) {
      User us = ((User) iterator_6.next());
      if (Utils.equals(us.getName(), "testUser3")) {
        exists1Counter_3++;
      }
    }
    assertTrue(Utils.equals(exists1Counter_3, 1L));

    assertTrue(Utils.equals(u3.getFriends().size(), 1L));
    Boolean forAllExpResult_4 = true;
    VDMSet set_7 = u3.getFriends();
    for (Iterator iterator_7 = set_7.iterator(); iterator_7.hasNext() && forAllExpResult_4; ) {
      User us = ((User) iterator_7.next());
      forAllExpResult_4 = Utils.equals(us.getName(), "testUser1");
    }
    assertTrue(forAllExpResult_4);

    u1.removeFriend(u2);
    assertTrue(Utils.equals(u1.getFriends().size(), 1L));
    Boolean forAllExpResult_5 = true;
    VDMSet set_8 = u1.getFriends();
    for (Iterator iterator_8 = set_8.iterator(); iterator_8.hasNext() && forAllExpResult_5; ) {
      User us = ((User) iterator_8.next());
      forAllExpResult_5 = Utils.equals(us.getName(), "testUser3");
    }
    assertTrue(forAllExpResult_5);

    assertTrue(Utils.equals(u2.getFriends().size(), 0L));
    u1.addBestFriend(u3);
    assertTrue(Utils.equals(u1.getBestFriends().size(), 1L));
    Boolean forAllExpResult_6 = true;
    VDMSet set_9 = u1.getBestFriends();
    for (Iterator iterator_9 = set_9.iterator(); iterator_9.hasNext() && forAllExpResult_6; ) {
      User us = ((User) iterator_9.next());
      forAllExpResult_6 = Utils.equals(us.getName(), "testUser3");
    }
    assertTrue(forAllExpResult_6);

    u1.removeBestFriend(u3);
    assertTrue(Utils.equals(u1.getBestFriends().size(), 0L));
    u1.removeFriend(u3);
    assertTrue(Utils.equals(u1.getFriends().size(), 0L));
    assertTrue(Utils.equals(u3.getFriends().size(), 0L));
    return;
  }

  public void editName() {

    user.editName("ModifiedName");
    assertTrue(Utils.equals(user.getName().length(), 12L));
    assertTrue(Utils.equals(user.getName(), "ModifiedName"));
    user.editName("");
    assertTrue(Utils.equals(user.getName().length(), 0L));
    assertTrue(Utils.equals(user.getName(), ""));
    return;
  }

  public void loginLogout() {

    User u2 =
        new User(
            "testUser2", "testEmail2@hotmail.com", "testPassword2", SetUtil.set(), SetUtil.set());
    user.addFriend(u2);
    assertTrue(Utils.equals(u2.getStatus(), FacebookQuotes.LOGGED_INQuote.getInstance()));
    assertTrue(Utils.equals(facebook.logoff("testEmail2@hotmail.com"), true));
    assertEqual(((Object) user.getStatus()), FacebookQuotes.LOGGED_OUTQuote.getInstance());
    assertTrue(Utils.equals(facebook.login("testEmail2@hotmail.com", "testPassword2"), true));
    assertEqual(((Object) user.getStatus()), FacebookQuotes.LOGGED_INQuote.getInstance());
    assertTrue(Utils.equals(user.checkFriend(u2), true));
    return;
  }

  public static void main() {

    UserTest UserTest = new UserTest();
    UserTest.userConstructorTest();
    UserTest.addRemoveFriendTest();
    UserTest.editName();
    return;
  }

  public UserTest() {}

  public String toString() {

    return "UserTest{"
        + "user := "
        + Utils.toString(user)
        + ", facebook := "
        + Utils.toString(facebook)
        + "}";
  }
}
*/