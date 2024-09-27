public class FloatBytes {
    public static void main(String[] args) {
        System.out.println("Bytes used to represent a float: " + Float.BYTES);
 
        System.out.println("Minimum value of float: " + Float.MIN_VALUE);
        System.out.println("Maximum value of float: " + Float.MAX_VALUE);
    
       float number = 123.45f;
        String numberStr1 = Float.toString(number);
        System.out.println("String representation: " + numberStr1);
    
        String strNumber1 = "123.45";
        float number6 = Float.parseFloat(strNumber1);
        System.out.println("Converted float: " + number6);
 

        String strNumber2 = "Ab12Cd3";
        try {
            // Attempt to convert an invalid String to float
            float number2 = Float.parseFloat(strNumber2);
            System.out.println("Converted float: " + number2);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
   
       float number3 = 123.45f;
                Float wrapper1 = Float.valueOf(number3);
        System.out.println("Wrapper class: " + wrapper1);

        String strNumber3 = "123.45";
        Float wrapper2 = Float.valueOf(strNumber3);
        System.out.println("Wrapper class: " + wrapper2);
    

       float num1 = 112.3f;
        float num2 = 984.5f;
        
        float sum = Float.sum(num1, num2);
        System.out.println("Sum: " + sum);
    


        float num3 = 112.2f;
        float num4 = 556.6f;
        
        float min = Float.min(num3, num4);
        float max = Float.max(num3, num4);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    

        float number4 = -25.0f;
        double sqrt1 = Math.sqrt(number4);
        System.out.println("Square root: " + sqrt1);
  

        float num5 = 0.0f;
        float num6 = 0.0f;
        float result1 = num5 / num6;
        System.out.println("Division result: " + result1);
    

      float number5 = 123.45f;

        
        int intVal1 = (int) number5;
        double doubleVal1 = (double) number5;
        long longVal1 = (long) number5;

        System.out.println("Converted to int: " + intVal1);
        System.out.println("Converted to double: " + doubleVal1);
        System.out.println("Converted to long: " + longVal1);
    }
}