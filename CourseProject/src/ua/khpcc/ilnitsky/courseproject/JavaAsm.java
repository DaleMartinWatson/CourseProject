package ua.khpcc.ilnitsky.courseproject;

public class JavaAsm
{
    native public static int asmSum(int num1, int num2); // dvd - dividend, dvs - divisor
    native public static int asmDiv(int dvd, int dvs); // dvd - dividend, dvs - divisor
    
    
    static
    {
            System.load("C:\\Users\\DaleMartinWatson\\Desktop\\JavaAsm\\JavaAsm.dll");
    }  
}
