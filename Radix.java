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
public static void radixSortSimple(SortableLinkedList data){
  SortableLinkedList[] buckets = new SortableLinkedList[10];
  for (int i = 0; i<10; i++){
    buckets[i] = new SortableLinkedList();
  }
  int passes = 0;
  for (int i = 0; i<data.size(); i++){
    if (length(data.get(i))>passes){
      passes = data.get(i);
    }
  }


  for (int j = 0; j<passes; j++){
      while (data.size()>0){
          int rm =data.remove(0);
          buckets[nth(rm,j)].add(rm);
      }
        merge(data,buckets);

  }

}
public static void radixSort(SortableLinkedList data){
  radixSortSimple(data);
}

}
