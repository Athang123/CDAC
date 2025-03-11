class Q7{

    public static void main(String[] args) {
      
        int year=2000;
        
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

      
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

    }
}

 


