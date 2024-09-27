public class IntSizeTest {
    public static void main(String[] args) {
       
        System.out.println("Bytes used by int: " + Integer.BYTES);
    

        System.out.println("Minimum int value: " + Integer.MIN_VALUE);
        System.out.println("Maximum int value: " + Integer.MAX_VALUE);
    
        int number1 = 150;
        String str1 = Integer.toString(number1);
        System.out.println("Int as string: " + str1);
  
         String strNumber1 = "300";
        int number2 = Integer.parseInt(strNumber1);
        System.out.println("String to int: " + number1);
    

       String strNumber2 = "Ab12Cd3";
        try {
            int number = Integer.parseInt(strNumber2);
            System.out.println("String to int: " + number2);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    

      int number3 = 120;
        Integer intWrapper1 = Integer.valueOf(number3);
        System.out.println("Int as wrapper: " + intWrapper1);
    


        String strNumber3 = "450";
        Integer intWrapper2 = Integer.valueOf(strNumber3);
        System.out.println("String to Integer wrapper: " + intWrapper2);
    

       int num1 = 10;
        int num2 = 20;
        int sum = Integer.sum(num1, num2);
        System.out.println("Sum of 10 and 20: " + sum);



        int num3 = 10;
        int num4 = 20;

        int min = Integer.min(num3, num4);
        int max = Integer.max(num3, num4);

        System.out.println("Minimum of 10 and 20: " + min);
        System.out.println("Maximum of 10 and 20: " + max);
 
        int number4 = 7;

        String binaryString1 = Integer.toBinaryString(number4);
        String octalString1= Integer.toOctalString(number4);
        String hexString1 = Integer.toHexString(number4);

        System.out.println("Binary representation of 7: " + binaryString1);
        System.out.println("Octal representation of 7: " + octalString1);
        System.out.println("Hexadecimal representation of 7: " + hexString1);
    
        int number5 = 100;

      
        long longValue2 = number5;
        System.out.println("Int to long: " + longValue2);

        
        double doubleValue2 = number5;
        System.out.println("Int to double: " + doubleValue2);

       
        float floatValue2 = number5;
        System.out.println("Int to float: " + floatValue2);

        short shortValue2 = (short) number5;
        System.out.println("Int to short (cast): " + shortValue2);

        
        byte byteValue2 = (byte) number5;
        System.out.println("Int to byte (cast): " + byteValue2); 
}
}