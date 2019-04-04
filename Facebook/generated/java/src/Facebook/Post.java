package Facebook;

import java.util.*;

@SuppressWarnings("all")
public class Post {
	private String description;
	private Date date;
	private Number ifPrivate;

	public void cg_init_Post_1(
			final String newDescription, final Date newDate, final Number newPrivatePosts) {

		description = newDescription;
		date = newDate;
		ifPrivate = newPrivatePosts;
		return;
	}

	public Post(final String newDescription, final Date newDate, final Number newPrivatePosts) {

		cg_init_Post_1(newDescription, newDate, newPrivatePosts);
	}

	public String getDescription() {

		return description;
	}

	public Date getDate() {

		return date;
	}

	public Number getIfPrivate() {

		return ifPrivate;
	}

	public void setDescription(final String newDescription) {

		description = newDescription;
	}

	public void setDate(final Date newDate) {

		date = newDate;
	}

	public void setIfPrivate(final Number newIfPrivate) {

		ifPrivate = newIfPrivate;
	}

	public Boolean comparePostsByDate(final Post post1, final Post post2) {

		if (post1.getDate().isOlder(post2.getDate())) {
			return true;

		} else {
			return false;
		}
	}

	public Post() {}

	//  public String toString() {
	//
	//    return "Post{"
	//        + "description := "
	//        + cg_Utils.toString(description)
	//        + ", date := "
	//        + Utils.toString(date)
	//        + ", ifPrivate := "
	//        + Utils.toString(ifPrivate)
	//        + "}";
	//  }
}
