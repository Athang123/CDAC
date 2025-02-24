
//calculate sum of 1st 50 natural numbers


class Q1{      
    public static void main(String args[]){
        int a=50;   //entering how many numbers to calculate
        int res=0;  //taking a rsult int 
        for(int i=1;i<=a;i++) //using for loop to calculate the result
        {
           res=res+i;   
        }
        System.out.println(res);
    }
}

/* dry run
 
a=50
res=0

for
i=1
i<=50 true
i++=1(post incre=2)
1+0=1

res=1
i=2
i<=50 true
i++=2(post incre=3)
1+2=3


 
 */

//answer is 1275