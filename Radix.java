import java.lang.Math;
public class Radix{
  public static int nth(int n, int col){
    n = Math.abs(n);
    double ans = (double)n % Math.pow(10, col+1);
    return ((int)(ans / Math.pow(10 ,col)));
  }
}
