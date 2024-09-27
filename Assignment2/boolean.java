import java.util.*;
public class boolean{
	Boolean status=true;
	boolean status = true;
	String strstatus="true";
	 String strStatus = "1";
	 String strStatus = "true";
	boolean status = true;
	 int number = 1;
	boolean status = false;
	String strStatus = "false";
	
	public static void main(String[] args)
	{
		String statstring=Boolean.tostring(status);
		System.out.println("Value of string is:"+statstring);

		Boolean strbolean=Boolean.parseBoolean(strstatus);
		System.out.println("Value of string is:"+strbolean);
		
		boolean status = strStatus.equals("1");
     
                System.out.println("The boolean representation of strStatus is: " + status);
		
		Boolean statusWrapper = Boolean.valueOf(status);
                System.out.println("The Boolean wrapper object is: " + statusWrapper);

		 boolean status = true;

       
        double doubleValue = status ? 1.0 : 0.0;

      
        char charValue = status ? 'T' : 'F';

       
        System.out.println("Boolean to double: " + doubleValue);
        System.out.println("Boolean to char: " + charValue);

		Boolean statusWrapper = Boolean.valueOf(strStatus);
       		 System.out.println("The Boolean wrapper object is: " + statusWrapper);

		boolean status = true;
        
       //convert Boolean to int.
        int intValue = status ? 1 :0;
        System.out.println("Boolean to int: " + intValue);
	
	//convert int to Boolean.
	              
        boolean boolValue = number != 0;
        
        System.out.println("Int to boolean: " + boolValue);
	
	//convert Boolean to string.
       
        
        String strValue = String.valueOf(status);
      
          System.out.println("Boolean to String: " + strValue);

	//convert string to Boolean.

	 
        
        // Convert String to boolean
        boolean boolValue = Boolean.parseBoolean(strStatus);
        
        System.out.println("String to boolean: " + boolValue);

	
	}
}
