public class LongSizeTest {
    public static void main(String[] args) {
        
        System.out.println("Bytes used by long: " + Long.BYTES);
 
        System.out.println("Minimum long value: " + Long.MIN_VALUE);
        System.out.println("Maximum long value: " + Long.MAX_VALUE);
        long number = 123456789L;
        String str = Long.toString(number);
        System.out.println("Long as string: " + str);
         String strNumber1 = "9876543210";
        long number6 = Long.parseLong(strNumber1);
        System.out.println("String to long: " + number6);
    
        String strNumber2 = "Ab12Cd3";
        try {
            long number7 = Long.parseLong(strNumber2);
            System.out.println("String to long: " + number7);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    
        long number2 = 9876543210L;
        Long longWrapper1 = Long.valueOf(number2);
        System.out.println("Long as wrapper: " + longWrapper1);
    
        String strNumber2 = "56789012345";
        Long longWrapper2 = Long.valueOf(strNumber2);
        System.out.println("String to Long wrapper: " + longWrapper1);
   	
	
        long num1 = 1123L;
        long num2 = 9845L;
        long sum = Long.sum(num1, num2);
        System.out.println("Sum of 1123 and 9845: " + sum);
 
        long num3 = 1122L;
        long num4 = 5566L;

        long min = Long.min(num3, num4);
        long max = Long.max(num3, num4);

        System.out.println("Minimum of 1122 and 5566: " + min);
        System.out.println("Maximum of 1122 and 5566: " + max);
 
 long number3 = 7L;

        String binaryString1 = Long.toBinaryString(number3);
        String octalString1 = Long.toOctalString(number3);
        String hexString1 = Long.toHexString(number3);

        System.out.println("Binary representation of 7: " + binaryString1);
        System.out.println("Octal representation of 7: " + octalString1);
        System.out.println("Hexadecimal representation of 7: " + hexString1);
    long number5 = 1000L;
        int intValue1 = (int) number5;
        System.out.println("Long to int (cast): " + intValue1);

        
        float floatValue1 = number5;
        System.out.println("Long to float: " + floatValue1);

        
        double doubleValue1 = number5;
        System.out.println("Long to double: " + doubleValue1);

      
        short shortValue1 = (short) number5;
        System.out.println("Long to short (cast): " + shortValue1);

        
        byte byteValue1 = (byte) number5;
        System.out.println("Long to byte (cast): " + byteValue1);  
    }
}