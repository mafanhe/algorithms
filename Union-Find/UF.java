public class UF
{
  UF(int N) ;                    //initialize union-find data structure with N objects(0 to N-1)
  void union(int p, int q);      //add connection between p and q
  boolean connected(int p,int q) //are p and q in the same component?
  int find(int p)                //conponent identitier for p(0 to N-1)
  int count()                    //number of component

  public static void main(String[] args)
  {
    int N =StdIn.reafInt();
    UF uf = new UF(N);
    while(!StdIn.isEmpty())
    {
      int p = StdIn.readInt();
      int q = StdIn.readInt();
      if (!uf.connected(p,q)) {
        uf.unin(p,q);
        StdOut.println(p + " " + q);
      }
    }
  }
}
