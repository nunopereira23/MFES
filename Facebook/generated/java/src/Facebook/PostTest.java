/*package Facebook;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class PostTest {
  private void assertTrue(final Boolean cond) {

    return;
  }

  public void postConstructorTest() {

    Date date1 = new Date(2019L, 2L, 12L, 20L, 32L, 0L);
    Post post1 = new Post("O meu primeiro Post", date1, 1L);
    assertTrue(Utils.equals(post1.getDescription(), "O meu primeiro Post"));
    assertTrue(Utils.equals(post1.getIfPrivate(), 1L));
    assertTrue(Utils.equals(post1.getDate(), date1));
  }

  public void postSetParametersTest() {

    Date date1 = new Date(2019L, 2L, 12L, 20L, 32L, 0L);
    Date date2 = new Date(2019L, 2L, 13L, 21L, 21L, 21L);
    Post post1 = new Post("O meu primeiro Post", date1, 1L);
    post1.setDescription("Alterei o post");
    post1.setDate(date2);
    post1.setIfPrivate(0L);
    assertTrue(Utils.equals(post1.getDescription(), "Alterei o post"));
    assertTrue(Utils.equals(post1.getIfPrivate(), 0L));
    assertTrue(Utils.equals(post1.getDate(), date2));
  }

  public void postCompareDatesTest() {

    Date date1 = new Date(2019L, 2L, 12L, 20L, 32L, 0L);
    Date date2 = new Date(2019L, 3L, 12L, 20L, 32L, 0L);
    Post post1 = new Post("O meu primeiro Post", date1, 1L);
    Post post2 = new Post("O segundo Post", date2, 1L);
    assertTrue(Utils.equals(post1.comparePostsByDate(post1, post2), true));
    assertTrue(Utils.equals(post1.comparePostsByDate(post2, post1), false));
  }

  public static void main() {

    PostTest PostTest = new PostTest();
    PostTest.postConstructorTest();
    PostTest.postSetParametersTest();
    PostTest.postCompareDatesTest();
    return;
  }

  public PostTest() {}

  public String toString() {

    return "PostTest{}";
  }
}
*/