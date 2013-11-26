package ua.khpcc.ilnitsky.javaasm;

import java.io.Console;

public class JavaAsm
{
    native static float asmAdd(float num1, float num2); // dvd - dividend, dvs - divisor
    native static float asmDiv(float dvd, float dvs); // dvd - dividend, dvs - divisor
    
    
    static
    {
        try
        {
        System.loadLibrary("JavaAsm");        // загружаем библиотеку JavaAsm.dll
        }
        catch( UnsatisfiedLinkError ule)
        {
            System.out.println("ERROR: Can't load JavaAsm.dll");
            ule.printStackTrace();
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
