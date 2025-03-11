public class Q19 {
    public static void main(String[] args) {
        char ch = 'n';
        
        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : 
                        (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not a letter";
        
        System.out.println(ch + " is " + result);
    }

}
