class Q21 {
    public static void main(String[] args) {
        int[][] a={{1,2},{3,4}};   
        /*1 2        00 01   
         *3 4        10 11
         */
        
                
       for(int i=0;i<a.length;i++){
            int rowsum=0;
            for(int j=0;j<a[i].length;j++){
                 rowsum=rowsum+a[i][j] ;
            }
            System.out.println(rowsum);
       }


                 
       for(int j=0;j<a.length;j++){
        int colsum=0;
        for(int i=0;i<a[j].length;i++){
             colsum=colsum+a[i][j] ;
        }
        System.out.println(colsum);
   }


        }
    }

