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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
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
        listTableModel = new ListTableModel();
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

        spProdCalcList = new javax.swing.JScrollPane();
        tProdCalcList = new javax.swing.JTable();
        spCalcAllData = new javax.swing.JScrollPane();
        tCalcAllData = new javax.swing.JTable();
        fileToolBar = new javax.swing.JToolBar();
        bNew = new javax.swing.JButton();
        bOpen = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bSaveAs = new javax.swing.JButton();
        editToolBar = new javax.swing.JToolBar();
        bMoveUp = new javax.swing.JButton();
        bMoveDown = new javax.swing.JButton();
        tbAddRowBar = new javax.swing.JToolBar.Separator();
        bAddRow = new javax.swing.JButton();
        bRemoveRow = new javax.swing.JButton();
        tbCopyRowBar = new javax.swing.JToolBar.Separator();
        bCopyRow = new javax.swing.JButton();
        bPasteRow = new javax.swing.JButton();
        calcToolBar = new javax.swing.JToolBar();
        bCalcProd = new javax.swing.JButton();
        bCalcAll = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        mbFile = new javax.swing.JMenu();
        fNew = new javax.swing.JMenuItem();
        fOpen = new javax.swing.JMenuItem();
        fSave = new javax.swing.JMenuItem();
        fOpenAs = new javax.swing.JMenuItem();
        fLatestMenu = new javax.swing.JMenu();
        fPrintBar = new javax.swing.JPopupMenu.Separator();
        fPrint = new javax.swing.JMenuItem();
        fExitBar = new javax.swing.JPopupMenu.Separator();
        fExit = new javax.swing.JMenuItem();
        mEdit = new javax.swing.JMenu();
        eMoveUp = new javax.swing.JMenuItem();
        eMoveDown = new javax.swing.JMenuItem();
        eAddRowBar = new javax.swing.JPopupMenu.Separator();
        eAddRow = new javax.swing.JMenuItem();
        eRemoveRow = new javax.swing.JMenuItem();
        eCopyRowBar = new javax.swing.JPopupMenu.Separator();
        eCopyRow = new javax.swing.JMenuItem();
        ePasteRow = new javax.swing.JMenuItem();
        mbCalc = new javax.swing.JMenu();
        cCalcProd = new javax.swing.JMenuItem();
        cCalcAll = new javax.swing.JMenuItem();
        mbHelp = new javax.swing.JMenu();
        hAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Відомість розрахунку продуктивності праці");
        setLocationByPlatform(true);
        setName(""); // NOI18N

        spProdCalcList.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spProdCalcList.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        spProdCalcList.setPreferredSize(new java.awt.Dimension(469, 402));

        tProdCalcList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tProdCalcList.setModel(listTableModel);
        tProdCalcList.setFillsViewportHeight(true);
        spProdCalcList.setViewportView(tProdCalcList);

        spCalcAllData.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spCalcAllData.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tCalcAllData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "", "Разом по галузі:", "0.0", "0.0", "0.0"
            }
        ));
        spCalcAllData.setViewportView(tCalcAllData);

        fileToolBar.setRollover(true);

        bNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconNew24.png"))); // NOI18N
        bNew.setToolTipText("Створити новий файл");
        bNew.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newActionPerformed(evt);
            }
        });
        fileToolBar.add(bNew);

        bOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconOpen24.png"))); // NOI18N
        bOpen.setToolTipText("Відкрити файл");
        bOpen.setFocusable(false);
        bOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bOpen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                openActionPerformed(evt);
            }
        });
        fileToolBar.add(bOpen);

        bSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconSave24.png"))); // NOI18N
        bSave.setToolTipText("Зберегти файл");
        bSave.setFocusable(false);
        bSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveActionPerformed(evt);
            }
        });
        fileToolBar.add(bSave);

        bSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconSaveAs24.png"))); // NOI18N
        bSaveAs.setToolTipText("Зберегти файл з вибраним іменем");
        bSaveAs.setFocusable(false);
        bSaveAs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSaveAs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bSaveAs.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveAsActionPerformed(evt);
            }
        });
        fileToolBar.add(bSaveAs);

        editToolBar.setRollover(true);

        bMoveUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconMoveUp24.png"))); // NOI18N
        bMoveUp.setToolTipText("Підняти рядок вище");
        bMoveUp.setMaximumSize(new java.awt.Dimension(27, 27));
        bMoveUp.setMinimumSize(new java.awt.Dimension(27, 27));
        bMoveUp.setPreferredSize(new java.awt.Dimension(27, 27));
        editToolBar.add(bMoveUp);

        bMoveDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconMoveDown24.png"))); // NOI18N
        bMoveDown.setToolTipText("Опустити рядок нижче");
        bMoveDown.setMaximumSize(new java.awt.Dimension(27, 27));
        bMoveDown.setMinimumSize(new java.awt.Dimension(27, 27));
        bMoveDown.setPreferredSize(new java.awt.Dimension(27, 27));
        editToolBar.add(bMoveDown);
        editToolBar.add(tbAddRowBar);

        bAddRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconAddRow24.png"))); // NOI18N
        bAddRow.setToolTipText("Додати рядок");
        bAddRow.setMaximumSize(new java.awt.Dimension(27, 27));
        bAddRow.setMinimumSize(new java.awt.Dimension(27, 27));
        bAddRow.setPreferredSize(new java.awt.Dimension(27, 27));
        editToolBar.add(bAddRow);

        bRemoveRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconRemoveRow24.png"))); // NOI18N
        bRemoveRow.setToolTipText("Видалити рядок");
        bRemoveRow.setMaximumSize(new java.awt.Dimension(27, 27));
        bRemoveRow.setMinimumSize(new java.awt.Dimension(27, 27));
        bRemoveRow.setPreferredSize(new java.awt.Dimension(27, 27));
        editToolBar.add(bRemoveRow);
        editToolBar.add(tbCopyRowBar);

        bCopyRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconCopy24.png"))); // NOI18N
        bCopyRow.setToolTipText("Скопіювати рядок");
        bCopyRow.setMaximumSize(new java.awt.Dimension(27, 27));
        bCopyRow.setMinimumSize(new java.awt.Dimension(27, 27));
        bCopyRow.setPreferredSize(new java.awt.Dimension(27, 27));
        editToolBar.add(bCopyRow);

        bPasteRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconPaste24.png"))); // NOI18N
        bPasteRow.setToolTipText("Вставити рядок");
        bPasteRow.setMaximumSize(new java.awt.Dimension(27, 27));
        bPasteRow.setMinimumSize(new java.awt.Dimension(27, 27));
        bPasteRow.setPreferredSize(new java.awt.Dimension(27, 27));
        editToolBar.add(bPasteRow);

        calcToolBar.setRollover(true);

        bCalcProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconCalcProd24.png"))); // NOI18N
        bCalcProd.setToolTipText("Розрахувати продуктивність");
        bCalcProd.setMaximumSize(new java.awt.Dimension(27, 27));
        bCalcProd.setMinimumSize(new java.awt.Dimension(27, 27));
        bCalcProd.setPreferredSize(new java.awt.Dimension(27, 27));
        bCalcProd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                calcProdActionPerformed(evt);
            }
        });
        calcToolBar.add(bCalcProd);

        bCalcAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconCalcAll24.png"))); // NOI18N
        bCalcAll.setToolTipText("Розрахувати разом по галузі");
        bCalcAll.setMaximumSize(new java.awt.Dimension(27, 27));
        bCalcAll.setMinimumSize(new java.awt.Dimension(27, 27));
        bCalcAll.setPreferredSize(new java.awt.Dimension(27, 27));
        bCalcAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                calcAllActionPerformed(evt);
            }
        });
        calcToolBar.add(bCalcAll);

        mbFile.setText("Файл");

        fNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        fNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconNew16.png"))); // NOI18N
        fNew.setText("Створити");
        fNew.setToolTipText("Створити новий файл");
        fNew.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newActionPerformed(evt);
            }
        });
        mbFile.add(fNew);

        fOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        fOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconOpen16.png"))); // NOI18N
        fOpen.setText("Відкрити");
        fOpen.setToolTipText("Відкрити файл");
        fOpen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                openActionPerformed(evt);
            }
        });
        mbFile.add(fOpen);

        fSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        fSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconSave16.png"))); // NOI18N
        fSave.setText("Зберегти");
        fSave.setToolTipText("Зберегти файл");
        fSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveActionPerformed(evt);
            }
        });
        mbFile.add(fSave);

        fOpenAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        fOpenAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconSaveAs16.png"))); // NOI18N
        fOpenAs.setText("Зберегти як...");
        fOpenAs.setToolTipText("Зберегти файл з вибраним іменем");
        fOpenAs.setActionCommand("saveAs");
        fOpenAs.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveActionPerformed(evt);
            }
        });
        mbFile.add(fOpenAs);

        fLatestMenu.setText("Відкрити останні файли");
        mbFile.add(fLatestMenu);
        mbFile.add(fPrintBar);

        fPrint.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        fPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconPrint16.png"))); // NOI18N
        fPrint.setText("Друк");
        fPrint.setToolTipText("Роздрукивати таблицю");
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
        fExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconExit16.png"))); // NOI18N
        fExit.setText("Вихід");
        fExit.setToolTipText("Завершити роботу программи");
        fExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fExitActionPerformed(evt);
            }
        });
        mbFile.add(fExit);

        menuBar.add(mbFile);

        mEdit.setText("Редагування");

        eMoveUp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        eMoveUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconMoveUp16.png"))); // NOI18N
        eMoveUp.setText("Підняти рядок");
        mEdit.add(eMoveUp);

        eMoveDown.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DOWN, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        eMoveDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconMoveDown16.png"))); // NOI18N
        eMoveDown.setText("Опустити рядок");
        mEdit.add(eMoveDown);
        mEdit.add(eAddRowBar);

        eAddRow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ADD, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        eAddRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconAddRow16.png"))); // NOI18N
        eAddRow.setText("Додати рядок");
        mEdit.add(eAddRow);

        eRemoveRow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SUBTRACT, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        eRemoveRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconRemoveRow16.png"))); // NOI18N
        eRemoveRow.setText("Видалити рядок");
        mEdit.add(eRemoveRow);
        mEdit.add(eCopyRowBar);

        eCopyRow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        eCopyRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconCopy16.png"))); // NOI18N
        eCopyRow.setText("Скопіювати рядок");
        mEdit.add(eCopyRow);

        ePasteRow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ePasteRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconPaste16.png"))); // NOI18N
        ePasteRow.setText("Вставити рядок");
        mEdit.add(ePasteRow);

        menuBar.add(mEdit);

        mbCalc.setText("Розрахунки");

        cCalcProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cCalcProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconCalcProd16.png"))); // NOI18N
        cCalcProd.setText("Розрахувати продуктивність");
        cCalcProd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                calcProdActionPerformed(evt);
            }
        });
        mbCalc.add(cCalcProd);

        cCalcAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cCalcAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconCalcAll16.png"))); // NOI18N
        cCalcAll.setText("Розрахувати разом по галузі");
        cCalcAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                calcAllActionPerformed(evt);
            }
        });
        mbCalc.add(cCalcAll);

        menuBar.add(mbCalc);

        mbHelp.setText("Довідка");

        hAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        hAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/iconAbout16.png"))); // NOI18N
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
                .addComponent(fileToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(editToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(calcToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(spCalcAllData)
            .addComponent(spProdCalcList, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fileToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(spProdCalcList, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spCalcAllData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calcAllActionPerformed
    {//GEN-HEADEREND:event_calcAllActionPerformed
        setCalcAllData(ListProcessor.calcAll(listTableModel));
    }//GEN-LAST:event_calcAllActionPerformed
    //Start FILE listeners
    private void newActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newActionPerformed
    {//GEN-HEADEREND:event_newActionPerformed
        if (listFile == null || saveBeforeLoose())
        {
            listFile = null;
            listTableModel.clearTable();
            tProdCalcList.repaint();
        }
    }//GEN-LAST:event_newActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_openActionPerformed
    {//GEN-HEADEREND:event_openActionPerformed
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            listFile = fc.getSelectedFile();
            try
            {
                CsvParser.csvFileToListModel(listTableModel, listFile);
            }
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(this, "Невірний формат файлу або файл пошкоджено!", "Помилка!", JOptionPane.ERROR_MESSAGE);
            }

            tProdCalcList.repaint();
        }
    }//GEN-LAST:event_openActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveActionPerformed
    {//GEN-HEADEREND:event_saveActionPerformed
        if ("saveas".equals(evt.getActionCommand()) || null == listFile)
        {
            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION)
            {
                listFile = fc.getSelectedFile();
            }
        }
        else
        {
            saveFile();
        }
    }//GEN-LAST:event_saveActionPerformed

    private void saveAsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveAsActionPerformed
    {//GEN-HEADEREND:event_saveAsActionPerformed

    }//GEN-LAST:event_saveAsActionPerformed

    private void fPrintActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fPrintActionPerformed
    {//GEN-HEADEREND:event_fPrintActionPerformed
        System.out.println(listTableModel.toString());//debug print
    }//GEN-LAST:event_fPrintActionPerformed

    private void fExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fExitActionPerformed
    {//GEN-HEADEREND:event_fExitActionPerformed
        if (listFile == null || saveBeforeLoose())
        {
            System.exit(0);
        }
    }//GEN-LAST:event_fExitActionPerformed
    //End FILE listeners
    //Start CALC listeners
    private void calcProdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calcProdActionPerformed
    {//GEN-HEADEREND:event_calcProdActionPerformed
        ListProcessor.calcProd(listTableModel);
    }//GEN-LAST:event_calcProdActionPerformed
    //End CALC listeners

    //Start HELP listeners
    private void hAboutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_hAboutActionPerformed
    {//GEN-HEADEREND:event_hAboutActionPerformed
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_hAboutActionPerformed
    //End HELP listeners

    private void setCalcAllData(Object allData[])
    {
        JTableHeader th = tCalcAllData.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        tcm.getColumn(2).setHeaderValue(allData[0]);
        tcm.getColumn(3).setHeaderValue(allData[1]);
        tcm.getColumn(4).setHeaderValue(allData[2]);
        th.repaint();
    }

    private static void setTablePreferencess(javax.swing.JTable jTable)
    {
        //jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.getTableHeader().setResizingAllowed(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(140);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(160);
        jTable.getColumnModel().getColumn(4).setPreferredWidth(155);

    }

    private boolean saveBeforeLoose()
    {
        Object[] options =
        {
            "Зберегти", "Відкинути", "Скасувати"
        };
        int result = JOptionPane.showOptionDialog(this,
                "Зберегти файл \"" + listFile.getName() + "\"?",
                "Зберегти?",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);

        if (result == 0)
        {
            saveFile();
        }

        if (result == 2)//Якщо натиснуто "Скасувати"
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    private void saveFile()
    {
        //TODO: Add file saving
    }

    public static void main(String args[])
    {
        try
        {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e)
        {
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddRow;
    private javax.swing.JButton bCalcAll;
    private javax.swing.JButton bCalcProd;
    private javax.swing.JButton bCopyRow;
    private javax.swing.JButton bMoveDown;
    private javax.swing.JButton bMoveUp;
    private javax.swing.JButton bNew;
    private javax.swing.JButton bOpen;
    private javax.swing.JButton bPasteRow;
    private javax.swing.JButton bRemoveRow;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bSaveAs;
    private javax.swing.JMenuItem cCalcAll;
    private javax.swing.JMenuItem cCalcProd;
    private javax.swing.JToolBar calcToolBar;
    private javax.swing.JMenuItem eAddRow;
    private javax.swing.JPopupMenu.Separator eAddRowBar;
    private javax.swing.JMenuItem eCopyRow;
    private javax.swing.JPopupMenu.Separator eCopyRowBar;
    private javax.swing.JMenuItem eMoveDown;
    private javax.swing.JMenuItem eMoveUp;
    private javax.swing.JMenuItem ePasteRow;
    private javax.swing.JMenuItem eRemoveRow;
    private javax.swing.JToolBar editToolBar;
    private javax.swing.JMenuItem fExit;
    private javax.swing.JPopupMenu.Separator fExitBar;
    private javax.swing.JMenu fLatestMenu;
    private javax.swing.JMenuItem fNew;
    private javax.swing.JMenuItem fOpen;
    private javax.swing.JMenuItem fOpenAs;
    private javax.swing.JMenuItem fPrint;
    private javax.swing.JPopupMenu.Separator fPrintBar;
    private javax.swing.JMenuItem fSave;
    private javax.swing.JToolBar fileToolBar;
    private javax.swing.JMenuItem hAbout;
    private javax.swing.JMenu mEdit;
    private javax.swing.JMenu mbCalc;
    private javax.swing.JMenu mbFile;
    private javax.swing.JMenu mbHelp;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane spCalcAllData;
    private javax.swing.JScrollPane spProdCalcList;
    private javax.swing.JTable tCalcAllData;
    private javax.swing.JTable tProdCalcList;
    private javax.swing.JToolBar.Separator tbAddRowBar;
    private javax.swing.JToolBar.Separator tbCopyRowBar;
    // End of variables declaration//GEN-END:variables
    private ListTableModel listTableModel;
    private final AboutDialog aboutDialog;
    private JFileChooser fc;
    private File listFile;
}
