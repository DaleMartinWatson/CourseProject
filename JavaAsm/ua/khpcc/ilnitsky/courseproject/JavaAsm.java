package ua.khpcc.ilnitsky.courseproject;

import java.io.Console;

public class JavaAsm
{
    //JavaAsm.dll test class
    native public static float asmAdd(float num1, float num2);
    native public static float asmMul(float num1, float num2);
    native public static float asmDiv(float dvd, float dvs);// dvd - dividend, dvs - divisor
    
    
    static
    {
        try
        {
            System.loadLibrary("JavaAsm-windows" + System.getProperty("sun.arch.data.model"));
        }
        catch( UnsatisfiedLinkError ule)
        {
            System.out.println("ERROR: Can't load JavaAsm.dll");
            ule.printStackTrace();
            System.exit(1);
        }
    }
    
    public static void main(String[] args)
    {
        Console console = System.console();
        String input;
        String[] command;
        
        if(console == null)
            System.out.println("Program can run only in console. Exit...");
        
        console.printf("JavaAsm lib test.%n");
        
        while(true)
        {
            try
            {
                input = console.readLine("Enter command> ");
                command = input.split(" ");
                float x, y;
                
                if(command[0].equalsIgnoreCase("exit") || command[0].isEmpty())
                {
                    console.printf("Exit...");
                    System.exit(0);
                }
                x = Float.parseFloat(command[1]);
                y = Float.parseFloat(command[2]);
                
                if(command[0].equalsIgnoreCase("add"))
                {
                    console.printf("Native result: %f; Java result: %f;%n", asmAdd(x, y), (x + y));
                }
                if(command[0].equalsIgnoreCase("mul"))
                {
                    console.printf("Native result: %f; Java result: %f;%n", asmMul(x, y), (x * y));
                }
                else if(command[0].equalsIgnoreCase("div"))
                {
                    console.printf("Native result: %f; Java result: %f;%n", asmDiv(x, y), (x / y));
                }
            }
            catch(java.lang.Exception e)
            {
                 e.printStackTrace();
            }

        }
    }   
}
