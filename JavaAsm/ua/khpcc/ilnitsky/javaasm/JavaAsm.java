package ua.khpcc.ilnitsky.javaasm;

import java.io.Console;

public class JavaAsm
{
    native static int asmAdd(int num1, int num2); // dvd - dividend, dvs - divisor
    native static int asmDiv(int dvd, int dvs); // dvd - dividend, dvs - divisor
    
    
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
                int x, y;
                
                if(command[0].equalsIgnoreCase("exit") || command[0].isEmpty())
                {
                    console.printf("Exit...");
                    System.exit(0);
                }
                
                x = Integer.parseInt(command[1]);
                y = Integer.parseInt(command[2]);
                
                if(command[0].equalsIgnoreCase("add"))
                {
                    console.printf("Native result: %d; Java result: %d;%n", asmAdd(x, y), x + y);
                }
                else if(command[0].equalsIgnoreCase("div"))
                {
                    console.printf("Native result: %d; Java result: %d;%n", asmDiv(x, y), x / y);
                }
            }
            catch(java.lang.Exception e)
            {
                 e.printStackTrace();
            }
        }
    }   
}
