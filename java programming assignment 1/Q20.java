class Q20{
 public static void main(String args[]){
 int n=123456;
 int c=n;
 int count=0;
 while(c!=0){
  c=c/10;
  count++;

 }
 System.out.println("The number " + n+ " has "+ count +" digits");
}
}