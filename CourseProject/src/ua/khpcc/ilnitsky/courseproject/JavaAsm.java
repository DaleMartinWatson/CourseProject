/*
 * Copyright (C) 2013 Dmitry Ilnitsky.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
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
