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

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Dmitry Ilnitsky
 */
public class MainFrame extends javax.swing.JFrame
{
    public MainFrame()
    {
        listTableModel = new ListTableModel(2);
        initComponents();
        setTablePreferencess(tProdCalcList);
        setTablePreferencess(tCalcAllData);

        aboutDialog = new AboutDialog(this, true);
        fc = new JFileChooser();
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
        bCopy = new javax.swing.JButton();
        bPaste = new javax.swing.JButton();
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

        bMoveUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconMoveUp.png"))); // NOI18N
        bMoveUp.setToolTipText("Підняти рядок вище");

        bMoveDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconMoveDown.png"))); // NOI18N
        bMoveDown.setToolTipText("Опустити рядок нижче");

        bRemoveRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconRemoveRow.png"))); // NOI18N
        bRemoveRow.setToolTipText("Видалити рядок");

        bAddRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconAddRow.png"))); // NOI18N
        bAddRow.setToolTipText("Додати рядок");

        bCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconCopy.png"))); // NOI18N
        bCopy.setToolTipText("Видалити рядок");

        bPaste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconPaste.png"))); // NOI18N
        bPaste.setToolTipText("Видалити рядок");

        mbFile.setText("Файл");

        fNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        fNew.setText("Створити");
        fNew.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fNewActionPerformed(evt);
            }
        });
        mbFile.add(fNew);

        fOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        fOpen.setText("Відкрити");
        fOpen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fOpenActionPerformed(evt);
            }
        });
        mbFile.add(fOpen);

        fSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        fSave.setText("Зберегти");
        fSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fSaveActionPerformed(evt);
            }
        });
        mbFile.add(fSave);

        fOpenAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        fOpenAs.setText("Зберегти як...");
        fOpenAs.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fOpenAsActionPerformed(evt);
            }
        });
        mbFile.add(fOpenAs);

        fLatest.setText("Відкрити останні файли");
        mbFile.add(fLatest);
        mbFile.add(fPrintBar);

        fPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        fPrint.setText("Друк");
        fPrint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fPrintActionPerformed(evt);
            }
        });
        mbFile.add(fPrint);
        mbFile.add(fExitBar);

        fExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        fExit.setText("Вихід");
        fExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fExitActionPerformed(evt);
            }
        });
        mbFile.add(fExit);

        menuBar.add(mbFile);

        mbCalc.setText("Розрахунки");

        cCalcProd.setText("Розрахувати продуктивність");
        cCalcProd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cCalcProdActionPerformed(evt);
            }
        });
        mbCalc.add(cCalcProd);

        cCalcAll.setText("Розрахувати разом по галузі");
        cCalcAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cCalcAllActionPerformed(evt);
            }
        });
        mbCalc.add(cCalcAll);

        menuBar.add(mbCalc);

        mbHelp.setText("Довідка");

        hAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
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
                            .addComponent(bRemoveRow, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPaste, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spProdCalcList, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spCalcAllData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bCalcProd)
                            .addComponent(bCalcAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bMoveUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMoveDown)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bAddRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRemoveRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCopy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPaste)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Start HELP listeners
    private void hAboutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_hAboutActionPerformed
    {//GEN-HEADEREND:event_hAboutActionPerformed
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_hAboutActionPerformed
    //End HELP listeners
    private void bCalcAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bCalcAllActionPerformed
    {//GEN-HEADEREND:event_bCalcAllActionPerformed
        setCalcAllData(ListProcessor.calcAll(listTableModel));
    }//GEN-LAST:event_bCalcAllActionPerformed

    private void bCalcProdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bCalcProdActionPerformed
    {//GEN-HEADEREND:event_bCalcProdActionPerformed
        ListProcessor.calcProd(listTableModel);
    }//GEN-LAST:event_bCalcProdActionPerformed
    //Start FILE listeners
    private void fNewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fNewActionPerformed
    {//GEN-HEADEREND:event_fNewActionPerformed

    }//GEN-LAST:event_fNewActionPerformed

    private void fOpenActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fOpenActionPerformed
    {//GEN-HEADEREND:event_fOpenActionPerformed
        openFile();
    }//GEN-LAST:event_fOpenActionPerformed

    private void fSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fSaveActionPerformed
    {//GEN-HEADEREND:event_fSaveActionPerformed
        saveFile();
    }//GEN-LAST:event_fSaveActionPerformed

    private void fOpenAsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fOpenAsActionPerformed
    {//GEN-HEADEREND:event_fOpenAsActionPerformed

    }//GEN-LAST:event_fOpenAsActionPerformed

    private void fPrintActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fPrintActionPerformed
    {//GEN-HEADEREND:event_fPrintActionPerformed
        System.out.println(listTableModel.toString());//debug print
    }//GEN-LAST:event_fPrintActionPerformed

    private void fExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fExitActionPerformed
    {//GEN-HEADEREND:event_fExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fExitActionPerformed
    //End FILE listeners
    //Start CALC listeners
    private void cCalcProdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cCalcProdActionPerformed
    {//GEN-HEADEREND:event_cCalcProdActionPerformed
        ListProcessor.calcProd(listTableModel);
    }//GEN-LAST:event_cCalcProdActionPerformed

    private void cCalcAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cCalcAllActionPerformed
    {//GEN-HEADEREND:event_cCalcAllActionPerformed
        setCalcAllData(ListProcessor.calcAll(listTableModel));
    }//GEN-LAST:event_cCalcAllActionPerformed
    //End CALC listeners

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainFrame().setVisible(true);
            }
        });
    }

    public void setCalcAllData(Object allData[])
    {
        JTableHeader th = tCalcAllData.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        tcm.getColumn(2).setHeaderValue(allData[0]);
        tcm.getColumn(3).setHeaderValue(allData[1]);
        tcm.getColumn(4).setHeaderValue(allData[2]);
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

    private void saveFile()
    {
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            listFile = fc.getSelectedFile();
            System.out.println("Saving: " + listFile.getName() + ".");
        }
        else
        {
            System.out.println("Save command cancelled by user.");
        }
    }

    private void openFile()
    {
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            listFile = fc.getSelectedFile();
            System.out.println("Opening: " + listFile.getName() + ".");
        }
        else
        {
            System.out.println("Open command cancelled by user.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddRow;
    private javax.swing.JButton bCalcAll;
    private javax.swing.JButton bCalcProd;
    private javax.swing.JButton bCopy;
    private javax.swing.JButton bMoveDown;
    private javax.swing.JButton bMoveUp;
    private javax.swing.JButton bPaste;
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
    private final AboutDialog aboutDialog;
    private JFileChooser fc;
    private File listFile;
}
