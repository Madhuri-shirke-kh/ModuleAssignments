public class PrimitiveToStringConversion {
    public static void main(String[] args) {
        
        int intVar = 42;
        double doubleVar = 123.456;
        float floatVar = 78.9f;
        long longVar = 9876543210L;
        short shortVar = 100;
        byte byteVar = 10;
        boolean booleanVar = true;
        char charVar = 'A';

       
        System.out.println("Using toString() method of wrapper classes:");
        System.out.println("Integer: " + Integer.toString(intVar));
        System.out.println("Double: " + Double.toString(doubleVar));
        System.out.println("Float: " + Float.toString(floatVar));
        System.out.println("Long: " + Long.toString(longVar));
        System.out.println("Short: " + Short.toString(shortVar));
        System.out.println("Byte: " + Byte.toString(byteVar));
        System.out.println("Boolean: " + Boolean.toString(booleanVar));
        System.out.println("Character: " + Character.toString(charVar));

        System.out.println("\nUsing String.valueOf() method:");
        System.out.println("Integer: " + String.valueOf(intVar));
        System.out.println("Double: " + String.valueOf(doubleVar));
        System.out.println("Float: " + String.valueOf(floatVar));
        System.out.println("Long: " + String.valueOf(longVar));
        System.out.println("Short: " + String.valueOf(shortVar));
        System.out.println("Byte: " + String.valueOf(byteVar));
        System.out.println("Boolean: " + String.valueOf(booleanVar));
        System.out.println("Character: " + String.valueOf(charVar));
    }
}