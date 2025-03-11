class Q19 {
public static void main(String args[]){
int[][] a={{1,2},{1,5}};
int[][] b={{5,6},{1,3}};


/*1,2    5,6
 *1,5    1,3 
 * 
 */

int [][]sum=new int[2][];
sum[0]=new int[2];
sum[1]=new int[2];
for(int i=0;i<2;i++){
   for(int j=0;j<2;j++){
    sum[i][j]  = a[i][j]+b[i][j];
    System.out.print(sum[i][j]+" ");
   }
   System.out.println();


}


}  

}
