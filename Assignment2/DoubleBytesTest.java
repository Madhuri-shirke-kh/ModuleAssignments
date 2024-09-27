public class DoubleBytesTest {
    public static void main(String[] args) {
        int bytes = Double.BYTES;
        System.out.println("Number of bytes used to represent a double: " + bytes);
 
 
        System.out.println("Minimum value of double: " + Double.MIN_VALUE);
        System.out.println("Maximum value of double: " + Double.MAX_VALUE);
   

        double number = 123.456;
        String strNumber1 = Double.toString(number);
        System.out.println("String representation of double: " + strNumber1);
  

        String strNumber2 = "456.789";
        double number1 = Double.parseDouble(strNumber2);
        System.out.println("Double value from String: " + number1);
    
        String strNumber3 = "Ab12Cd3";
        try {
            double number2 = Double.parseDouble(strNumber3);
            System.out.println("Double value from String: " + number2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid string for conversion: " + strNumber3);
        }
  

        double number3 = 789.123;
        Double doubleWrapper1 = Double.valueOf(number3);
        System.out.println("Wrapper class object: " + doubleWrapper1);
    

       String strNumber4 = "987.654";
        Double doubleWrapper2 = Double.valueOf(strNumber4);
        System.out.println("Wrapper class object from String: " + doubleWrapper2);
    

        double a = 112.2;
        double b = 984.5;
        double sum = Double.sum(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
    

         double a1=112.4;      
         double b1 = 556.6;
        double min = Double.min(a1, b1);
        double max = Double.max(a1, b1);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    

        double number6 = -25.0;
        double sqrtValue = Math.sqrt(number6);
        System.out.println("Square root of " + number6 + ": " + sqrtValue);
    

        double a2 = 0.0;
        double b2 = 0.0;
        double result = a2 / b2;
        System.out.println("Result of 0.0 / 0.0: " + result);
    
       double number5 = 123.456;
       
        int intValue3 = (int) number5;
        System.out.println("Double to int: " + intValue3);

        
        float floatValue1 = (float) number5;
        System.out.println("Double to float: " + floatValue1);

       
        long longValue1 = (long) number5;
        System.out.println("Double to long: " + longValue1);
 }
}