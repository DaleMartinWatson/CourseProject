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
public class MainFrame extends javax.swing.JFrame
{
    AboutDialog aboutDialog = new AboutDialog(this, true);

    /**
     * Creates new form MainFrame
     */
    public MainFrame()
    {
        initComponents();
        
        /*tProdCalcList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tProdCalcList.getColumnModel().getColumn(0).setPreferredWidth(30);
        tProdCalcList.getColumnModel().getColumn(1).setPreferredWidth(90);
        tProdCalcList.getColumnModel().getColumn(2).setPreferredWidth(70);
        tProdCalcList.getColumnModel().getColumn(3).setPreferredWidth(60);
        tProdCalcList.getColumnModel().getColumn(4).setPreferredWidth(70);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        bCalcProd = new javax.swing.JButton();
        bCalcAll = new javax.swing.JButton();
        tableScrollPane = new javax.swing.JScrollPane();
        ListTable = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        mbFile = new javax.swing.JMenu();
        fNew = new javax.swing.JMenuItem();
        fOpen = new javax.swing.JMenuItem();
        fSave = new javax.swing.JMenuItem();
        fOpenAs = new javax.swing.JMenuItem();
        fPrintBar = new javax.swing.JPopupMenu.Separator();
        fPrint = new javax.swing.JMenuItem();
        fExitBar = new javax.swing.JPopupMenu.Separator();
        fExit = new javax.swing.JMenuItem();
        mbCalc = new javax.swing.JMenu();
        cCalcProd = new javax.swing.JMenuItem();
        cCalcAll = new javax.swing.JMenuItem();
        mbHelp = new javax.swing.JMenu();
        hAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Відомість розрахунку продуктивності праці");
        setLocationByPlatform(true);
        setResizable(false);

        bCalcProd.setText("Розрахувати продуктивність");

        bCalcAll.setText("Розрахувати разом по галузі");

        ListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String []
            {
                "№", "Заголовок 2", "Заголовок 3", "Заголовок 4", "Заголовок 5"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(ListTable);

        mbFile.setText("Файл");

        fNew.setText("Створити");
        mbFile.add(fNew);

        fOpen.setText("Відкрити");
        mbFile.add(fOpen);

        fSave.setText("Відкрити");
        mbFile.add(fSave);

        fOpenAs.setText("Відкрити як...");
        mbFile.add(fOpenAs);
        mbFile.add(fPrintBar);

        fPrint.setText("Друк");
        mbFile.add(fPrint);
        mbFile.add(fExitBar);

        fExit.setText("Вихід");
        mbFile.add(fExit);

        menuBar.add(mbFile);

        mbCalc.setText("Розрахунки");

        cCalcProd.setText("Розрахувати продуктивність");
        mbCalc.add(cCalcProd);

        cCalcAll.setText("Розрахувати разом по галузі");
        mbCalc.add(cCalcAll);

        menuBar.add(mbCalc);

        mbHelp.setText("Довідка");

        hAbout.setText("Про програму");
        hAbout.setToolTipText("");
        hAbout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                hAboutActionPerformed(evt);
            }
        });
        mbHelp.add(hAbout);

        menuBar.add(mbHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bCalcProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bCalcAll))
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCalcProd)
                    .addComponent(bCalcAll))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hAboutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_hAboutActionPerformed
    {//GEN-HEADEREND:event_hAboutActionPerformed
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_hAboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListTable;
    private javax.swing.JButton bCalcAll;
    private javax.swing.JButton bCalcProd;
    private javax.swing.JMenuItem cCalcAll;
    private javax.swing.JMenuItem cCalcProd;
    private javax.swing.JMenuItem fExit;
    private javax.swing.JPopupMenu.Separator fExitBar;
    private javax.swing.JMenuItem fNew;
    private javax.swing.JMenuItem fOpen;
    private javax.swing.JMenuItem fOpenAs;
    private javax.swing.JMenuItem fPrint;
    private javax.swing.JPopupMenu.Separator fPrintBar;
    private javax.swing.JMenuItem fSave;
    private javax.swing.JMenuItem hAbout;
    private javax.swing.JMenu mbCalc;
    private javax.swing.JMenu mbFile;
    private javax.swing.JMenu mbHelp;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
    private ListTableModel listTableModel;
}
