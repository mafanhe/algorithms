#include "stdio.h"
//计算两个整数的最大公约数
int gcd(int m, int n){
  if (m<n) gcd(n,m);
  if(n==0) return m;
  else return gcd(n,m%n);
}
int gcd2(int a,int b){
  int t=0;
  while(b!=0){
    t=a%b;
    a=b;
    b=t;
  }
  return a;
}
int main() {
  int a;
  int b;
  scanf("%d %d",&a,&b );
  printf("a=%d\n b=%d\n",a,b );
  //printf("b=%d\n",b );
  int c=gcd2(a,b);
  printf("gcd=%d\n",c );
  return 0;
}
