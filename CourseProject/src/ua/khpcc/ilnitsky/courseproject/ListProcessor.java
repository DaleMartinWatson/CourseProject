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

/**
 *
 * @author Dmitry Ilnitsky
 */
public class ListProcessor
{
    public static void calcProd(ListTableModel ltm)
    {
        for (int i = 0; i < ltm.getRowCount(); i++)
        {
            if (ltm.getValueAt(i, 2) != null && ltm.getValueAt(i, 3) != null)
            {
                ltm.setValueAt(JavaAsm.asmDiv((float) ltm.getValueAt(i, 2), JavaAsm.asmMul((float) ltm.getValueAt(i, 3), 1000)), i, 4);//P = V / N * 100
            }
        }
    }

    public static Object[] calcAll(ListTableModel ltm)
    {
        float allGrossOut = 0, allWorkers = 0, allProd = 0;

        for (int i = 0; i < ltm.getRowCount(); i++)
        {
            if (ltm.getValueAt(i, 2) != null)
            {
                allGrossOut = JavaAsm.asmAdd(allGrossOut, (float) ltm.getValueAt(i, 2));
            }
            if (ltm.getValueAt(i, 3) != null)
            {
                allWorkers = JavaAsm.asmAdd(allWorkers, (float) ltm.getValueAt(i, 3));
            }
            if (ltm.getValueAt(i, 4) != null)
            {
                allProd = JavaAsm.asmAdd(allProd, (float) ltm.getValueAt(i, 4));
            }

        }

        return new Object[]
        {
            allGrossOut, allWorkers, allProd
        };
    }
}
