package ua.khpcc.ilnitsky.courseproject;

import java.util.Vector;

/**
 *
 * @author DaleMartinWatson
 */
public class ListTableModel extends javax.swing.table.DefaultTableModel
{
    private final String[] columnNames = new String []
            {
                "№", "Назва підприємства", "Валова продукція, грн.", "Число робітників, тис. чол.", "Продуктивність, Грн./чол."
            };
    
    ListTableModel(int rowCount)
    {
        setDataVector(new Vector(rowCount), convertToVector(columnNames));
    }

}
