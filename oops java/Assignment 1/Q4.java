class Q4 {
    public static void main(String[] args) {
        int i = 100;
        double d = 3.14;
        
        Double doubleVal = Double.valueOf(i);
        System.out.println("Integer to Double: " + doubleVal);
        
        Integer intVal = Integer.valueOf((int) d);
        System.out.println("Double to Integer: " + intVal);
    }

}
