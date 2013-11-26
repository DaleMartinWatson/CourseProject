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
        listTableModel = new ListTableModel(20);
        initComponents();  
        setTablePreferencess(tProdCalcList);
        setTablePreferencess(tCalcAllData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        bCalcProd = new javax.swing.JButton();
        bCalcAll = new javax.swing.JButton();
        spProdCalcList = new javax.swing.JScrollPane();
        tProdCalcList = new javax.swing.JTable();
        spCalcAllData = new javax.swing.JScrollPane();
        tCalcAllData = new javax.swing.JTable();
        bMoveUp = new javax.swing.JButton();
        bMoveDown = new javax.swing.JButton();
        bRemoveRow = new javax.swing.JButton();
        bAddRow = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        mbFile = new javax.swing.JMenu();
        fNew = new javax.swing.JMenuItem();
        fOpen = new javax.swing.JMenuItem();
        fSave = new javax.swing.JMenuItem();
        fOpenAs = new javax.swing.JMenuItem();
        fLatest = new javax.swing.JMenuItem();
        fPrintBar = new javax.swing.JPopupMenu.Separator();
        fPrint = new javax.swing.JMenuItem();
        fExitBar = new javax.swing.JPopupMenu.Separator();
        fExit = new javax.swing.JMenuItem();
        mbCalc = new javax.swing.JMenu();
        cCalcProd = new javax.swing.JMenuItem();
        cCalcAll = new javax.swing.JMenuItem();
        mbHelp = new javax.swing.JMenu();
        hAbout = new javax.swing.JMenuItem();

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Відомість розрахунку продуктивності праці");
        setLocationByPlatform(true);
        setResizable(false);

        bCalcProd.setText("Розрахувати продуктивність");
        bCalcProd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bCalcProdActionPerformed(evt);
            }
        });

        bCalcAll.setText("Розрахувати разом по галузі");
        bCalcAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bCalcAllActionPerformed(evt);
            }
        });

        tProdCalcList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tProdCalcList.setModel(listTableModel);
        spProdCalcList.setViewportView(tProdCalcList);

        tCalcAllData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "", "Разом по галузі:", "0", "0", "0"
            }
        ));
        spCalcAllData.setViewportView(tCalcAllData);

        bMoveUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconMoveUp.png"))); // NOI18N
        bMoveUp.setToolTipText("Підняти рядок вище");

        bMoveDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconMoveDown.png"))); // NOI18N
        bMoveDown.setToolTipText("Опустити рядок нижче");

        bRemoveRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconRemoveRow.png"))); // NOI18N
        bRemoveRow.setToolTipText("Видалити рядок");

        bAddRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconAddRow.png"))); // NOI18N
        bAddRow.setToolTipText("Додати рядок");

        mbFile.setText("Файл");

        fNew.setText("Створити");
        mbFile.add(fNew);

        fOpen.setText("Відкрити");
        mbFile.add(fOpen);

        fSave.setText("Зберегти");
        mbFile.add(fSave);

        fOpenAs.setText("Зберегти як...");
        mbFile.add(fOpenAs);

        fLatest.setText("Відкрити останні файли");
        mbFile.add(fLatest);
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
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spCalcAllData, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spProdCalcList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bMoveUp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMoveDown, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAddRow, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bRemoveRow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bCalcProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bCalcAll)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spProdCalcList, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bMoveUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMoveDown)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAddRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRemoveRow)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spCalcAllData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCalcProd)
                    .addComponent(bCalcAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hAboutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_hAboutActionPerformed
    {//GEN-HEADEREND:event_hAboutActionPerformed
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_hAboutActionPerformed

    private void bCalcAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bCalcAllActionPerformed
    {//GEN-HEADEREND:event_bCalcAllActionPerformed
        setCalcAllData(1, 4, 88);
    }//GEN-LAST:event_bCalcAllActionPerformed

    private void bCalcProdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bCalcProdActionPerformed
    {//GEN-HEADEREND:event_bCalcProdActionPerformed
        setCalcAllData(10, 45, 880);
    }//GEN-LAST:event_bCalcProdActionPerformed

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
    
    public void setCalcAllData(float grossOut, int workers, float prod)
    {
        javax.swing.table.JTableHeader th = tCalcAllData.getTableHeader();
        javax.swing.table.TableColumnModel tcm = th.getColumnModel();
        tcm.getColumn(2).setHeaderValue(grossOut);
        tcm.getColumn(3).setHeaderValue(workers);
        tcm.getColumn(4).setHeaderValue(prod);
        th.repaint();
    }
    
    public static void setTablePreferencess(javax.swing.JTable jTable)
    {
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.getTableHeader().setResizingAllowed(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(140);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(160);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(160);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddRow;
    private javax.swing.JButton bCalcAll;
    private javax.swing.JButton bCalcProd;
    private javax.swing.JButton bMoveDown;
    private javax.swing.JButton bMoveUp;
    private javax.swing.JButton bRemoveRow;
    private javax.swing.JMenuItem cCalcAll;
    private javax.swing.JMenuItem cCalcProd;
    private javax.swing.JMenuItem fExit;
    private javax.swing.JPopupMenu.Separator fExitBar;
    private javax.swing.JMenuItem fLatest;
    private javax.swing.JMenuItem fNew;
    private javax.swing.JMenuItem fOpen;
    private javax.swing.JMenuItem fOpenAs;
    private javax.swing.JMenuItem fPrint;
    private javax.swing.JPopupMenu.Separator fPrintBar;
    private javax.swing.JMenuItem fSave;
    private javax.swing.JMenuItem hAbout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu mbCalc;
    private javax.swing.JMenu mbFile;
    private javax.swing.JMenu mbHelp;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane spCalcAllData;
    private javax.swing.JScrollPane spProdCalcList;
    private javax.swing.JTable tCalcAllData;
    private javax.swing.JTable tProdCalcList;
    // End of variables declaration//GEN-END:variables
    private ListTableModel listTableModel;
    private javax.swing.table.DefaultTableModel DacalcAllData;
}
