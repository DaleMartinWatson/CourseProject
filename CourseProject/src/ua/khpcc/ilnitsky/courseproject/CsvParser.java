package ua.khpcc.ilnitsky.courseproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Dmitry Ilnitsky
 */
public class CsvParser
{
    private static final char separator = ';';
    private static final char specSymbol = '"';

    public static void listModelToCsvFile(ListTableModel ltm, File csvFile)
    {
        /*ltm.getColumnName(0) + ";"
         + ltm.getColumnName(1) + ";"
         + ltm.getColumnName(2) + ";"
         + ltm.getColumnName(3) + ";"
         + ltm.getColumnName(4)*/

        for (int i = 0; i < ltm.getRowCount(); i++)
        {
            for (int j = 0; j < ltm.getColumnCount(); j++)
            {

            }
        }

    }

    public static void csvFileToListModel(ListTableModel ltm, File csvFile) throws FileNotFoundException, IOException, Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), "Cp1251"));

        if (!br.readLine().equals(ltm.getColumnName(0) + ";" + ltm.getColumnName(1) + ";"
                + ltm.getColumnName(2) + ";" + ltm.getColumnName(3) + ";"
                + ltm.getColumnName(4)))
        {
            throw new Exception("Невірний заголовок відомості розрахунку продуктивності праці.");
        }

        ltm.clearTable();

        String line;
        int rowNum = 1;
        while ((line = br.readLine()) != null)
        {
            ltm.addRow(csvStringToListRow(line, rowNum));
            rowNum++;
        }
        br.close();
    }

    private static Object[] csvStringToListRow(String line, int rowNum)
    {
        Object row[] = new Object[5];
        int currentObj = 0;
        StringBuilder sb = new StringBuilder();
        boolean enclosed = false;
        for (int i = 0; i < line.length(); i++)
        {
            if (line.charAt(i) == separator && !enclosed)
            {
                row[currentObj] = sb.length() > 0 ? sb.toString() : null;
                sb.setLength(0);// Очищення буферу від попередньго об'єкту
                currentObj++;
            }
            else
            {
                if (line.charAt(i) == specSymbol)
                {
                    if (line.charAt(i + 1) == specSymbol)
                    {
                        sb.append(specSymbol);
                        i++;
                    }
                    else
                    {
                        enclosed = !enclosed;
                    }
                }
                else
                {
                    sb.append(line.charAt(i));
                }
            }
        }
        
        row[0] = row[0] != null ? Integer.parseInt(row[0].toString()) : rowNum;
        row[2] = row[2] != null ? Float.parseFloat(row[2].toString()) : null;
        row[3] = row[3] != null ? Float.parseFloat(row[3].toString()) : null;
        row[4] = row[4] != null ? Float.parseFloat(row[4].toString()) : null;

        return row;
    }
}
