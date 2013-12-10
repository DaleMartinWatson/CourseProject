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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaAsm
{
    native public float asmAdd(float num1, float num2);
    native public float asmMul(float num1, float num2);
    native public float asmDiv(float dvd, float dvs);

    public void JavaAsm() throws Exception
    {
            loadFromJar(getLibNameByOs("JavaAsm"));
    }

    private String getLibNameByOs(String libName) throws Exception
    {
        String osName = System.getProperty("os.name").toLowerCase();
        String vmDataModel = System.getProperty("sun.arch.data.model");

        if (osName.contains("win"))
        {
            return libName + "-windows" + vmDataModel + ".dll";
        }
        if (osName.contains("mac"))
        {
            return libName + ".jnilib";
        }
        if (osName.contains("solaris") || osName.contains("sunos"))
        {
            return libName + "-solaris" + vmDataModel + ".so";
        }

        if (osName.contains("linux") || osName.contains("unix"))
        {
            return libName + "-linux" + vmDataModel + ".so";
        }

        throw new Exception("Програма не може працювати з данною операційною системою!");
    }

    public void loadFromJar(String libName) throws IOException
    {
        File temp = File.createTempFile("lib", "-" + libName);
        temp.deleteOnExit();

        if (!temp.exists())
        {
            throw new FileNotFoundException("Неможливо створити тимчасовий файл: " + temp.getAbsolutePath() + " .");
        }
        
        InputStream is = JavaAsm.class.getResourceAsStream("/lib/" + libName);
        OutputStream os = new FileOutputStream(temp);
        
        
        byte[] buffer = new byte[1024];
        int readBytes;
        try
        {
            while ((readBytes = is.read(buffer)) != -1)
            {
                os.write(buffer, 0, readBytes);
            }
        }
        finally
        {
            os.close();
            is.close();
        }
        
        System.load(temp.getAbsolutePath());
    }
}
