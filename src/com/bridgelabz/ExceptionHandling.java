package com.bridgelabz;

/*The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors
 so that the normal flow of the application can be maintained.*/
//Exception is an abnormal condition.
/*Types
        Checked Exception
        Unchecked Exception
        Error*/

public class ExceptionHandling {
    public static void main(String[] args) {
        /*try
        {
            int data=50/0; //may throw exception
        }
        //handling the exception
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");*/

        /*try {
            int data = 50 / 0; //may throw exception
            // if exception occurs, the remaining statement will not exceute
            System.out.println("rest of the code");
        }
        // handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }*/

       /* try
        {
            int data=50/0; //may throw exception
        }
        // handling the exception by using Exception class
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }*/

        try {
            int data = 50 / 0; //may throw exception
        }
        // handling the exception
        catch (Exception e) {
            // displaying the custom message
            System.out.println("Can't divided by zero");
        }
    }
}
