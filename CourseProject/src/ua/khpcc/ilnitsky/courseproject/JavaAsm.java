package ua.khpcc.ilnitsky.courseproject;

public class JavaAsm
{
    //native public static float asmFAdd(float num1, float num2);
    //native public static float asmFMul(float num1, float num2);
    //native public static float asmFDiv(float dvd, float dvs);//// dvd - dividend, dvs - divisor
    
    
    static
    {
            //System.load("C:\\Users\\DaleMartinWatson\\Desktop\\JavaAsm\\JavaAsm.dll");
    }   
   
    public static float asmFAdd(float num1, float num2)
    {
        return num1 + num2;
    }
    
    public static float asmFMul(float num1, float num2)
    {
        return num1 * num2;
    }
    
    public static float asmFDiv(float dvd, float dvs)
    {
        return dvd / dvs;
    }

}
