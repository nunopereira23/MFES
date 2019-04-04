/*package Facebook;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class FeedTest {
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

  public void feedConstructorTest() {

    return;
  }

  public void addRemovePostTest() {

    User u1 = facebook.register("testUser1", "testEmail1@hotmail.com", "testPassword1");
    User u2 = facebook.register("testUser2", "testEmail2@hotmail.com", "testPassword2");
    User u3 = facebook.register("testUser3", "testEmail3@hotmail.com", "testPassword3");
    User u4 = facebook.register("testUser4", "testEmail4@hotmail.com", "testPassword4");
    Date date1 = new Date(2019L, 2L, 12L, 20L, 32L, 0L);
    Date date2 = new Date(2019L, 2L, 12L, 20L, 33L, 0L);
    Date date3 = new Date(2019L, 2L, 12L, 20L, 35L, 0L);
    Post post1 = new Post("Post dum friend com privacidade publica", date1, 0L);
    Post post2 = new Post("Post dum friend com privacidade friends", date2, 1L);
    Post post3 = new Post("Primeiro post do 3", date3, 0L);
    Post post4 = new Post("Primeiro post no perfil", date1, 0L);
    Post post5 = new Post("Segundo post no perfil", date2, 0L);
    Post post6 = new Post("Terceiro post no perfil", date3, 0L);
    Post post7 = new Post("Post publico do user 4", date3, 0L);
    Post post8 = new Post("Post dum bestfriend com privaciade friends", date3, 1L);
    Post post9 = new Post("Post dum bestfriend com privacidade bestfriends", date3, 2L);
    assertTrue(Utils.equals(facebook.getUsers().size(), 4L));
    assertTrue(Utils.empty(u1.getFriends()));
    assertTrue(Utils.empty(u1.getPosts()));
    u1.addFriend(u2);
    assertTrue(Utils.equals(u1.getFriends().size(), 1L));
    Boolean forAllExpResult_1 = true;
    VDMSet set_1 = u1.getFriends();
    for (Iterator iterator_1 = set_1.iterator(); iterator_1.hasNext() && forAllExpResult_1; ) {
      User us = ((User) iterator_1.next());
      forAllExpResult_1 = Utils.equals(us.getName(), "testUser2");
    }
    assertTrue(forAllExpResult_1);

    u1.addFriend(u3);
    assertTrue(Utils.equals(u1.getFriends().size(), 2L));
    Long exists1Counter_1 = 0L;
    VDMSet set_2 = u1.getFriends();
    for (Iterator iterator_2 = set_2.iterator();
        iterator_2.hasNext() && (exists1Counter_1.longValue() < 2L);
        ) {
      User us = ((User) iterator_2.next());
      if (Utils.equals(us.getName(), "testUser3")) {
        exists1Counter_1++;
      }
    }
    assertTrue(Utils.equals(exists1Counter_1, 1L));

    u3.addBestFriend(u1);
    assertTrue(Utils.equals(u3.getBestFriends().size(), 1L));
    Long exists1Counter_2 = 0L;
    VDMSet set_3 = u3.getBestFriends();
    for (Iterator iterator_3 = set_3.iterator();
        iterator_3.hasNext() && (exists1Counter_2.longValue() < 2L);
        ) {
      User us = ((User) iterator_3.next());
      if (Utils.equals(us.getName(), "testUser1")) {
        exists1Counter_2++;
      }
    }
    assertTrue(Utils.equals(exists1Counter_2, 1L));

    assertEqual(u3.addPost(post3), post3);
    assertEqual(u3.addPost(post8), post8);
    assertEqual(u3.addPost(post9), post9);
    assertEqual(u2.addPost(post1), post1);
    assertEqual(u2.addPost(post2), post2);
    assertEqual(u1.addPost(post4), post4);
    assertEqual(u1.addPost(post5), post5);
    assertEqual(u1.addPost(post6), post6);
    assertEqual(u4.addPost(post7), post7);
    u1.getFeed().getAllVisiblePostsForMe(facebook, u1);
    u1.getFeed().getMyPosts(u1);
    return;
  }

  public static void main() {

    FeedTest FeedTest = new FeedTest();
    FeedTest.feedConstructorTest();
    FeedTest.addRemovePostTest();
    return;
  }

  public FeedTest() {}

  public String toString() {

    return "FeedTest{"
        + "user := "
        + Utils.toString(user)
        + ", facebook := "
        + Utils.toString(facebook)
        + "}";
  }
}
*/