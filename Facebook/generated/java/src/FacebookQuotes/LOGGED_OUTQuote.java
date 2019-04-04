package FacebookQuotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class LOGGED_OUTQuote {
  private static int hc = 0;
  private static LOGGED_OUTQuote instance = null;

  public LOGGED_OUTQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static LOGGED_OUTQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new LOGGED_OUTQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof LOGGED_OUTQuote;
  }

  public String toString() {

    return "<LOGGED_OUT>";
  }
}
