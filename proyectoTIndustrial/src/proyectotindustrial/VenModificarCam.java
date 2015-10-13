package proyectotindustrial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;                                                               // Bibliotecas necesarias para lectura de archivos
import java.util.ArrayList;                                                     // Uso de listas dinamicas para el manejo de productos

/**
 *
 * @author luis diego
 */
public class VenModificarCam extends javax.swing.JFrame {

    /**
     * Creates new form VenModificarCam
     */
    public VenModificarCam() {
        initComponents();
        
        numero.setText("------------------------------------------------------------------------------------------------");
        compartimentos.setText("------------------------------------------------------------------------------------------------");
        capacidadq.setText("------------------------------------------------------------------------------------------------");
        capacidadkg.setText("------------------------------------------------------------------------------------------------");
        capacidadt.setText("------------------------------------------------------------------------------------------------");
        proveedor.setText("------------------------------------------------------------------------------------------------");        
    }
    
    static class NodoLista{                                                     // Clase que define cada nodo
        int numeroCamion;
        int placa;
        int campos;                                                             // Cantidad de contenedores internos del camion
        double capacidadQ;                                                      // Capacidades por campo
        double capacidadKg;
        double capacidad;
        String proveedor;
        //int entregaNodisponible;      
        String carretaProductos[];                                              // Vector que indica el producto que contiene cada compartimento
        double carretaEspacioLibre[];                                           // Vector que indica la cantidad de espacio libre que queda en el compartimento
        double diponibilidadTiempo;
        double numEntregaPedidoAnterior;                                           // Variable que indica el ultimo pedido insertado en los compartimentos
    }
    
    String camionAbuscar;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capacidadq = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        compartimentos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        proveedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        capacidadkg = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        capacidadt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JToggleButton();
        Buscar = new javax.swing.JToggleButton();
        mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(603, 420));
        setResizable(false);

        jLabel5.setText("Capacidad por Compartimento (KG):");

        jLabel6.setText("Capacidad Total del Camión:");

        jLabel7.setText("Proveedor:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Modificar Camión");

        jLabel2.setText("Número de Camión:");

        jLabel3.setText("Placa de Camión:");

        jLabel9.setText("Número de Compartimentos:");

        capacidadkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacidadkgActionPerformed(evt);
            }
        });

        jLabel4.setText("Capacidad por Compartimento (Q):");

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        mensaje.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(capacidadq, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(compartimentos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(capacidadkg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(capacidadt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(proveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Buscar))
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(mensaje))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(compartimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadkg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidadt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(Aceptar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void capacidadkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacidadkgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacidadkgActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        
        // Se procede a buscar el camion en la lista de camiones
        
        String placaCamion = placa.getText();
        camionAbuscar = placaCamion;
        
        ArrayList<NodoLista> listaCamiones = new ArrayList<>();    // Lista de objetos camion
        
        // Busca en la lista de camiones el camion seleccionado
        
        File archivo = null;
        FileReader lector = null;
        BufferedReader lectorLinea = null;
        
        File file_ = new File("Camiones.txt"); 
        String fileName = file_.getAbsolutePath();
        
        try {                                                                   // Se abre el archivo de camiones
         archivo = new File (fileName);
         lector = new FileReader(archivo);
         lectorLinea = new BufferedReader(lector);
          
         String linea;
         String delimitadoresPalabras = ",";                                    // Variable utilizada para separar los valores en el archivo por cada linea
         String[] palabrasSeparadas;
         while( ( linea = lectorLinea.readLine() ) != null){                    // Se lee cada linea del archivo
            palabrasSeparadas = linea.split(delimitadoresPalabras);  
            
            NodoLista nuevoNodo = new NodoLista();
            
            nuevoNodo.numeroCamion = Integer.parseInt(palabrasSeparadas[0]);         // Variables temporales para casting 
            nuevoNodo.placa = Integer.parseInt(palabrasSeparadas[1]);
            nuevoNodo.campos = Integer.parseInt(palabrasSeparadas[2]);
            nuevoNodo.capacidadQ = Double.parseDouble(palabrasSeparadas[3]);
            nuevoNodo.capacidadKg = Double.parseDouble(palabrasSeparadas[4]);
            nuevoNodo.capacidad = Double.parseDouble(palabrasSeparadas[5]);
            nuevoNodo.proveedor = palabrasSeparadas[6];
            
            listaCamiones.add(nuevoNodo);
        }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{        
         try{                    
            if( null != lector ){   
               lector.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      } 
        
        // Una vez cargado en la lista de camiones todos los camiones, se busca el que el usuario desea modificar.
        
        for(int i = 0; i < listaCamiones.size(); ++i){
            if( (listaCamiones.get(i).placa+"").equals(placaCamion)){
                mensaje.setText("Camión encontrado");
                placa.setText(""+listaCamiones.get(i).placa);
                numero.setText(""+listaCamiones.get(i).numeroCamion);
                compartimentos.setText(""+listaCamiones.get(i).campos);
                capacidadq.setText(""+listaCamiones.get(i).capacidadQ);
                capacidadkg.setText(""+listaCamiones.get(i).capacidadKg);
                capacidadt.setText(""+listaCamiones.get(i).capacidad);
                proveedor.setText(""+listaCamiones.get(i).proveedor);
                i = listaCamiones.size();
            }else{
                if(i == listaCamiones.size() - 1){
                    mensaje.setText("Camión no encontrado");  
                    numero.setText("------------------------------------------------------------------------------------------------");
                    compartimentos.setText("------------------------------------------------------------------------------------------------");
                    capacidadq.setText("------------------------------------------------------------------------------------------------");
                    capacidadkg.setText("------------------------------------------------------------------------------------------------");
                    capacidadt.setText("------------------------------------------------------------------------------------------------");
                    proveedor.setText("------------------------------------------------------------------------------------------------");        
                }
            }
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        // TODO add your handling code here:
        
        // Se procede con la modificacion del camion
        
        String nuevaLinea = numero.getText() +","+ placa.getText() +","+ compartimentos.getText() +","+ capacidadq.getText() +","+ capacidadkg.getText() +","+ capacidadt.getText() +","+ proveedor.getText();
        
        try {
            File inFile = new File("Camiones.txt");

            if (!inFile.isFile()) {
                System.out.println("Parameter is not an existing file");
                return;
            }
        
        File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

        BufferedReader br = new BufferedReader(new FileReader("Camiones.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

         String line = null;
         String delimitadoresPalabras = ",";                                    // Variable utilizada para separar los valores en el archivo por cada linea
         String[] lineas;

        while ((line = br.readLine()) != null) {

            if( line.trim().split(delimitadoresPalabras)[1].equals(camionAbuscar) ){
                pw.println(nuevaLinea);
                pw.flush();
            }else{
                if (!(line.trim().split(delimitadoresPalabras)[1].equals(camionAbuscar))) {
                    pw.println(line);
                    pw.flush();
                }
            }
        }
        pw.close();
        br.close();

        //Delete the original file
        if (!inFile.delete()) {
            System.out.println("Could not delete file");
        return;
        } 

        //Rename the new file to the filename the original file had.
        if (!tempFile.renameTo(inFile))
            System.out.println("Could not rename file");

        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        
        mensaje.setText("Camión modificado");
        
    }//GEN-LAST:event_AceptarActionPerformed

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
            java.util.logging.Logger.getLogger(VenModificarCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenModificarCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenModificarCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenModificarCam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenModificarCam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Aceptar;
    private javax.swing.JToggleButton Buscar;
    private javax.swing.JTextField capacidadkg;
    private javax.swing.JTextField capacidadq;
    private javax.swing.JTextField capacidadt;
    private javax.swing.JTextField compartimentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField placa;
    private javax.swing.JTextField proveedor;
    // End of variables declaration//GEN-END:variables
}
