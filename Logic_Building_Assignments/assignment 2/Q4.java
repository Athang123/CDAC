class Q4{
 public static void main(String args[]){
 double amount= 1000;
 char membership='N';
 double discount=0; 
if(amount>=1000){
 discount=0.20;
}
else if(amount>=500 && amount<=999){
 discount=0.10;
}
else if(amount<500)
{
discount=0.5;
}
System.out.println("The discount for the amount RS."+amount+" is "+discount*100+"%");

if(membership=='Y'){
discount=0.05+discount;
System.out.println("The discount for the amount with added membership is "+discount*100+"%");
}
else if(membership=='N'){
System.out.println("The discount for the amount without added membership is "+discount*100+"%");
}

double final_discount=amount*discount;
double final_amount= amount-final_discount;


System.out.println("Final amount after total discount is RS."+final_amount);

}

}