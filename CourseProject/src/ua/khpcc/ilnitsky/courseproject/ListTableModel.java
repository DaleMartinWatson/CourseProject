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

import java.util.Collections;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dmitry Ilnitsky
 */
public final class ListTableModel extends DefaultTableModel
{
    private final Class[] types = new Class[]
    {
        java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
    };
    private final String[] columnNames = new String[]
    {
        "№", "Назва підприємства", "Валова продукція, грн.", "Число робітників, тис. чол.", "Продуктивність, Грн./чол."
    };
    boolean[] canEdit = new boolean[]
    {
        false, true, true, true, false
    };

    ListTableModel(int rowCount)
    {
        super.setDataVector(new Vector(), convertToVector(columnNames));
        fillWithEmtyRows(rowCount);
    }

    ListTableModel()
    {
        this(10);
    }

    @Override
    public Class getColumnClass(int columnIndex)
    {
        return types[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return canEdit[columnIndex];
    }

    public void clearTable()
    {
        super.dataVector.removeAllElements();
    }

    @Override
    public String toString()
    {
        return super.toString() + ": " + dataVector.toString();
    }

    public void fillWithEmtyRows()
    {
        fillWithEmtyRows(10);
    }

    public void fillWithEmtyRows(int rowCount)
    {
        for (int i = 1; i < (rowCount + 1); i++)
        {
            //створення порожніх пронумерованих рядків
            Vector<Object> oV = new Vector<>(5);
            oV.addElement(i);
            super.addRow(oV);
        }
    }

    public void swapRows(int row1, int row2)
    {
        Collections.swap(dataVector, row1, row2);
        setValueAt(row1 + 1, row1, 0);
        setValueAt(row2 + 1, row2, 0);
        fireTableRowsUpdated(row1, row2);
    }

    public void fixRowsIndex()
    {
        fixRowsIndex(0);
    }

    public void fixRowsIndex(int from)
    {
        for (int i = from; i < getRowCount(); i++)
        {
            setValueAt(i + 1, i, 0);
        }
    }

    public void setDataVector(Vector dataVector)
    {
        this.dataVector = dataVector;
        fireTableStructureChanged();
    }

    public boolean isEmpty()
    {
        Vector<Object> eV = new Vector<>(5);
        eV.setSize(5);

        for (int i = 0; i < dataVector.size(); i++)
        {
            eV.setElementAt(i + 1, 0);
            if (!((Vector) dataVector.elementAt(i)).equals((eV)))
            {
                return false;
            }
        }

        return true;
    }

    public void putRowAt(int at, Vector row)
    {
        if (getRowCount() > 0)
        {
            at = at > -1 ? at + 1 : getRowCount();
            insertRow(at, (Vector) row.clone());
        }
        else
        {
            addRow((Vector) row.clone());
        }
    }

    public Vector getRow(int i)
    {
        return (Vector) dataVector.elementAt(i);
    }
}