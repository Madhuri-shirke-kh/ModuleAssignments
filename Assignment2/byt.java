public class byt{
public static void main(String[] args){ 
        System.out.println("Bytes used by byte: " + Byte.BYTES);
    
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);
     
        byte number4 = 10;
        String str = Byte.toString(number4);
        System.out.println("Byte as string: " + str);
    
    
        String strNumber = "25";
        byte number = Byte.parseByte(strNumber);
        System.out.println("String to byte: " + number);
    
   
        String strNumber2 = "Ab12Cd3";
        try {
            byte number3 = Byte.parseByte(strNumber);
            System.out.println("String to byte: " + number3);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        		}
	
  
        byte number1 = 15;
        Byte byteWrapper = Byte.valueOf(number1);
        System.out.println("Byte as wrapper: " + byteWrapper);
    

 
        String strNumber1 = "20";
        Byte byteWrapper1 = Byte.valueOf(strNumber1);
        System.out.println("String to Byte wrapper: " + byteWrapper);
    


        byte number2 = 42;

        
        int intValue = number2;
        System.out.println("Byte to int: " + intValue);

       
        short shortValue = number2;
        System.out.println("Byte to short: " + shortValue);

        
        double doubleValue = number2;
        System.out.println("Byte to double: " + doubleValue);

        
        long longValue = number2;
        System.out.println("Byte to long: " + longValue);

        
        float floatValue = number2;
        System.out.println("Byte to float: " + floatValue);
    }
}