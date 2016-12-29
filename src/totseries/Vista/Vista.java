/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totseries.Vista;

import java.io.File;
import java.util.Iterator;
import totseries.Controlador.TotSeries;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static totseries.Main.cargarDatos;
import totseries.Modelo.Media.Episodio;
import totseries.Modelo.Media.Serie;
import totseries.Modelo.Media.Temporada;
import totseries.Modelo.Usuario.Cliente;
import totseries.Modelo.Usuario.Usuario;
import totseries.Parser.TotSeriesDataManager;

/**
 *
 * @author Abel
 */
public class Vista extends javax.swing.JFrame {

    TotSeries controlador;

    /**
     * Creates new form Vista
     *
     * @param controlador
     */
    public Vista(TotSeries controlador) {
        initComponents();
        this.controlador = controlador;
        this.jMenuAdministrador.setVisible(false);
        this.jMenuCliente.setVisible(false);
        this.actualizarMasValorados();
        this.actualizarCatalogo();
        this.actualizarMasVistos();
        this.jListClientes.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListCatalogo = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListTemporadas = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListEpisodios = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListMesVistes = new javax.swing.JList<>();
        jTextFieldEpisodios = new javax.swing.JLabel();
        jTextFieldTemporadas = new javax.swing.JLabel();
        jTextFieldCatalogo = new javax.swing.JLabel();
        jTextFieldMasValorados = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jlistMesValoradosNota = new javax.swing.JList<>();
        jTextFieldTOP1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jListClientes = new javax.swing.JList<>();
        jTextFieldClientes = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jlistMesValorados = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jlistMesVistesTotal = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemRegistrar = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItemDesloguear = new javax.swing.JMenuItem();
        jMenuAdministrador = new javax.swing.JMenu();
        jMenuItemCargarFichero = new javax.swing.JMenuItem();
        jMenuItemAsignarVIP = new javax.swing.JMenuItem();
        jMenuItemDeslogearAdmin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jListCatalogo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCatalogoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListCatalogo);

        jListTemporadas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListTemporadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListTemporadasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListTemporadas);

        jListEpisodios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListEpisodios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reproducirEvent(evt);
            }
        });
        jScrollPane3.setViewportView(jListEpisodios);

        jListMesVistes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListMesVistes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reproducirEvent(evt);
            }
        });
        jScrollPane5.setViewportView(jListMesVistes);

        jTextFieldEpisodios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextFieldEpisodios.setText("Episodios");

        jTextFieldTemporadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextFieldTemporadas.setText("Temporadas");

        jTextFieldCatalogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextFieldCatalogo.setText("Series");

        jTextFieldMasValorados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextFieldMasValorados.setText("Mas valorados");

        jlistMesValoradosNota.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlistMesValoradosNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                episodioNotaClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jlistMesValoradosNota);

        jTextFieldTOP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextFieldTOP1.setText("Mes vsites");

        jListClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(jListClientes);

        jTextFieldClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextFieldClientes.setText("Clientes");

        jlistMesValorados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlistMesValorados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reproducirEvent(evt);
            }
        });
        jScrollPane8.setViewportView(jlistMesValorados);

        jlistMesVistesTotal.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlistMesVistesTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistMesVistesTotalreproducirEvent(evt);
            }
        });
        jScrollPane9.setViewportView(jlistMesVistesTotal);

        jMenuUsuario.setText("Usuario");
        jMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUsuarioActionPerformed(evt);
            }
        });

        jMenuItemLogin.setText("Login");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemLogin);

        jMenuItemRegistrar.setText("Registrar");
        jMenuItemRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemRegistrar);

        jMenuBar1.add(jMenuUsuario);

        jMenuCliente.setText("Cliente");

        jMenuItem2.setText("Episodios mas valorados");
        jMenuCliente.add(jMenuItem2);

        jMenuItem1.setText("Temporadas mas valoradas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItem1);

        jMenuItem3.setText("Series mas valoradas");
        jMenuCliente.add(jMenuItem3);

        jMenuItem4.setText("Episodios más visualizados");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItem4);

        jMenuItem5.setText("Temporadas más visualizadas");
        jMenuCliente.add(jMenuItem5);

        jMenuItem6.setText("Series más visualizadas");
        jMenuCliente.add(jMenuItem6);

        jMenuItemDesloguear.setText("Desloguear");
        jMenuItemDesloguear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemDesloguear);

        jMenuBar1.add(jMenuCliente);

        jMenuAdministrador.setText("Administrador");

        jMenuItemCargarFichero.setText("Cargar Fichero");
        jMenuItemCargarFichero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCargarFicheroActionPerformed(evt);
            }
        });
        jMenuAdministrador.add(jMenuItemCargarFichero);

        jMenuItemAsignarVIP.setText("AsignarVIP");
        jMenuItemAsignarVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAsignarVIPActionPerformed(evt);
            }
        });
        jMenuAdministrador.add(jMenuItemAsignarVIP);

        jMenuItemDeslogearAdmin.setText("Desloguear");
        jMenuItemDeslogearAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenuAdministrador.add(jMenuItemDeslogearAdmin);

        jMenuBar1.add(jMenuAdministrador);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldMasValorados, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldTOP1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldClientes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCatalogo)
                        .addComponent(jTextFieldTemporadas)
                        .addComponent(jTextFieldEpisodios)
                        .addComponent(jTextFieldMasValorados)
                        .addComponent(jTextFieldTOP1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
        LoginJDialong login = new LoginJDialong(this, true, this.controlador);
        login.setVisible(true);
        if (this.controlador.isloggedAdmin()) {
            this.jMenuAdministrador.setVisible(true);
            this.jMenuUsuario.setVisible(false);
            this.jListClientes.setVisible(true);
            this.jListClientes.setEnabled(true);
            this.jTextFieldClientes.setVisible(true);
            this.jListMesVistes = null;
            this.actualizarClientesNonVIP();
        } else if (this.controlador.islogged()) {
            this.jTextFieldMasValorados.setText("");
            this.jMenuCliente.setVisible(true);
            this.jMenuUsuario.setVisible(false);
            this.jTextFieldMasValorados.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void jMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUsuarioActionPerformed

    }//GEN-LAST:event_jMenuUsuarioActionPerformed

    private void jMenuItemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarActionPerformed
        RegistroJDialog registro = new RegistroJDialog(this, true, this.controlador);
        registro.setVisible(true);

    }//GEN-LAST:event_jMenuItemRegistrarActionPerformed

    private void jListCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCatalogoMouseClicked
        this.vaciarListaEpisodios();
        this.actualizarTemporadas();
    }//GEN-LAST:event_jListCatalogoMouseClicked

    private void jListTemporadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListTemporadasMouseClicked
        this.vaciarListaEpisodios();
        this.actualizarEpisodios();
    }//GEN-LAST:event_jListTemporadasMouseClicked

    private void jMenuItemCargarFicheroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCargarFicheroActionPerformed
        JOptionPane.showMessageDialog(this, "No controlamos las excepciones que se puedan producir aqui");
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            TotSeriesDataManager dataManager = new TotSeriesDataManager();
            dataManager.obtenirDades(file.getAbsolutePath());
            controlador = dataManager.cargarDatos(controlador);
            actualizarAll();
        }
    }//GEN-LAST:event_jMenuItemCargarFicheroActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.controlador.logout();
        this.jMenuCliente.setVisible(false);
        this.jMenuAdministrador.setVisible(false);
        this.jMenuUsuario.setVisible(true);
        this.jListClientes.setEnabled(false);
        this.jTextFieldClientes.setVisible(false);
        this.vaciarListaClientes();
    }//GEN-LAST:event_logoutActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void reproducirEvent(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reproducirEvent
        JList list = (JList) evt.getSource();
        if (list.getSelectedValue() == null) {
            return;
        }
        if (!controlador.islogged()) {
            JOptionPane.showMessageDialog(this, "Tienes que estar registrado para poder ver videos");
            return;
        }

        if (controlador.isloggedAdmin()) {
            JOptionPane.showMessageDialog(this, "Deja de ver videos y ponte a trabajar");
            return;
        }

        EpisodioJDialog repro = new EpisodioJDialog(
                this, true, (Episodio) list.getSelectedValue(), this.controlador);
        repro.setVisible(true);
        actualizarMasValorados();
        actualizarMasVistos();
    }//GEN-LAST:event_reproducirEvent

    private void jMenuItemAsignarVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAsignarVIPActionPerformed

    }//GEN-LAST:event_jMenuItemAsignarVIPActionPerformed

    private void jlistMesVistesTotalreproducirEvent(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistMesVistesTotalreproducirEvent
        // TODO add your handling code here:
    }//GEN-LAST:event_jlistMesVistesTotalreproducirEvent

    private void episodioNotaClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_episodioNotaClicked
        if (null == ((JList) evt.getSource()).getSelectedValue()) {
            return;
        }
        if (!controlador.isloggedAdmin()) {
            return;
        }

        String nota = JOptionPane.showInputDialog("Introduce una valoracion de 0 a 5");
        int int_nota = 0;
        boolean exit = false;
        try {
            int_nota = Integer.parseInt(nota);
        } catch (NumberFormatException e) {
            exit = true;
        } catch (NullPointerException e) {
            exit = true;
        }
        if (int_nota > 5 || int_nota < 0) {
            exit = true;
        }
        if (exit) {
            JOptionPane.showMessageDialog(this, "Error de formato");
            return;
        }
        JOptionPane.showMessageDialog(this, "Añadiendo valoracion de: " + int_nota);

        Episodio ep = jlistMesValorados.getModel().getElementAt(
                ((JList) evt.getSource()).getSelectedIndex());
        
        controlador.valorarEpisodio(ep, int_nota);
        actualizarMasValorados();


    }//GEN-LAST:event_episodioNotaClicked

    private void actualizarCatalogo() {
        DefaultListModel model = new DefaultListModel();
        model.clear();
        Iterator iteratorSerie = this.controlador.getSeries().iterator();
        while (iteratorSerie.hasNext()) {
            model.addElement(iteratorSerie.next());
        }
        this.jListCatalogo.setModel(model);
    }

    private void actualizarTemporadas() {
        if (jListCatalogo.getSelectedValue() == null) {
            return;
        }
        DefaultListModel model = new DefaultListModel();
        model.clear();
        Iterator iteratorTemporada = this.jListCatalogo.getSelectedValue().getTemporadas().iterator();
        while (iteratorTemporada.hasNext()) {
            model.addElement(iteratorTemporada.next());
        }
        this.jListTemporadas.setModel(model);
    }

    private void actualizarMasValorados() {
        DefaultListModel modelEpisode = new DefaultListModel();
        DefaultListModel modelNota = new DefaultListModel();
        Iterator episodeIterator = controlador.getEpisodiosMasValorados().iterator();
        while (episodeIterator.hasNext()) {
            Episodio aux = (Episodio) episodeIterator.next();
            modelEpisode.addElement(aux);
            modelNota.addElement(aux.getPromedio());
            System.out.println(aux.getPromedio());
        }
        this.jlistMesValorados.setModel(modelEpisode);
        this.jlistMesValoradosNota.setModel(modelNota);

    }

    private void actualizarMasVistos() {
        DefaultListModel model = new DefaultListModel();
        DefaultListModel modelTotal = new DefaultListModel();
        Iterator episodeIterator = controlador.getEpisodiosMasVistos().iterator();
        while (episodeIterator.hasNext()) {
            Episodio aux = (Episodio) episodeIterator.next();
            model.addElement(aux);
            modelTotal.addElement(aux.countReproducciones());
        }
        this.jListMesVistes.setModel(model);
        this.jlistMesVistesTotal.setModel(modelTotal);

    }

    private void actualizarClientesNonVIP() {
        DefaultListModel model = new DefaultListModel();
        Iterator iteratorClientes = this.controlador.getClientesNonVIP().iterator();
        while (iteratorClientes.hasNext()) {
            model.addElement(iteratorClientes.next());
        }
        this.jListClientes.setModel(model);
    }

    private void actualizarEpisodios() {
        DefaultListModel model = new DefaultListModel();
        Iterator iteratorEpisodio = this.jListTemporadas.getSelectedValue().getEpisodio().iterator();
        while (iteratorEpisodio.hasNext()) {
            model.addElement(iteratorEpisodio.next());
        }
        this.jListEpisodios.setModel(model);
    }

    private void actualizarAll() {
        actualizarCatalogo();
        actualizarMasValorados();
        actualizarMasVistos();
    }

    private void vaciarListaEpisodios() {
        DefaultListModel model = new DefaultListModel();
        this.jListEpisodios.setModel(model);
    }

    private void vaciarListaClientes() {
        DefaultListModel model = new DefaultListModel();
        this.jListClientes.setModel(model);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            TotSeries controlador = cargarDatos(TotSeries.getInstance());

            @Override
            public void run() {
                new Vista(controlador).setVisible(true);
            }
        });
    }

    public static TotSeries cargarDatos(TotSeries tot_Series) {
        TotSeriesDataManager dataManager = new TotSeriesDataManager();
        dataManager.obtenirDades("data/TotSeries.xml");
        tot_Series = dataManager.cargarDatos(tot_Series);
        tot_Series.registrar("a", "a", "a");
        tot_Series.registrar("test", "b", "b", "b", "b");
        tot_Series.registrar("test2", "test2", "test2", "test2", "b");
        return tot_Series;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Serie> jListCatalogo;
    private javax.swing.JList<Usuario> jListClientes;
    private javax.swing.JList<Episodio> jListEpisodios;
    private javax.swing.JList<Episodio> jListMesVistes;
    private javax.swing.JList<Temporada> jListTemporadas;
    private javax.swing.JMenu jMenuAdministrador;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemAsignarVIP;
    private javax.swing.JMenuItem jMenuItemCargarFichero;
    private javax.swing.JMenuItem jMenuItemDeslogearAdmin;
    private javax.swing.JMenuItem jMenuItemDesloguear;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemRegistrar;
    private javax.swing.JMenu jMenuUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel jTextFieldCatalogo;
    private javax.swing.JLabel jTextFieldClientes;
    private javax.swing.JLabel jTextFieldEpisodios;
    private javax.swing.JLabel jTextFieldMasValorados;
    private javax.swing.JLabel jTextFieldTOP1;
    private javax.swing.JLabel jTextFieldTemporadas;
    private javax.swing.JList<Episodio> jlistMesValorados;
    private javax.swing.JList<String> jlistMesValoradosNota;
    private javax.swing.JList<String> jlistMesVistesTotal;
    // End of variables declaration//GEN-END:variables
}
