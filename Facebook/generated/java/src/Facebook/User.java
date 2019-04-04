package Facebook;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class User {
  private Object status = FacebookQuotes.LOGGED_OUTQuote.getInstance();
  private VDMSeq user_id = SeqUtil.seq();
  private VDMSet posts = SetUtil.set();
  private VDMSet friends = SetUtil.set();
  private String name;
  private String email;
  private String password;
  private VDMSet bestFriends = SetUtil.set();
  private Facebook dataBase = new Facebook();
  private Feed feed = new Feed();

  public User cg_init_User_1(
      final String newName,
      final String newEmail,
      final String newPassword,
      final VDMSet newPosts,
      final VDMSet newFriends) {

    name = newName;
    email = newEmail;
    password = newPassword;
    posts = Utils.copy(newPosts);
    friends = Utils.copy(newFriends);
    status = FacebookQuotes.LOGGED_INQuote.getInstance();
    return dataBase.addUserToUsers(this);
  }

  public User(
      final String newName,
      final String newEmail,
      final String newPassword,
      final VDMSet newPosts,
      final VDMSet newFriends) {

    cg_init_User_1(newName, newEmail, newPassword, Utils.copy(newPosts), Utils.copy(newFriends));
  }

  public void editName(final String newName) {

    name = newName;
  }

  public Object getStatus() {

    return status;
  }

  public Feed getFeed() {

    return feed;
  }

  public String getEmail() {

    return email;
  }

  public String getName() {

    return name;
  }

  public VDMSeq getUserID() {

    return Utils.copy(user_id);
  }

  public String getPassword() {

    return password;
  }

  public VDMSet getFriends() {

    return Utils.copy(friends);
  }

  public VDMSet getPosts() {

    return Utils.copy(posts);
  }

  public VDMSet getBestFriends() {

    return Utils.copy(bestFriends);
  }

  public void setName(final String newName) {

    name = newName;
  }

  public void setEmail(final String newEmail) {

	    email = newEmail;
	  }
  
  public void setPassword(final String newPassword) {

	    password = newPassword;
	  }
  
  public void setStatus(final Object newStatus) {

    status = newStatus;
  }

  public Boolean editPassword(final String oldPassword, final String newPassword) {

    if (Utils.equals(password, oldPassword)) {
      password = newPassword;
      return true;

    } else {
      return false;
    }
  }

  public Post addPost(final Post newPost) {

    posts = SetUtil.union(SetUtil.set(newPost), Utils.copy(posts));
    return dataBase.addPostToPosts(newPost);
  }

  public Boolean removePost(final Post selectedPost) {

    posts = SetUtil.diff(Utils.copy(posts), SetUtil.set(selectedPost));
    return dataBase.removePostFromPosts(selectedPost);
  }

  public void addFriend(final User friend) {

    this.addFriendAux(friend);
    friend.addFriendAux(this);
  }

  public void addFriendAux(final User friend) {

    friends = SetUtil.union(SetUtil.set(friend), Utils.copy(friends));
  }

  public void removeFriend(final User selectedFriend) {

    this.removeFriendAux(selectedFriend);
    selectedFriend.removeFriendAux(this);
  }

  public void removeFriendAux(final User selectedFriend) {

    friends = SetUtil.diff(Utils.copy(friends), SetUtil.set(selectedFriend));
  }

  public Boolean checkFriend(final User selectedUser) {

    if (SetUtil.inSet(selectedUser, friends)) {
      return true;
    }

    return false;
  }

  public Boolean checkBestFriend(final User selectedUser) {

    if (SetUtil.inSet(selectedUser, bestFriends)) {
      return true;
    }

    return false;
  }

  public void addBestFriend(final User friend) {

    if (checkFriend(friend)) {
      bestFriends = SetUtil.union(SetUtil.set(friend), Utils.copy(bestFriends));
    }
  }

  public void removeBestFriend(final User selectedFriend) {

    bestFriends = SetUtil.diff(Utils.copy(bestFriends), SetUtil.set(selectedFriend));
  }

  public void printUser() {

    IO.print("\nName: ");
    IO.print(this.name);
    IO.print("\n");
    IO.print("Email: ");
    IO.print(this.email);
    IO.print("\n");
  }

  public User() {}

  public String toString() {

    return "User{}";
      /*  + "status := "
        + Utils.toString(status)
        + ", user_id := "
        + Utils.toString(user_id)
        + ", posts := "
        + Utils.toString(posts)
        + ", friends := "
        + Utils.toString(friends)
        + ", name := "
        + Utils.toString(name)
        + ", email := "
        + Utils.toString(email)
        + ", password := "
        + Utils.toString(password)
        + ", bestFriends := "
        + Utils.toString(bestFriends)
        + ", dataBase := "
        + Utils.toString(dataBase)
        + ", feed := "
        + Utils.toString(feed)
        + "}";*/
  }
}
