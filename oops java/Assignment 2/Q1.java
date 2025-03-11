class Q1{
 public static void main(String args[]){
    int a=4;
    int b=3;
    b=a^b;  //b=7
    a=a^b;  //4^7=3
    b=a^b;  //3^7=4

    System.out.println("The value of a after swappig is: "+a+"\n"+"The value of b after swappig is: "+b);
 }


}



