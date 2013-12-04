package ua.khpcc.ilnitsky.courseproject;

import java.io.Console;

public class JavaAsm
{
    //JavaAsm.dll test class
    native public static float asmFAdd(float num1, float num2);
    native public static float asmFMul(float num1, float num2);
    native public static float asmFDiv(float dvd, float dvs);// dvd - dividend, dvs - divisor
    
    
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
                
                if(command[0].equalsIgnoreCase("fadd"))
                {
                    console.printf("Native result: %f; Java result: %f;%n", asmFAdd(x, y), (x + y));
                }
                if(command[0].equalsIgnoreCase("fmul"))
                {
                    console.printf("Native result: %f; Java result: %f;%n", asmFMul(x, y), (x * y));
                }
                else if(command[0].equalsIgnoreCase("fdiv"))
                {
                    console.printf("Native result: %f; Java result: %f;%n", asmFDiv(x, y), (x / y));
                }
            }
            catch(java.lang.Exception e)
            {
                 e.printStackTrace();
            }

        }
    }   
}
