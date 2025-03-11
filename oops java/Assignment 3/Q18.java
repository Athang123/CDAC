class Q18{
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={4,5,6};
   
        int arr[][]=new int[2][];
         arr[0]=a;
         arr[1]=b;

         for(int ar[]: arr){
            for(int x:ar){
                System.out.print(x+" ");
            }
            System.out.println();
         }


    }
}