import java.util.Scanner;

public class Leap {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year = input.nextInt();
    boolean isLeapYear = isLeap(year);
    if (isLeapYear) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }
    input.close();
  }

  public static boolean isLeap(int year) {
    int divBy4 = year / 4;
    int divBy100 = year / 100;
    int divBy400 = year / 400;
    if (divBy4 * 4 == year) {
      if (divBy100 * 100 == year) {
        if (divBy400 * 400 == year) {
          return true;
        } else {
          return false;
        }
      } else {
        return true;
      }
    } else {
      return false;
    }
  }
}

