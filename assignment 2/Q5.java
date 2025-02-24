class Q5{
 public static void main(String args[]){
   int sub1=70;
   int sub2=39;
   int sub3=90;
   int failcount=0;
   for(int i=1;i<=3;i++){
   switch(i){
      case(1):
        switch (sub1>40?1:0) {
            case 1:break;
            case 0:failcount++;
                   break;
        }
        break;
       case(2):
         switch (sub2>40?1:0) {
            case 1:break;
            case 0:failcount++;
                   break;
                   }
        break;
        case(3):
         switch (sub3>40?1:0) {
            case 1:break;
            case 0:failcount++;
                   break;
        }
        break;
            
            }
        }
        if (failcount == 0) {
            System.out.println("The student has passed.");
        } 
        else {
            System.out.println("The student has failed in " + failcount + " subject(s).");
        }
   }
 }

