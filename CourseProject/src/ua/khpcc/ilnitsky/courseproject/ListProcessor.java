package ua.khpcc.ilnitsky.courseproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
                ltm.setValueAt(JavaAsm.asmFDiv((float) ltm.getValueAt(i, 2), JavaAsm.asmFMul((float) ltm.getValueAt(i, 3), 1000)), i, 4);//P = V / N * 100
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
                allGrossOut = JavaAsm.asmFAdd(allGrossOut, (float) ltm.getValueAt(i, 2));
            }
            if (ltm.getValueAt(i, 3) != null)
            {
                allWorkers = JavaAsm.asmFAdd(allWorkers, (float) ltm.getValueAt(i, 3));
            }
            if (ltm.getValueAt(i, 4) != null)
            {
                allProd = JavaAsm.asmFAdd(allProd, (float) ltm.getValueAt(i, 4));
            }

        }

        return new Object[]
        {
            allGrossOut, allWorkers, allProd
        };
    }
}
