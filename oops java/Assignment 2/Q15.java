class Q15 {
    public static void main(String[] args) {
        int x = 0b1010101010101010;  
        
        int even_bits = x & 0xAAAAAAAA; 
        int odd_bits = x & 0x55555555; 
        
        even_bits >>= 1; 
        odd_bits <<= 1; 
        
        int result = even_bits | odd_bits; 
        
        System.out.println("Result after swapping odd and even bits: " + Integer.toBinaryString(result));
    }

}
