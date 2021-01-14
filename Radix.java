import java.lang.Math;
public class Radix{
  public static int nth(int n, int col){
    n = Math.abs(n);
    double ans = (double)n % Math.pow(10, col+1);
    return ((int)(ans / Math.pow(10 ,col)));
  }
public static int length(int n){
  n = Math.abs(n);
  if (n == 0){
    return 1;
  }
  return ((int)Math.log10(n)+1);
}
public static void merge(SortableLinkedList original, SortableLinkedList[]buckets){
  for (SortableLinkedList i : buckets){
            if (i.size() > 0){
                original.extend(i);
            }
        }
}

}
