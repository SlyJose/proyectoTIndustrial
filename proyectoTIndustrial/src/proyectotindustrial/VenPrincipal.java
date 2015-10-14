package proyectotindustrial;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis diego
 */
import proyectotindustrial.SeleccionProducto;
import java.lang.String;
import java.io.*;


public class VenPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VenModificarProd
     */
    int varP = 0;       //variables global controla si se estripo producto
    int varA = 0;       //variables global controla si se estripo Asociado
    int varC = 0;       //variables global controla si se estripo Camion
    
            
    String numPedido;
    String nomSocio;
    String numEntrega;
    String producto;
    String cantKg;
    String fechaEntrega;
    String horaEntrega;
    String codPedido;
    
    CreadorOrden orden = new CreadorOrden();
    
    
    
    //OptimizadorRutas optimiza = new OptimizadorRutas();                         // Instancia que maneja la base de datos y optimizacion de rutas
    
        

    
    public VenPrincipal() {
        
        
        initComponents();
        seteaValoresCB();

       //Prueba no util
       //SeleccionProducto productos = new SeleccionProducto();
       //System.out.println(productos.getProductos());
    }
    
    public void seteaValoresCB(){
    
        
        SeleccionProducto productoLista = new SeleccionProducto();
   
        productoLista.cargarArchivo();
                
                
      for (int i = 0; i < productoLista.listaProductos.size(); i++){
        
                btnProducto.addItem(productoLista.listaProductos.get(i).producto);
        }
    
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnProducto = new javax.swing.JComboBox();
        txtNombreSocio = new javax.swing.JTextField();
        txtNumeroEntrega = new javax.swing.JTextField();
        txtCantidadKilos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnNuevaOrden = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        cargarBases = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        setResizable(false);

        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("NUEVA ORDEN");

        jLabel3.setText("Nombre de Socio");

        jLabel4.setText("Número de Entrega");

        jLabel5.setText("Producto");

        jLabel6.setText("Cantidad de Kilogramos");

        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        txtNombreSocio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNumeroEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCantidadKilos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadKilos.setText("0.0");
        txtCantidadKilos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadKilosActionPerformed(evt);
            }
        });

        jButton1.setText("Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Camión");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnNuevaOrden.setText("Nueva Orden");
        btnNuevaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaOrdenActionPerformed(evt);
            }
        });

        jButton5.setText("Generar Rutas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cambria Math", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 0));
        jLabel10.setText("Módulo de Programación de Rutas");

        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Borrar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Modificar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(0, 204, 0));
        jLabel11.setText("BASE DE DATOS");

        jLabel12.setText("Seleccione Conjunto");

        jLabel13.setText("Seleccione Operación");

        jToggleButton1.setText("Limpiar Órdenes");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText(".");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectotindustrial/images.png"))); // NOI18N

        jToggleButton2.setText("Asociado");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        cargarBases.setText("Cargar Base de Datos");
        cargarBases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarBasesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNombreSocio)
                                    .addComponent(txtNumeroEntrega)
                                    .addComponent(txtCantidadKilos)
                                    .addComponent(btnProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                            .addComponent(btnNuevaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargarBases)
                        .addGap(143, 143, 143))))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNombreSocio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNumeroEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1)
                            .addComponent(jButton6)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jButton5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCantidadKilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton7)
                                    .addComponent(jButton3))
                                .addGap(13, 13, 13)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8)
                            .addComponent(jToggleButton2))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargarBases)
                        .addGap(30, 30, 30))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: botton Producto       
        varP = 1;
        varA = 0;
        varC = 0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: botton Camion
        varC = 1;
        varA = 0;
        varP = 0;
    }//GEN-LAST:event_jButton3ActionPerformed

    
    /** Método principal encargado de llevar a cabo el llamado la clase optimizador
     * , a partir de las ordenes ingresadas previamente. 
     */
    
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        for(int i = 0; i < 100; ++i){                                             // Se ejecuta la optimizacion cierta cantidad de veces para mejorar los resultados
            
            OptimizadorRutas optimiza = new OptimizadorRutas();                         // Instancia que maneja la base de datos y optimizacion de rutas
            optimiza.cargarBaseDatos();                                             // Primero se carga la base de datos
            optimiza.cargarPedidos();                                               // Se cargan todos los pedidos ingresados por el usuario            
            optimiza.optimizador();                                                 // Se toman los pedidos ingresados y se ejecuta el algoritmo de ordenamiento
        }        
        
        new VenArchivar().setVisible(true);
        
        // es necesario limpiar el archivo de orden una vez finalizadas las ejecuciones
        //se le hace un llamado a el metodo de borrado en el main para cada vez que se abra la aplicacion borre el orden.txt interno
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here: //botton Agregar
        
        if (varP == 1){

            new VenAgregarProd().setVisible(true);
            varP = 0;
        }
        if (varA == 1){

            new VenAgregarAso().setVisible(true);
            varA = 0;
        }
        if (varC == 1){

            new VenAgregarCam().setVisible(true);
            varC = 0;
        }
  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here: botton Borrar
        
        if (varP == 1){

            new VenBorrarProd().setVisible(true);
            varP = 0;
        }
        if (varA == 1){

            new VenBorrarAso().setVisible(true);
            varA = 0;
        }
        if (varC == 1){

            new VenBorrarCam().setVisible(true);
            varC = 0;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here: botton Modificar
        
        if (varP == 1){

            new VenModificarProd().setVisible(true);
            varP = 0;
        }
        if (varA == 1){

            new VenModificarAso().setVisible(true);
            varA = 0;
        }
        if (varC == 1){

            new VenModificarCam().setVisible(true);
            varC = 0;
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    public boolean existeFinca(String numF){
    
        
        boolean existe = false;
        
        double numFinca = Double.parseDouble(numF);
        
        SeleccionAsociado finca = new SeleccionAsociado();
        finca.cargarArchivo();
       
        for (int i = 0; i < finca.listaAsociados.size(); ++i){
        
            if(numFinca == finca.listaAsociados.get(i).numeroEntrega){
                
                    existe = true;
            }
            
        }
        return existe;
    }
    
    private void btnNuevaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaOrdenActionPerformed
        // TODO add your handling code here:
        
        
        
        if (existeFinca(txtNumeroEntrega.getText()) == true){
        nomSocio = txtNombreSocio.getText();
        System.out.println(nomSocio);
        
        numEntrega =  txtNumeroEntrega.getText();        
        System.out.println(numEntrega);
        
        cantKg = txtCantidadKilos.getText();
        System.out.println(cantKg);
        
  
        producto = String.valueOf(btnProducto.getSelectedItem());
        System.out.println(producto);
        
        
        orden.creaOrden(nomSocio, numEntrega, producto, cantKg);

        limpiaRegistros();
        }
        else {
        
            JOptionPane.showMessageDialog(null, "La finca ingresada no existe, por favor modifique su valor");
        }
    }//GEN-LAST:event_btnNuevaOrdenActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
 
             
        
    }//GEN-LAST:event_btnProductoActionPerformed


    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
        File file_ = new File("Orden.txt"); 
        String fileName = file_.getAbsolutePath();
        
        try {
            
            
        PrintWriter writer = new PrintWriter(fileName);
        writer.print("");
        writer.close();
        
           }

        catch(IOException e)

        {
            e.printStackTrace();

        }
    
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtCantidadKilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadKilosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadKilosActionPerformed

    
    public void guardaNuevoArchivo(String linea , String ruta, String nombreDeArchivo) { 
        
        File file3 = new File(ruta);                                            // Se procede con la nueva escritura del archivo
        String filename = file3.getAbsolutePath();
        
        try
        {

         FileWriter writer = new FileWriter(filename,true);
         writer.write(linea);
         System.out.println("Entré a escribir");
         writer.write(System.lineSeparator());
         writer.close(); 
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        
        
    }
    
    
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        
        // Se cargan los archivos de asociados
        
        cargarAsociados();        
        cargarMatrizTiemposAsociados();        
        cargarMatrizDistanciasAsociados();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void cargarBasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarBasesActionPerformed
        // TODO add your handling code here:
        VenPrincipal.this.dispose();
        
        //ProyectoTIndustrial comienza = new ProyectoTIndustrial();
        VenPrincipal ventanaP = new VenPrincipal();
        
        //limpia
        //comienza.limpiaArhivoOrden();
        //comienza.limpiaArhivoRutas();
       
        
        //inicial seteo de datos
        ventanaP.setVisible(true);
        
    }//GEN-LAST:event_cargarBasesActionPerformed

    
    public void borrarArchivo(String nombreArchivo){
        try {                                                                   // Se borra todo el archivo original
        File inFile = new File(nombreArchivo);

        if (!inFile.isFile()) {
        System.out.println("Parameter is not an existing file");
        return;
        }

        //Construct the new file that will later be renamed to the original filename. 
        File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

        String line = null; 
        while ((line = br.readLine()) != null) {
                pw.flush();                                                     // Se borra cada una de las lineas                
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
    }
    
    public void cargarAsociados(){
        
        String ruta = "";
        
        JFileChooser fc=new JFileChooser();
        fc.setDialogTitle("Selección Lista de Asociados");                      // Primer archivo, lista de asociados
        int returnVal=fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            borrarArchivo("Prueba Asociados.txt");//"Asociados.txt");
            System.out.println(""+fc.getSelectedFile().getAbsolutePath()); 
            ruta = fc.getSelectedFile().getAbsolutePath();                      // Ruta donde se encuentra el archivo de asociados
        }
        else {
            System.out.println("No se cargó el archivo"); 
            JOptionPane.showMessageDialog(null,
                "No se cargó ningún archivo de asociados.",
                    "Información",JOptionPane.INFORMATION_MESSAGE);
            
        }
        
         // Se lee el archivo original de asociados
         
            File archivo = null;
            FileReader lector = null;
            BufferedReader lectorLinea = null;

            File file_ = new File("Prueba Asociados.txt"); 
            String rutaFinal = file_.getAbsolutePath();                         // Ruta donde se van a guardar los datos
            
            String fileName = ruta;                                             // Ruta del archivo que tiene los datos
           
           String archivoCompleto = "";

            try {                                                               // Se abre el archivo de asociados
             archivo = new File (fileName);
             lector = new FileReader(archivo);
             lectorLinea = new BufferedReader(lector);

             String linea;             
             while( ( linea = lectorLinea.readLine() ) != null){                // Se lee cada linea del archivo
               
                 guardaNuevoArchivo(linea, rutaFinal, "Prueba Asociados.txt");                        // Se manda la ruta donde se va a guardar
            }
             
             JOptionPane.showMessageDialog(null,
                "El archivo se ha cargado exitosamente.",
                    "Información",JOptionPane.INFORMATION_MESSAGE);
             
          }
          catch(Exception e){
             e.printStackTrace();             
             
             // mostra ventana emergencia
          }finally{        
             try{                    
                if( null != lector ){   
                   lector.close();     
                }                  
             }catch (Exception e2){ 
                e2.printStackTrace();
                new VenError().setVisible(true);
             }
          }
    }
    
    public void cargarMatrizTiemposAsociados(){
        
        String ruta = "";
        
        JFileChooser fc=new JFileChooser();
        fc.setDialogTitle("Selección Matriz de Tiempos de Asociados");                      // Primer archivo, lista de asociados
        int returnVal=fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            borrarArchivo("Prueba Asociados.txt");//"Tiempos.txt");
            System.out.println(""+fc.getSelectedFile().getAbsolutePath()); 
            ruta = fc.getSelectedFile().getAbsolutePath();                      // Ruta donde se encuentra el archivo de asociados
        }
        else {
            System.out.println("No se cargó el archivo"); 
            JOptionPane.showMessageDialog(null,
                "No se cargó ningún archivo de tiempos.",
                    "Información",JOptionPane.INFORMATION_MESSAGE);
            
            // mostrar mensaje de alerta
        }
        
         // Se lee el archivo original de asociados
         
            File archivo = null;
            FileReader lector = null;
            BufferedReader lectorLinea = null;

            File file_ = new File("Prueba Asociados.txt"); 
            String rutaFinal = file_.getAbsolutePath();                         // Ruta donde se van a guardar los datos
            
            String fileName = ruta;                                             // Ruta del archivo que tiene los datos
           
           String archivoCompleto = "";

            try {                                                               // Se abre el archivo de asociados
             archivo = new File (fileName);
             lector = new FileReader(archivo);
             lectorLinea = new BufferedReader(lector);

             String linea;             
             while( ( linea = lectorLinea.readLine() ) != null){                // Se lee cada linea del archivo
               
                 guardaNuevoArchivo(linea, rutaFinal, "Prueba Asociados.txt");                                 // Se manda la ruta donde se va a guardar
            }
             
             JOptionPane.showMessageDialog(null,
                "El archivo se ha cargado exitosamente.",
                    "Información",JOptionPane.INFORMATION_MESSAGE);
             
          }
          catch(Exception e){
             e.printStackTrace();
             
             // mostra ventana emergencia
          }finally{        
             try{                    
                if( null != lector ){   
                   lector.close();     
                }                  
             }catch (Exception e2){ 
                e2.printStackTrace();
                new VenError().setVisible(true);
             }
          }
    }
    
    public void cargarMatrizDistanciasAsociados(){
        
        String ruta = "";
        
        JFileChooser fc=new JFileChooser();
        fc.setDialogTitle("Selección Matriz de Distancias de Asociados");                      // Primer archivo, lista de asociados
        int returnVal=fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            borrarArchivo("Prueba Asociados.txt");//"Distancias.txt");
            System.out.println(""+fc.getSelectedFile().getAbsolutePath()); 
            ruta = fc.getSelectedFile().getAbsolutePath();                      // Ruta donde se encuentra el archivo de asociados
        }
        else {
            System.out.println("No se cargó el archivo"); 
            JOptionPane.showMessageDialog(null,
                "No se cargó ningún archivo de distancias.",
                    "Información",JOptionPane.INFORMATION_MESSAGE);
            
            // mostrar mensaje de alerta
        }
        
         // Se lee el archivo original de asociados
         
            File archivo = null;
            FileReader lector = null;
            BufferedReader lectorLinea = null;

            File file_ = new File("Prueba Asociados.txt"); 
            String rutaFinal = file_.getAbsolutePath();                         // Ruta donde se van a guardar los datos
            
            String fileName = ruta;                                             // Ruta del archivo que tiene los datos
           
           String archivoCompleto = "";

            try {                                                               // Se abre el archivo de asociados
             archivo = new File (fileName);
             lector = new FileReader(archivo);
             lectorLinea = new BufferedReader(lector);

             String linea;             
             while( ( linea = lectorLinea.readLine() ) != null){                // Se lee cada linea del archivo
               
                 guardaNuevoArchivo(linea, rutaFinal, "Prueba Asociados.txt");                                 // Se manda la ruta donde se va a guardar
            }
             
             JOptionPane.showMessageDialog(null,
                "El archivo se ha cargado exitosamente.",
                    "Información",JOptionPane.INFORMATION_MESSAGE);
             
          }
          catch(Exception e){
             e.printStackTrace();
             
             // mostra ventana emergencia
          }finally{        
             try{                    
                if( null != lector ){   
                   lector.close();     
                }                  
             }catch (Exception e2){ 
                e2.printStackTrace();
                new VenError().setVisible(true);
             }
          }
    }
    
    public void limpiaRegistros(){
    
    
    txtNombreSocio.setText("");
    txtNumeroEntrega.setText("");
    txtCantidadKilos.setText("0.0");
    
    
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
            java.util.logging.Logger.getLogger(VenPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenPrincipal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaOrden;
    private javax.swing.JComboBox btnProducto;
    private javax.swing.JButton cargarBases;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField txtCantidadKilos;
    private javax.swing.JTextField txtNombreSocio;
    private javax.swing.JTextField txtNumeroEntrega;
    // End of variables declaration//GEN-END:variables
}
