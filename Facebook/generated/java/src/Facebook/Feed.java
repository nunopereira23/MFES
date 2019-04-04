package Facebook;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Feed {
  public void getAllVisiblePostsForMe(final Facebook facebook, final User user) {

    IO.print("********************* \n");
    IO.print("******News Feed****** \n");
    IO.print("********************* \n\n");
    this.getAllPublicPosts(facebook);
    this.getAllFriendsPosts(user);
    this.getAllBestFriendsPosts(user);
  }

  public void getAllPublicPosts(final Facebook facebook) {

    for (Iterator iterator_12 = facebook.getUsers().iterator(); iterator_12.hasNext(); ) {
      User user1 = (User) iterator_12.next();
      for (Iterator iterator_13 = user1.getPosts().iterator(); iterator_13.hasNext(); ) {
        Post post1 = (Post) iterator_13.next();
        if (Utils.equals(post1.getIfPrivate(), 0L)) {
          IO.print(user1.getName());
          IO.print(" said: ");
          IO.print("\n");
          IO.print(post1.getDescription());
          IO.print("\n");
          post1.getDate().printDate(post1.getDate());
          IO.print("\n\n");
        }
      }
    }
  }

  public void getAllFriendsPosts(final User user) {

    for (Iterator iterator_14 = user.getFriends().iterator(); iterator_14.hasNext(); ) {
      User user1 = (User) iterator_14.next();
      for (Iterator iterator_15 = user1.getPosts().iterator(); iterator_15.hasNext(); ) {
        Post post1 = (Post) iterator_15.next();
        if (Utils.equals(post1.getIfPrivate(), 1L)) {
          IO.print(user1.getName());
          IO.print(" said: ");
          IO.print("\n");
          IO.print(post1.getDescription());
          IO.print("\n");
          post1.getDate().printDate(post1.getDate());
          IO.print("\n\n");
        }
      }
    }
  }

  public void getAllBestFriendsPosts(final User user) {

    for (Iterator iterator_16 = user.getFriends().iterator(); iterator_16.hasNext(); ) {
      User user1 = (User) iterator_16.next();
      for (Iterator iterator_17 = user1.getBestFriends().iterator(); iterator_17.hasNext(); ) {
        User us = (User) iterator_17.next();
        if (Utils.equals(us.getEmail(), user.getEmail())) {
          for (Iterator iterator_18 = user1.getPosts().iterator(); iterator_18.hasNext(); ) {
            Post post1 = (Post) iterator_18.next();
            if (Utils.equals(post1.getIfPrivate(), 2L)) {
              IO.print(user1.getName());
              IO.print(" said: ");
              IO.print("\n");
              IO.print(post1.getDescription());
              IO.print("\n");
              post1.getDate().printDate(post1.getDate());
              IO.print("\n\n");
            }
          }
        }
      }
    }
  }

  public void getMyPosts(final User user) {

    IO.print("********************* \n");
    IO.print("*****My  Profile***** \n");
    IO.print("********************* \n\n");
    for (Iterator iterator_19 = user.getPosts().iterator(); iterator_19.hasNext(); ) {
      Post post1 = (Post) iterator_19.next();
      IO.print("You wrote: ");
      IO.print("\n");
      IO.print(post1.getDescription());
      IO.print("\n");
      post1.getDate().printDate(post1.getDate());
      IO.print("\n\n");
    }
  }

  public Feed() {}

  public String toString() {

    return "Feed{}";
  }
}
