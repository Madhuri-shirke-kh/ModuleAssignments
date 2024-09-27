public class boolean1{

 public static void main(String[] args){
        boolean status = true;

        // Convert the boolean to a String using Boolean.toString(boolean)
        String statusString = Boolean.toString(status);

        // Output the result
        System.out.println("The string representation of status is: " + statusString);
   

   
       
        String strStatus = "true";

        // Convert the String to a boolean using Boolean.parseBoolean(String)
        boolean status1 = Boolean.parseBoolean(strStatus);

        // Output the result
        System.out.println("The boolean value of strStatus is: " + status1);
    

        String strStatus2 = "1";  // Change to "0" for testing

        // Convert the string to a boolean based on its value
        boolean status2 = strStatus2.equals("1");

        // Output the result
        System.out.println("The boolean value of strStatus (1 or 0) is: " + status2);
   
      
        boolean status3= true;

        // Convert the boolean to the corresponding Boolean wrapper class using Boolean.valueOf(boolean)
        Boolean statusWrapper = Boolean.valueOf(status3);

        // Output the result
        System.out.println("The Boolean wrapper object is: " + statusWrapper);
   
        // Declare a method-local variable 'strStatus' of type String with the value "true"
        String strStatus3 = "true";

        // Convert the String to the corresponding Boolean wrapper class using Boolean.valueOf(String)
        Boolean statusWrapper1 = Boolean.valueOf(strStatus3);

        // Output the result
        System.out.println("The Boolean wrapper object is: " + statusWrapper1);
   


    
        // Declare a boolean variable
        boolean status4 = true;

        // Boolean to int (using a conditional expression)
        int intValue = status ? 1 : 0;
        System.out.println("Boolean to int: " + intValue);

        // Boolean to double (using a conditional expression)
        double doubleValue = status ? 1.0 : 0.0;
        System.out.println("Boolean to double: " + doubleValue);

        // Boolean to char (using a conditional expression)
        char charValue = status ? 'T' : 'F';
        System.out.println("Boolean to char: " + charValue);

        // Int to boolean (non-zero is true, zero is false)
        int number = 1;  // Change to 0 to test
        boolean boolValueFromInt = number != 0;
        System.out.println("Int to boolean: " + boolValueFromInt);
    }
}