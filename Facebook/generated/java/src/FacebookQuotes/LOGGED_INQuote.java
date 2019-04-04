package FacebookQuotes;

import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class LOGGED_INQuote {
  private static int hc = 0;
  private static LOGGED_INQuote instance = null;

  public LOGGED_INQuote() {

    if (Utils.equals(hc, 0)) {
      hc = super.hashCode();
    }
  }

  public static LOGGED_INQuote getInstance() {

    if (Utils.equals(instance, null)) {
      instance = new LOGGED_INQuote();
    }

    return instance;
  }

  public int hashCode() {

    return hc;
  }

  public boolean equals(final Object obj) {

    return obj instanceof LOGGED_INQuote;
  }

  public String toString() {

    return "<LOGGED_IN>";
  }
}
