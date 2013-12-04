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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 *
 * @author Dmitry Ilnitsky
 */
public class CsvConverter
{
    private static final char separator = ';';
    private static final char specSymbol = '"';

    public static String listModelToCsvString(ListTableModel ltm) throws UnsupportedEncodingException, FileNotFoundException, IOException
    {
        StringBuilder sb = new StringBuilder();

        sb.append(ltm.getColumnName(0)).append(";")
                .append(ltm.getColumnName(1)).append(";")
                .append(ltm.getColumnName(2)).append(";")
                .append(ltm.getColumnName(3)).append(";")
                .append(ltm.getColumnName(4)).append("\n");

        for (int i = 0; i < ltm.getRowCount(); i++)
        {
            sb.append(ltm.getValueAt(i, 0));

            for (int j = 1; j < ltm.getColumnCount(); j++)
            {
                Object value = ltm.getValueAt(i, j);
                sb.append(separator);
                if (value != null)
                {
                    if (j == 1) //1 - номер імені підприємства у таблиці
                    {
                        value = "\"" + ((String) value).replaceAll("\"", "\"\"") + "\"";
                    }
                }
                else
                {
                    value = "";
                }
                sb.append(value);
            }
            sb.append("\n");
        }

        return sb.toString();
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
            row[currentObj] = sb.length() > 0 ? sb.toString() : null;
            

            row[0] = row[0] != null ? Integer.parseInt(((String) row[0]).replaceAll("[^0-9]", "")) : rowNum;
            
            row[2] = parseFloat(row[2]);
            row[3] = parseFloat(row[3]);
            row[4] = parseFloat(row[4]);

            ltm.addRow(row);
            rowNum++;
        }
        br.close();
    }

    private static Float parseFloat(Object s)
    {
        return s != null ? Float.parseFloat(s.toString().replaceAll("[^0-9-+.,Ee]", "")) : null;
    }
}
