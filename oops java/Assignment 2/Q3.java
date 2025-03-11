class Q3 {
 public static void main(String args[]){
   
    int a=643;
    int temp=a;
    int sum=0;
    System.out.println(temp);
   while(temp!=0){
     int res=temp%10;
     sum=sum+res;
     temp=temp/10;
   }
     System.out.println(sum);
 }   
}
