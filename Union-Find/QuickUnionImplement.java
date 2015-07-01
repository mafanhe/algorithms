**
*weighted Quick-Union
*modify quick-union to avoid tall trees.
*keep track of size of each tree(number of objects).
*balance by linking root of smaller tree to root of larger tree.
*Data structure. same as quick-union, but maintain extra array sz[i]
*to count number of objects in the tree root at i.
*Find. identical to quick-union
*        return root(p) == root(q);
*Uinon. modify quick-union to:
*     *link root of samller tree to root of large tree.
*     *update the sz[] array.
*     int i = root(p);
*     int j = root(q);
*     if(i == j) returm;
*     if(sz[i]<sz[j]){id[i]=j;sz[j]+=sz[i];}
*     else{id[j]=i;sz[i]+=sz[j];}
*
*initialize union find
*    N      lgN+  lgN
*/



**
*Path compression Quick-Union
*Two-pass implementation:add second loop to root() to set the id[] of each examined node to the root.
*
*Simpler one-pass variant:make every other node in the path point to its grandparent(thereby halving path length).
*
*private int root(int i)
*{
* whlie (i!=id[i])
* {
*   id[i] = id[id[i]];    //the implementation;
*   i= id[i]; 
* }
* return i;  
*}
*
*
*
*
*initialize union find
*    N      lgN+  lgN
*/
