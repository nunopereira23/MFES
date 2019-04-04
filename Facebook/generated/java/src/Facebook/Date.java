package Facebook;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Date {
  private CalendarDate calendardate = new CalendarDate(2019L, 1L, 1L);
  private TimeStamp timestamp = new TimeStamp(0L, 0L, 0L);

  public void cg_init_Date_2(
      final Number yr,
      final Number mnth,
      final Number d,
      final Number hrs,
      final Number mnts,
      final Number scnds) {

    calendardate.year = yr;
    calendardate.month = mnth;
    calendardate.day = d;
    timestamp.hours = hrs;
    timestamp.minutes = mnts;
    timestamp.seconds = scnds;
  }

  public void cg_init_Date_1() {

    calendardate.year = 2019L;
    calendardate.month = 1L;
    calendardate.day = 1L;
    timestamp.hours = 0L;
    timestamp.minutes = 0L;
    timestamp.seconds = 0L;
  }

  public Date() {

    cg_init_Date_1();
  }

  public Date(
      final Number yr,
      final Number mnth,
      final Number d,
      final Number hrs,
      final Number mnts,
      final Number scnds) {

    cg_init_Date_2(yr, mnth, d, hrs, mnts, scnds);
  }

  public Boolean isEqual(final Date date) {

    Boolean andResult_1 = false;

    if (Utils.equals(this.calendardate.year, date.calendardate.year)) {
      Boolean andResult_2 = false;

      if (Utils.equals(this.calendardate.month, date.calendardate.month)) {
        Boolean andResult_3 = false;

        if (Utils.equals(this.calendardate.day, date.calendardate.day)) {
          Boolean andResult_4 = false;

          if (Utils.equals(this.timestamp.hours, date.timestamp.hours)) {
            Boolean andResult_5 = false;

            if (Utils.equals(this.timestamp.minutes, date.timestamp.minutes)) {
              if (Utils.equals(this.timestamp.seconds, date.timestamp.seconds)) {
                andResult_5 = true;
              }
            }

            if (andResult_5) {
              andResult_4 = true;
            }
          }

          if (andResult_4) {
            andResult_3 = true;
          }
        }

        if (andResult_3) {
          andResult_2 = true;
        }
      }

      if (andResult_2) {
        andResult_1 = true;
      }
    }

    if (andResult_1) {
      return true;

    } else {
      return false;
    }
  }

  public Boolean isOlder(final Date date) {

    if (this.calendardate.year.longValue() < date.calendardate.year.longValue()) {
      return true;

    } else {
      if (this.calendardate.year.longValue() > date.calendardate.year.longValue()) {
        return false;
      }
    }

    if (this.calendardate.month.longValue() < date.calendardate.month.longValue()) {
      return true;

    } else {
      if (this.calendardate.month.longValue() > date.calendardate.month.longValue()) {
        return false;
      }
    }

    if (this.calendardate.day.longValue() < date.calendardate.day.longValue()) {
      return true;

    } else {
      if (this.calendardate.day.longValue() > date.calendardate.day.longValue()) {
        return false;
      }
    }

    if (this.timestamp.hours.longValue() < date.timestamp.hours.longValue()) {
      return true;

    } else {
      if (this.timestamp.hours.longValue() > date.timestamp.hours.longValue()) {
        return false;
      }
    }

    if (this.timestamp.minutes.longValue() < date.timestamp.minutes.longValue()) {
      return true;

    } else {
      if (this.timestamp.minutes.longValue() > date.timestamp.minutes.longValue()) {
        return false;
      }
    }

    if (this.timestamp.seconds.longValue() < date.timestamp.seconds.longValue()) {
      return true;

    } else {
      if (this.timestamp.seconds.longValue() > date.timestamp.seconds.longValue()) {
        return false;
      }
    }

    return false;
  }

  public void printDate(final Date date) {

    IO.print("Date: ");
    IO.print(date.calendardate.day);
    IO.print("/");
    IO.print(date.calendardate.month);
    IO.print("/");
    IO.print(date.calendardate.year);
    IO.print(" at ");
    IO.print(date.timestamp.hours);
    IO.print(":");
    IO.print(date.timestamp.minutes);
  }

  public String toString() {

    return "Date{"
        + "calendardate := "
        + Utils.toString(calendardate)
        + ", timestamp := "
        + Utils.toString(timestamp)
        + "}";
  }

  public static class CalendarDate implements Record {
    public Number year;
    public Number month;
    public Number day;

    public CalendarDate(final Number _year, final Number _month, final Number _day) {

      year = _year;
      month = _month;
      day = _day;
    }

    public boolean equals(final Object obj) {

      if (!(obj instanceof CalendarDate)) {
        return false;
      }

      CalendarDate other = ((CalendarDate) obj);

      return (Utils.equals(year, other.year))
          && (Utils.equals(month, other.month))
          && (Utils.equals(day, other.day));
    }

    public int hashCode() {

      return Utils.hashCode(year, month, day);
    }

    public CalendarDate copy() {

      return new CalendarDate(year, month, day);
    }

    public String toString() {

      return "mk_Date`CalendarDate" + Utils.formatFields(year, month, day);
    }
  }

  public static Boolean inv_CalendarDate(final CalendarDate cd) {

    Boolean andResult_6 = false;

    if (cd.month.longValue() <= 12L) {
      if (cd.day.longValue() <= 31L) {
        andResult_6 = true;
      }
    }

    return andResult_6;
  }

  public static class TimeStamp implements Record {
    public Number hours;
    public Number minutes;
    public Number seconds;

    public TimeStamp(final Number _hours, final Number _minutes, final Number _seconds) {

      hours = _hours;
      minutes = _minutes;
      seconds = _seconds;
    }

    public boolean equals(final Object obj) {

      if (!(obj instanceof TimeStamp)) {
        return false;
      }

      TimeStamp other = ((TimeStamp) obj);

      return (Utils.equals(hours, other.hours))
          && (Utils.equals(minutes, other.minutes))
          && (Utils.equals(seconds, other.seconds));
    }

    public int hashCode() {

      return Utils.hashCode(hours, minutes, seconds);
    }

    public TimeStamp copy() {

      return new TimeStamp(hours, minutes, seconds);
    }

    public String toString() {

      return "mk_Date`TimeStamp" + Utils.formatFields(hours, minutes, seconds);
    }
  }

  public static Boolean inv_TimeStamp(final TimeStamp ts) {

    Boolean andResult_8 = false;

    if (ts.hours.longValue() <= 23L) {
      Boolean andResult_9 = false;

      if (ts.minutes.longValue() <= 59L) {
        if (ts.seconds.longValue() <= 59L) {
          andResult_9 = true;
        }
      }

      if (andResult_9) {
        andResult_8 = true;
      }
    }

    return andResult_8;
  }
}
