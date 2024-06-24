
/****
 * Matthew is given two strings a
 and b
, both of length 3
. He thinks it's particularly funny to create two new words by swapping 
the first character of a
 with the first character of b
. He wants you to output a
 and b
 after the swap.

Note that the new words may not necessarily be different.

Input
The first line contains t
 (1≤t≤100
)  — the number of test cases.

The first and only line of each test case contains two space-separated strings, a
 and b
, both of length 3
. The strings only contain lowercase Latin letters.

Output
For each test case, after the swap, output a
 and b
, separated by a space.
 */
import java.util.Scanner;

public class createword {
  public static void main(String[] args) {
    int t;
    String a = new String();
    String b = new String();

    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < t; i++) {
      String line = sc.nextLine();
      String[] input = line.split(" ");
      if (input.length == 2) {
        a = input[0];
        b = input[1];
        String newa = b.charAt(0)+a.substring(1);;
        String newb = a.charAt(0)+b.substring(1);
        System.out.println(newa + " " + newb);
        
      }
    }
    sc.close();

  }

}
