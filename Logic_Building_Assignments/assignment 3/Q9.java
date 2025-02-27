class Q9 {
   public static void main(String[] args) {
    int num=934;
    int max=0;
    System.out.println(num);
    while (num>0) {
       int res=num%10;
        if(res>max)
        {
            max=res;
        }
        
        num=num/10;
        
    }
    System.out.println("largest number is : "+max);
   } 
   
}
