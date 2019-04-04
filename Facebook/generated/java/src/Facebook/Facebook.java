package Facebook;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Facebook {
  private VDMSet users;
  private VDMSet posts;

  public void cg_init_Facebook_1() {

    users = SetUtil.set();
    posts = SetUtil.set();
  }

  public Facebook() {

    cg_init_Facebook_1();
  }

  public VDMSet getUsers() {

    return this.users;
  }

  public User register(
      final String registerName, final String registerEmail, final String registerPassword) {

    if (Utils.equals(getUserByEmail(registerEmail), null)) {
      User newUser =
          new User(registerName, registerEmail, registerPassword, SetUtil.set(), SetUtil.set());
      users = SetUtil.union(Utils.copy(users), SetUtil.set(newUser));
      return newUser;
    }

    IO.print("Ja existe um utilizador registado com esse e-mail!");
    return null;
  }

  public Boolean login(final String loginEmail, final String loginPassword) {
	  
    if (Utils.equals(getUserByEmail(loginEmail).getPassword(), loginPassword)) {
      getUserByEmail(loginEmail).setStatus(FacebookQuotes.LOGGED_INQuote.getInstance());
      return true;
    }

    return false;
  }

  public Boolean logoff(final String loginEmail) {

    if (Utils.equals(
        getUserByEmail(loginEmail).getStatus(), FacebookQuotes.LOGGED_INQuote.getInstance())) {
      getUserByEmail(loginEmail).setStatus(FacebookQuotes.LOGGED_OUTQuote.getInstance());
      return true;

    } else {
      return false;
    }
  }

  public User getUserByEmail(final String email) {

    for (Iterator iterator_10 = users.iterator(); iterator_10.hasNext(); ) {
      User user = (User) iterator_10.next();
      if (Utils.equals(user.getEmail(), email)) {
        return user;
      }
    }
    return null;
  }

  public User addUserToUsers(final User newUser) {

    users = SetUtil.union(SetUtil.set(newUser), Utils.copy(users));
    return newUser;
  }

  public Boolean removeUserFromUsers(final User selectedUser) {

    users = SetUtil.diff(Utils.copy(users), SetUtil.set(selectedUser));
    return true;
  }

  public Post addPostToPosts(final Post newPost) {

    posts = SetUtil.union(SetUtil.set(newPost), Utils.copy(posts));
    return newPost;
  }

  public Boolean removePostFromPosts(final Post selectedPost) {

    posts = SetUtil.diff(Utils.copy(posts), SetUtil.set(selectedPost));
    return true;
  }

  public void printAllUsers(final VDMSet allUsers) {

    for (Iterator iterator_11 = allUsers.iterator(); iterator_11.hasNext(); ) {
      User user1 = (User) iterator_11.next();
      user1.printUser();
    }
  }

  public String toString() {

    return "Facebook{"
        //+ "users := "
        //+ Utils.toString(users)
        //+ ", posts := "
        //+ Utils.toString(posts)
        + "}";
  }
}
