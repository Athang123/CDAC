class Q22 {
public static void main(String[] args) {
    int[][] a={{1,100},{3,4}};

    int max=0;
    
    //---------------------------------------------------
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
         if(a[i][j]>max){
            max=a[i][j];
         }
            
        }
     //-----------------------------------------------------   
       
    }
    System.out.println(max);
}
   




}
