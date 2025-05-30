/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.form.evidencijaTermina;

import domain.EvidencijaTermina;
import domain.Frizer;
import domain.Musterija;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modeli.ModelTabeleEvidencijeTermina;
import ui.controller.ClientController;

/**
 *
 * @author Sreja
 */
public class PretraziEvidencijuForma extends javax.swing.JFrame {

    private EvidencijaTermina evidencijaTermina;
    private List<EvidencijaTermina> evidencijeTermina;

    /**
     * Creates new form PretraziEvidencijuForma
     *
     * @throws java.lang.Exception
     */
    public PretraziEvidencijuForma() throws Exception {
        initComponents();
        onemoguciPolja();
        popuniComboBoxMusterijama();
        popuniComboBoxFrizerima();
        popuniTabeluEvidencijeTermina();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonDatum = new javax.swing.JRadioButton();
        jRadioButtonOpis = new javax.swing.JRadioButton();
        jRadioButtonUkupanIznos = new javax.swing.JRadioButton();
        jRadioButtonUkupnoTrajanje = new javax.swing.JRadioButton();
        jRadioButtonFrizer = new javax.swing.JRadioButton();
        jLabelDatum = new javax.swing.JLabel();
        jLabelOpis = new javax.swing.JLabel();
        jLabelUkupanIznos = new javax.swing.JLabel();
        jLabelUkupnoTrajanje = new javax.swing.JLabel();
        jLabelFrizer = new javax.swing.JLabel();
        jTextFieldDatum = new javax.swing.JTextField();
        jTextFieldUkupanIznos = new javax.swing.JTextField();
        jTextFieldUkupnoTrajanje = new javax.swing.JTextField();
        jComboBoxMusterije = new javax.swing.JComboBox<>();
        jButtonPotvrditeKriterijume = new javax.swing.JButton();
        jRadioButtonMusterija = new javax.swing.JRadioButton();
        jLabelMusterija = new javax.swing.JLabel();
        jComboBoxFrizeri = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOpis = new javax.swing.JTextArea();
        jToggleButtonPretraziEvidencije = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEvidencijeTermina = new javax.swing.JTable();
        jButtonDetaljiEvidencije = new javax.swing.JButton();
        jButtonIzmeniEvidenciju = new javax.swing.JButton();
        jButtonOtkazi = new javax.swing.JButton();
        jButtonOsveziPolja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Pretrazite evidencije po:");

        jRadioButtonDatum.setText("Datum");

        jRadioButtonOpis.setText("Opis");

        jRadioButtonUkupanIznos.setText("Ukupan iznos");

        jRadioButtonUkupnoTrajanje.setText("Ukupno trajanje");
        jRadioButtonUkupnoTrajanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUkupnoTrajanjeActionPerformed(evt);
            }
        });

        jRadioButtonFrizer.setText("Frizer");

        jLabelDatum.setText("Unesite datum:");

        jLabelOpis.setText("Unesite opis ili deo opisa:");

        jLabelUkupanIznos.setText("Unesite minimalan iznos:");

        jLabelUkupnoTrajanje.setText("Unesite minimalno trajanje:");

        jLabelFrizer.setText("Odaberite frizera:");

        jTextFieldUkupnoTrajanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUkupnoTrajanjeActionPerformed(evt);
            }
        });

        jButtonPotvrditeKriterijume.setText("Potvrdite kriterijume");
        jButtonPotvrditeKriterijume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotvrditeKriterijumeActionPerformed(evt);
            }
        });

        jRadioButtonMusterija.setText("Musterija");

        jLabelMusterija.setText("Odaberite musteriju:");

        jTextAreaOpis.setColumns(20);
        jTextAreaOpis.setRows(5);
        jScrollPane1.setViewportView(jTextAreaOpis);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jButtonPotvrditeKriterijume)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonOpis, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelOpis, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButtonFrizer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButtonUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButtonMusterija, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jRadioButtonUkupnoTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFrizer)
                                    .addComponent(jLabelMusterija)
                                    .addComponent(jLabelUkupnoTrajanje)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMusterije, 0, 180, Short.MAX_VALUE)
                            .addComponent(jTextFieldUkupnoTrajanje)
                            .addComponent(jComboBoxFrizeri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldUkupanIznos)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldDatum))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonPotvrditeKriterijume))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDatum)
                    .addComponent(jLabelDatum)
                    .addComponent(jTextFieldDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonOpis)
                            .addComponent(jLabelOpis)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonUkupanIznos)
                    .addComponent(jLabelUkupanIznos)
                    .addComponent(jTextFieldUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonUkupnoTrajanje)
                    .addComponent(jLabelUkupnoTrajanje)
                    .addComponent(jTextFieldUkupnoTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonFrizer)
                    .addComponent(jLabelFrizer)
                    .addComponent(jComboBoxFrizeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMusterija)
                    .addComponent(jLabelMusterija)
                    .addComponent(jComboBoxMusterije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jToggleButtonPretraziEvidencije.setText("Pretrazi Evidencije");
        jToggleButtonPretraziEvidencije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPretraziEvidencijeActionPerformed(evt);
            }
        });

        jTableEvidencijeTermina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableEvidencijeTermina);

        jButtonDetaljiEvidencije.setText("Detalji evidencije");
        jButtonDetaljiEvidencije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetaljiEvidencijeActionPerformed(evt);
            }
        });

        jButtonIzmeniEvidenciju.setText("Izmeni evidenciju");
        jButtonIzmeniEvidenciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniEvidencijuActionPerformed(evt);
            }
        });

        jButtonOtkazi.setText("Otkazi");
        jButtonOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOtkaziActionPerformed(evt);
            }
        });

        jButtonOsveziPolja.setText("Osvezi polja");
        jButtonOsveziPolja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOsveziPoljaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDetaljiEvidencije)
                            .addComponent(jButtonIzmeniEvidenciju)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonOtkazi)
                                .addGap(9, 9, 9)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButtonPretraziEvidencije)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButtonOsveziPolja)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButtonOsveziPolja)
                        .addGap(91, 91, 91)
                        .addComponent(jToggleButtonPretraziEvidencije)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDetaljiEvidencije)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonIzmeniEvidenciju)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOtkazi)
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonUkupnoTrajanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUkupnoTrajanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonUkupnoTrajanjeActionPerformed

    private void jTextFieldUkupnoTrajanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUkupnoTrajanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUkupnoTrajanjeActionPerformed

    private void jButtonPotvrditeKriterijumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotvrditeKriterijumeActionPerformed
        if (jRadioButtonDatum.isSelected()) {
            jLabelDatum.setEnabled(true);
            jTextFieldDatum.setEnabled(true);
        } else {
            jLabelDatum.setEnabled(false);
            jTextFieldDatum.setEnabled(false);
        }
        if (jRadioButtonOpis.isSelected()) {
            jLabelOpis.setEnabled(true);
            jTextAreaOpis.setEnabled(true);
        } else {
            jLabelOpis.setEnabled(false);
            jTextAreaOpis.setEnabled(false);
        }
        if (jRadioButtonUkupanIznos.isSelected()) {
            jLabelUkupanIznos.setEnabled(true);
            jTextFieldUkupanIznos.setEnabled(true);
        } else {
            jLabelUkupanIznos.setEnabled(false);
            jTextFieldUkupanIznos.setEnabled(false);
        }
        if (jRadioButtonUkupnoTrajanje.isSelected()) {
            jLabelUkupnoTrajanje.setEnabled(true);
            jTextFieldUkupnoTrajanje.setEnabled(true);
        } else {
            jLabelUkupnoTrajanje.setEnabled(false);
            jTextFieldUkupnoTrajanje.setEnabled(false);
        }
        if (jRadioButtonFrizer.isSelected()) {
            jLabelFrizer.setEnabled(true);
            jComboBoxFrizeri.setEnabled(true);
        } else {
            jLabelFrizer.setEnabled(false);
            jComboBoxFrizeri.setEnabled(false);
        }
        if (jRadioButtonMusterija.isSelected()) {
            jLabelMusterija.setEnabled(true);
            jComboBoxMusterije.setEnabled(true);
        } else {
            jLabelMusterija.setEnabled(false);
            jComboBoxMusterije.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonPotvrditeKriterijumeActionPerformed

    private void jToggleButtonPretraziEvidencijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPretraziEvidencijeActionPerformed
        try {
            evidencijaTermina = new EvidencijaTermina();
            if (jTextFieldDatum.isEnabled()) {
                if (jTextFieldDatum.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Aktivna polja moraju biti popunjena!", "Upozorenje!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                Date datum = null;
                try {
                    datum = format.parse(jTextFieldDatum.getText());
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(this, "Format datuma nije dobar!", "Upozorenje!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                evidencijaTermina.setDatumIVremePocetka(datum);
            }
            if (jTextAreaOpis.isEnabled()) {
                if (jTextAreaOpis.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Aktivna polja moraju biti popunjena!", "Upozorenje!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                evidencijaTermina.setOpis(jTextAreaOpis.getText());
            }
            if (jTextFieldUkupanIznos.isEnabled()) {
                if (jTextFieldUkupanIznos.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Aktivna polja moraju biti popunjena!", "Upozorenje!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                evidencijaTermina.setUkupanIznos(Double.parseDouble(jTextFieldUkupanIznos.getText()));
            }
            if (jTextFieldUkupnoTrajanje.isEnabled()) {
                if (jTextFieldUkupnoTrajanje.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Aktivna polja moraju biti popunjena!", "Upozorenje!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                evidencijaTermina.setUkupnoTrajanje(Double.parseDouble(jTextFieldUkupnoTrajanje.getText()));
            }
            if (jComboBoxFrizeri.isEnabled()) {
                if (jComboBoxFrizeri.getSelectedItem() == null) {
                    JOptionPane.showMessageDialog(this, "Aktivna polja moraju biti popunjena!", "Upozorenje!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                evidencijaTermina.setFrizer((Frizer) jComboBoxFrizeri.getSelectedItem());
            }
            if (jComboBoxMusterije.isEnabled()) {
                if (jComboBoxMusterije.getSelectedItem() == null) {
                    JOptionPane.showMessageDialog(this, "Aktivna polja moraju biti popunjena!", "Upozorenje!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                evidencijaTermina.setMusterija((Musterija) jComboBoxMusterije.getSelectedItem());
            }
            evidencijeTermina = ClientController.getInstance().vratiListuEvidencijaTermina(evidencijaTermina);
            postaviModelTabeleEvidencijeTermina();
            if (evidencijeTermina.isEmpty()) {
                throw new Exception();
            }
            JOptionPane.showMessageDialog(this, "Sistem je nasao evidencije termina po zadatim kriterijumima!", "Obavestenje!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje evidencije termina po zadatim kriterijumima!", "Greska!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jToggleButtonPretraziEvidencijeActionPerformed

    private void jButtonDetaljiEvidencijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetaljiEvidencijeActionPerformed
        try {
            int selektovaniRed = jTableEvidencijeTermina.getSelectedRow();
            if (selektovaniRed == -1) {
                JOptionPane.showMessageDialog(this, "Niste odabrali evidenciju termina!", "Upozorenje", JOptionPane.WARNING_MESSAGE);
                return;
            }
            evidencijaTermina = evidencijeTermina.get(selektovaniRed);
            evidencijaTermina = ClientController.getInstance().pretraziEvidencijaTermina(evidencijaTermina);
            JOptionPane.showMessageDialog(this, "Sistem je nasao evidenciju termina!", "Obavestenje!", JOptionPane.INFORMATION_MESSAGE);
            EvidencijaTerminaForma etf = new EvidencijaTerminaForma(evidencijaTermina.getStavkeTermina());
            etf.setEvidencijaTermina(evidencijaTermina);
            etf.detalji();
            etf.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje evidenciju termina!", "Greska!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDetaljiEvidencijeActionPerformed

    private void jButtonIzmeniEvidencijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniEvidencijuActionPerformed
        try {
            int selektovaniRed = jTableEvidencijeTermina.getSelectedRow();
            if (selektovaniRed == -1) {
                JOptionPane.showMessageDialog(this, "Niste odabrali evidenciju termina!", "Upozorenje", JOptionPane.WARNING_MESSAGE);
                return;
            }
            evidencijaTermina = evidencijeTermina.get(selektovaniRed);
            evidencijaTermina = ClientController.getInstance().pretraziEvidencijaTermina(evidencijaTermina);
            JOptionPane.showMessageDialog(this, "Sistem je nasao evidenciju termina!", "Obavestenje!", JOptionPane.INFORMATION_MESSAGE);
            EvidencijaTerminaForma etf = new EvidencijaTerminaForma(evidencijaTermina.getStavkeTermina());
            etf.setEvidencijaTermina(evidencijaTermina);
            etf.setPef(this);
            etf.izmena();
            etf.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da nadje evidenciju termina!", "Greska!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonIzmeniEvidencijuActionPerformed

    private void jButtonOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOtkaziActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonOtkaziActionPerformed

    private void jButtonOsveziPoljaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOsveziPoljaActionPerformed
        try {
            jRadioButtonDatum.setSelected(false);
            jRadioButtonOpis.setSelected(false);
            jRadioButtonUkupanIznos.setSelected(false);
            jRadioButtonUkupnoTrajanje.setSelected(false);
            jRadioButtonFrizer.setSelected(false);
            jRadioButtonMusterija.setSelected(false);
            jLabelDatum.setEnabled(false);
            jLabelOpis.setEnabled(false);
            jLabelUkupanIznos.setEnabled(false);
            jLabelUkupnoTrajanje.setEnabled(false);
            jLabelFrizer.setEnabled(false);
            jLabelMusterija.setEnabled(false);
            jTextFieldDatum.setEnabled(false);
            jTextAreaOpis.setEnabled(false);
            jTextFieldUkupanIznos.setEnabled(false);
            jTextFieldUkupnoTrajanje.setEnabled(false);
            jComboBoxFrizeri.setEnabled(false);
            jComboBoxMusterije.setEnabled(false);
            jTextFieldDatum.setText("");
            jTextAreaOpis.setText("");
            jTextFieldUkupanIznos.setText("");
            jTextFieldUkupnoTrajanje.setText("");
            jComboBoxFrizeri.setSelectedItem(null);
            jComboBoxMusterije.setSelectedItem(null);
            popuniTabeluEvidencijeTermina();
        } catch (Exception ex) {
            Logger.getLogger(PretraziEvidencijuForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOsveziPoljaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetaljiEvidencije;
    private javax.swing.JButton jButtonIzmeniEvidenciju;
    private javax.swing.JButton jButtonOsveziPolja;
    private javax.swing.JButton jButtonOtkazi;
    private javax.swing.JButton jButtonPotvrditeKriterijume;
    private javax.swing.JComboBox<Object> jComboBoxFrizeri;
    private javax.swing.JComboBox<Object> jComboBoxMusterije;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDatum;
    private javax.swing.JLabel jLabelFrizer;
    private javax.swing.JLabel jLabelMusterija;
    private javax.swing.JLabel jLabelOpis;
    private javax.swing.JLabel jLabelUkupanIznos;
    private javax.swing.JLabel jLabelUkupnoTrajanje;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDatum;
    private javax.swing.JRadioButton jRadioButtonFrizer;
    private javax.swing.JRadioButton jRadioButtonMusterija;
    private javax.swing.JRadioButton jRadioButtonOpis;
    private javax.swing.JRadioButton jRadioButtonUkupanIznos;
    private javax.swing.JRadioButton jRadioButtonUkupnoTrajanje;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEvidencijeTermina;
    private javax.swing.JTextArea jTextAreaOpis;
    private javax.swing.JTextField jTextFieldDatum;
    private javax.swing.JTextField jTextFieldUkupanIznos;
    private javax.swing.JTextField jTextFieldUkupnoTrajanje;
    private javax.swing.JToggleButton jToggleButtonPretraziEvidencije;
    // End of variables declaration//GEN-END:variables

    private void postaviModelTabeleEvidencijeTermina() {
        ModelTabeleEvidencijeTermina mtet = new ModelTabeleEvidencijeTermina(evidencijeTermina);
        jTableEvidencijeTermina.setModel(mtet);
        jTableEvidencijeTermina.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTableEvidencijeTermina.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTableEvidencijeTermina.getColumnModel().getColumn(2).setPreferredWidth(30);
        jTableEvidencijeTermina.getColumnModel().getColumn(3).setPreferredWidth(40);
        jTableEvidencijeTermina.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTableEvidencijeTermina.getColumnModel().getColumn(5).setPreferredWidth(60);
    }

    private void popuniComboBoxFrizerima() throws Exception {
        List<Frizer> frizeri = ClientController.getInstance().vratiListuSviFrizer();
        jComboBoxFrizeri.setModel(new DefaultComboBoxModel<>(frizeri.toArray()));
        jComboBoxFrizeri.setSelectedItem(null);
    }

    private void popuniComboBoxMusterijama() throws Exception {
        List<Musterija> musterije = ClientController.getInstance().vratiListuSviMusterija();
        jComboBoxMusterije.setModel(new DefaultComboBoxModel<>(musterije.toArray()));
        jComboBoxMusterije.setSelectedItem(null);
    }

    private void onemoguciPolja() {
        jTextFieldDatum.setEnabled(false);
        jTextAreaOpis.setEnabled(false);
        jTextFieldUkupanIznos.setEnabled(false);
        jTextFieldUkupnoTrajanje.setEnabled(false);
        jComboBoxFrizeri.setEnabled(false);
        jComboBoxMusterije.setEnabled(false);
        jLabelDatum.setEnabled(false);
        jLabelOpis.setEnabled(false);
        jLabelUkupanIznos.setEnabled(false);
        jLabelUkupnoTrajanje.setEnabled(false);
        jLabelFrizer.setEnabled(false);
        jLabelMusterija.setEnabled(false);
    }

    public void popuniTabeluEvidencijeTermina() throws Exception {
        evidencijeTermina = ClientController.getInstance().vratiListuSviEvidencijaTermina();
        postaviModelTabeleEvidencijeTermina();
    }
}
