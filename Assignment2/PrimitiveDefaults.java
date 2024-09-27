public class PrimitiveDefaults {
   
    int intVar;
    double doubleVar;
    float floatVar;
    long longVar;
    short shortVar;
    byte byteVar;
    boolean booleanVar;
    char charVar;

    
    static int staticIntVar;
    static double staticDoubleVar;
    static float staticFloatVar;
    static long staticLongVar;
    static short staticShortVar;
    static byte staticByteVar;
    static boolean staticBooleanVar;
    static char staticCharVar;

    public static void main(String[] args) {
       
        PrimitiveDefaults obj = new PrimitiveDefaults();

       
        System.out.println("Instance variable default values:");
        System.out.println("int: " + obj.intVar);
        System.out.println("double: " + obj.doubleVar);
        System.out.println("float: " + obj.floatVar);
        System.out.println("long: " + obj.longVar);
        System.out.println("short: " + obj.shortVar);
        System.out.println("byte: " + obj.byteVar);
        System.out.println("boolean: " + obj.booleanVar);
        System.out.println("char: [" + obj.charVar + "]");

       
        System.out.println("\nStatic variable default values:");
        System.out.println("int: " + staticIntVar);
        System.out.println("double: " + staticDoubleVar);
        System.out.println("float: " + staticFloatVar);
        System.out.println("long: " + staticLongVar);
        System.out.println("short: " + staticShortVar);
        System.out.println("byte: " + staticByteVar);
        System.out.println("boolean: " + staticBooleanVar);
        System.out.println("char: [" + staticCharVar + "]");
    }
}