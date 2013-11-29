package ua.khpcc.ilnitsky.courseproject;

/**
 *
 * @author Dmitry Ilnitsky
 */
public class ListProcessor
{
    public static void calcProd(ListTableModel ltm)
    {      
        for(int i = 0; i < ltm.getRowCount(); i++)
        {
            System.out.println(ltm.getValueAt(i, 2) + "  " + ltm.getValueAt(i, 3) + "  " + ltm.getValueAt(i, 4));
            ltm.setValueAt(JavaAsm.asmFDiv((float) ltm.getValueAt(i, 2), JavaAsm.asmFMul((float) ltm.getValueAt(i, 3), 1000)), i, 4);//P = V / N * 100
        }
    }

    public static Object[] calcAll(ListTableModel ltm)
    {
        float allGrossOut = 0, allWorkers = 0, allProd = 0;
                
        for(int i = 0; i < ltm.getRowCount(); i++)
        {
            allGrossOut = JavaAsm.asmFAdd(allGrossOut, (float) ltm.getValueAt(i, 2));
            allWorkers = JavaAsm.asmFAdd(allWorkers, (float) ltm.getValueAt(i, 3));
            allProd = JavaAsm.asmFAdd(allProd, (float) ltm.getValueAt(i, 4));
        }
        
        return new Object[]{allGrossOut, allWorkers, allProd};
    }
}
