public static int binarySearch(int[] a,int key) {
  int lo = 0, hi =a.length-1;
  while(lo<=hi){
    int mid=lo+(hi-lo)/2;
    if(key<mid) hi=mid-1;
    else if(key>mid)lo=mid+1;
    else return mid;
  }
  return -1;
}
