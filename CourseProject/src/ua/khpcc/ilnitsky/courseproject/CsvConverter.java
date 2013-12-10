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
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dmitry Ilnitsky
 */
public class CsvConverter
{
    private static final char separator = ';';
    private static final char specSymbol = '"';
    private static final char lineBreak = '\n';

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
                    value = value.toString().replaceAll("\"", "\"\"");

                    Matcher m = Pattern.compile("[;\\n]").matcher(value.toString());
                    if (m.find())
                    {
                        value = "\"" + value + "\"";
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

    public static Vector csvStringToDataVector(String str)
    {
        Vector<Vector> dataVector = new Vector<>();
        Vector<Object> rowVector = new Vector<>(5);

        StringBuilder sb = new StringBuilder();
        boolean enclosed = false;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == lineBreak && !enclosed)
            {
                rowVector.add(sb.length() > 0 ? sb.toString() : null);
                sb.setLength(0);

                rowVector.set(0, parseInt(rowVector.get(0)));
                rowVector.set(2, parseFloat(rowVector.get(2)));
                rowVector.set(3, parseFloat(rowVector.get(3)));
                rowVector.set(4, parseFloat(rowVector.get(4)));

                dataVector.addElement((Vector) rowVector.clone());
                rowVector.clear();
            }
            else if (str.charAt(i) == separator && !enclosed)
            {
                rowVector.add(sb.length() > 0 ? sb.toString() : null);
                sb.setLength(0);
            }
            else
            {
                if (str.charAt(i) == specSymbol)
                {
                    if (str.charAt(i + 1) == specSymbol)
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
                    sb.append(str.charAt(i));
                }
            }

        }

        return dataVector;
    }

    private static Float parseFloat(Object s)
    {
        return s != null ? Float.parseFloat(s.toString().replaceAll("[^0-9-+.,Ee]", "")) : null;
    }

    private static Integer parseInt(Object s)
    {
        return s != null ? Integer.parseInt(s.toString().replaceAll("[^0-9-+]", "")) : null;
    }
}
