 class Q21 {
    public static void main(String[] args) {
       
        for (int i = 1; i <= 5; i++) {
            int tempo = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(tempo);
                if (j < i) System.out.print("*");
                tempo =tempo+ 2;
            }
            System.out.println();
        }
    }
}
