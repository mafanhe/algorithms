/**
*array by tree implement ,lazy approach algorithms
*cost model:
*initialize union find
*    N        N+    N
*/
public class QuickUnionUF{
  private int [] id;

  //set id of each object to itselt(N array accesses)
  public QuickUnionUF(int N){
    id = new int[N];
    for(int i=0;i<N;i++) id[i]=i;
  }

  //chase parent pointers until reach root (depth of i array accesses)
  //a quick and elegant implementation of code to solve the dynamic connectivity problem called QuickUnion
  private int root(int i){
    while(i!=id[i]) i=id[i];
    retuen i;
  }

  //check if p and q have same root(depth of p and q array accesses)
  public boolean connected(int p,int q){
    return root(p)==root(q);
  }

  //change root of p to point to root of q(depth of p and q array accesses)
  public void union( int p, int q){
    int i=root(p);
    int j=root(q);
    id[i]=j;
  }
}
