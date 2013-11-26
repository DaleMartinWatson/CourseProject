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

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dmitry Ilnitsky
 */
public class ListTableModel extends DefaultTableModel
{
    private final Class[] types = new Class[]
    {
        java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
    };
    private final String[] columnNames = new String[]
    {
        "№", "Назва підприємства", "Валова продукція, грн.", "Число робітників, тис. чол.", "Продуктивність, Грн./чол."
    };
    boolean[] canEdit = new boolean[]
    {
        false, true, true, true, true
    };

    ListTableModel(int rowCount)
    {
        super();
        Vector v = new Vector(rowCount);
        v.setSize(rowCount);
        super.setDataVector(v, convertToVector(columnNames));
    }

    public Class getColumnClass(int columnIndex)
    {
        return types[columnIndex];
    }

    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return canEdit[columnIndex];
    }

}
