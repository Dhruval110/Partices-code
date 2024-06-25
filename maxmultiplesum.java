import java.util.Scanner;

public class maxmultiplesum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt(); // number of test cases

    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      int result = maxMultipleSum(n);
      System.out.println(result);
    }
    sc.close();
  }

  public static int maxMultipleSum(int n) {
    int max = 0;
    int optimalvalue = 2;

    for (int i = 2; i <= n; i++) {
      int sumarray = 0;
      for (int j = 1; j * i <= n; j++) {
        sumarray += j * i;
      }
      if (sumarray > max) {
        max = sumarray;
        optimalvalue = i;
      }
    }
    return optimalvalue;
  }
}
