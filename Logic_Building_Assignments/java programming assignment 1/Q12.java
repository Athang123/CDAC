class Q12{
public static void main (String args[]){

   

   int a=12345;
    int c=0;
    for (int i=a;i>0; )
    {
        int b=  i%10;
        c= (c*10) + b;
        i=i/10;
    }
    System.out.println("The reverse of "+ a +" is "+ c);
}   
}
