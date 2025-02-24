class Q3{
   public static void main(String[] args) {
    double a=5;
    double b=5;
    double ans;
    char operator='/';
    switch (operator) {
        case '+':
               ans=a+b;
              System.out.println("addtion of two numbers "+a+" and "+b+ " is "+ans);
            break;
         case '-':
               ans=a-b;
              System.out.println("substraction of two numbers "+a+" and "+b+ " is "+ans);
            break;
         case '*':
               ans=a*b;
              System.out.println("multiplcation of two numbers "+a+" and "+b+ " is "+ans);
            break;
         case '/':
              if(b==0){
                          System.out.println("division with zero cannot be possible");
                         }
              else{
               ans=a/b;
              System.out.println("division of two numbers "+a+" and "+b+ " is "+ans);
                  }
break;
    
        default:
            break;
    }


   }


}