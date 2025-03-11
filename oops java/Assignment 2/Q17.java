class Q17 {
   
        public static void main(String args[]) {
            int a=1;
            int b=2;
            int c=3;
            int d=4;
            
   
                int min = (a < b) ?  ((a < c) ? ((a < d) ? a : d) : (c < d ? c : d))  
                          : ((b < c) ? ((b < d) ? b : d) : (c < d ? c : d));
            ;
            System.out.println( min);
        }
    }

