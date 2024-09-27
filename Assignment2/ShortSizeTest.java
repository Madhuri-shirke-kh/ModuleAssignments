public class ShortSizeTest {
    public static void main(String[] args) {
      
        System.out.println("Bytes used by short: " + Short.BYTES);
 
        System.out.println("Minimum short value: " + Short.MIN_VALUE);
        System.out.println("Maximum short value: " + Short.MAX_VALUE);

        short number1 = 1200;
        String str = Short.toString(number1);
        System.out.println("Short as string: " + str);
   
        String strNumber1 = "2500";
        short number2 = Short.parseShort(strNumber1);
        System.out.println("String to short: " + number2);
   
        String strNumber2 = "Ab12Cd3";
        try {
            short number = Short.parseShort(strNumber2);
            System.out.println("String to short: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    

        short number3 = 1500;
        Short shortWrapper1 = Short.valueOf(number3);
        System.out.println("Short as wrapper: " + shortWrapper1);
  

        String strNumber3 = "3000";
        Short shortWrapper = Short.valueOf(strNumber3);
        System.out.println("String to Short wrapper: " + shortWrapper);
  
        short number4 = 5000;
       
        int intValue1 = number4;
        System.out.println("Short to int: " + intValue1);

        
        long longValue1 = number4;
        System.out.println("Short to long: " + longValue1);

       
        double doubleValue1 = number4;
        System.out.println("Short to double: " + doubleValue1);

        
        float floatValue1 = number4;
        System.out.println("Short to float: " + floatValue1);

       
        byte byteValue1 = (byte) number4;
        System.out.println("Short to byte (cast): " + byteValue1);
    }
}