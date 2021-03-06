/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author Samuel
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /*NumeroLinea numeroLineaC;
    NumeroLinea numeroLineaR;*/

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        /*numeroLineaR = new NumeroLinea(txtResultado);
        panelResultado.setRowHeaderView(numeroLineaR);
        numeroLineaC = new NumeroLinea(txtCodigo);
        panelCodigo.setRowHeaderView(numeroLineaC);*/

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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelMain = new javax.swing.JPanel();
        btnAnalizarSint = new javax.swing.JButton();
        btnAnalizar = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        iconoCodigo = new javax.swing.JLabel();
        iconoResultado1 = new javax.swing.JLabel();
        lblResultado1 = new javax.swing.JLabel();
        lblResultado2 = new javax.swing.JLabel();
        panelError = new javax.swing.JScrollPane();
        txtError = new javax.swing.JTextArea();
        panelCodigo = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JTextArea();
        panelResultado = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        lblBackground = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1131, 672));
        setResizable(false);
        setSize(1131, 672);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMain.setBackground(new java.awt.Color(251, 251, 251));
        panelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnalizarSint.setBackground(new java.awt.Color(239, 239, 239));
        btnAnalizarSint.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnAnalizarSint.setForeground(new java.awt.Color(17, 16, 16));
        btnAnalizarSint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha-correcta (1).png"))); // NOI18N
        btnAnalizarSint.setText("Analizar");
        btnAnalizarSint.setBorder(null);
        btnAnalizarSint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSintActionPerformed(evt);
            }
        });
        panelMain.add(btnAnalizarSint, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 130, 50));

        btnAnalizar.setBackground(new java.awt.Color(239, 239, 239));
        btnAnalizar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnAnalizar.setForeground(new java.awt.Color(17, 16, 16));
        btnAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha-correcta (1).png"))); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.setBorder(null);
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });
        panelMain.add(btnAnalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 130, 50));

        lblCodigo.setBackground(new java.awt.Color(242, 241, 236));
        lblCodigo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(17, 16, 16));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("Codigo");
        lblCodigo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblCodigo.setPreferredSize(new java.awt.Dimension(41, 30));
        panelMain.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 100, -1));

        iconoCodigo.setBackground(new java.awt.Color(242, 241, 236));
        iconoCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/codigo.png"))); // NOI18N
        iconoCodigo.setMaximumSize(new java.awt.Dimension(50, 50));
        iconoCodigo.setMinimumSize(new java.awt.Dimension(30, 30));
        iconoCodigo.setOpaque(true);
        iconoCodigo.setPreferredSize(new java.awt.Dimension(30, 30));
        panelMain.add(iconoCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        iconoResultado1.setBackground(new java.awt.Color(251, 251, 251));
        iconoResultado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoResultado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/programacion.png"))); // NOI18N
        iconoResultado1.setMaximumSize(new java.awt.Dimension(50, 50));
        iconoResultado1.setMinimumSize(new java.awt.Dimension(30, 30));
        iconoResultado1.setPreferredSize(new java.awt.Dimension(30, 30));
        panelMain.add(iconoResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        lblResultado1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblResultado1.setForeground(new java.awt.Color(17, 16, 16));
        lblResultado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado1.setText("Output - Codigo (run)");
        lblResultado1.setPreferredSize(new java.awt.Dimension(41, 30));
        panelMain.add(lblResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 220, -1));

        lblResultado2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblResultado2.setForeground(new java.awt.Color(17, 16, 16));
        lblResultado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado2.setText("Resultado");
        lblResultado2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblResultado2.setPreferredSize(new java.awt.Dimension(41, 30));
        panelMain.add(lblResultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 100, -1));

        txtError.setEditable(false);
        txtError.setBackground(new java.awt.Color(11, 33, 43));
        txtError.setColumns(20);
        txtError.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtError.setForeground(new java.awt.Color(255, 255, 255));
        txtError.setLineWrap(true);
        txtError.setRows(5);
        txtError.setWrapStyleWord(true);
        panelError.setViewportView(txtError);

        panelMain.add(panelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 730, 120));

        txtCodigo.setBackground(new java.awt.Color(11, 33, 43));
        txtCodigo.setColumns(20);
        txtCodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setLineWrap(true);
        txtCodigo.setRows(5);
        txtCodigo.setWrapStyleWord(true);
        panelCodigo.setViewportView(txtCodigo);

        panelMain.add(panelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 370, 230));

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(11, 33, 43));
        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setLineWrap(true);
        txtResultado.setRows(5);
        txtResultado.setWrapStyleWord(true);
        panelResultado.setViewportView(txtResultado);

        panelMain.add(panelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 370, 230));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Analizador Lexico.png"))); // NOI18N
        lblBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelMain.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1130, 680));

        getContentPane().add(panelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        // TODO add your handling code here:

        // Creamos  archivo de texto que se analizara
        File archivo = new File("archivo.txt");
        PrintWriter escribir;

        try {

            escribir = new PrintWriter(archivo);
            escribir.print(txtCodigo.getText());
            escribir.close();
            // Se obtiene todo lo del txtarea y lo escribe en el archivo .txt

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            
            //se crea un string donde se almacenara el codigo sin comentarios y se devuelve en el txtarea
            String codigo = (String) txtCodigo.getText().replaceAll("~(.+)", "");
            //Pasamos el texto sin comentarios al txtarea
            txtCodigo.setText(codigo);
            //Creamos el objeto lexer que se encargara de analizar
            Lexer lexer = new Lexer(new StringReader(codigo));
            
            int cont = 1;
            String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
            while (true) {
                Tokens token = lexer.yylex();
                if (token == null) {
                    txtResultado.setText(resultado);
                    return;
                }
                switch (token) {
                    case Line:
                        cont++;
                        resultado += "LINEA " + cont + "\n";
                        break;
                    case Comillas:
                        resultado += "  <Comillas> \t" + lexer.lexeme + "\n";
                        break;
                    case String:
                        resultado += "  <Tipo de dato> \t" + lexer.lexeme + "\n";
                        break;
                    case Int:
                        resultado += "  <Tipo de dato> \t" + lexer.lexeme + "\n";
                        break;
                    case Double:
                        resultado += "  <Tipo de dato> \t" + lexer.lexeme + "\n";
                        break;
                    case Booleano:
                        resultado += "  <Tipo de dato> \t" + lexer.lexeme + "\n";
                        break;
                    case Void:
                        resultado += "  <Tipo de dato> \t" + lexer.lexeme + "\n";
                        break;
                    case Lectura:
                        resultado += "  <Tipo de dato> \t" + lexer.lexeme + "\n";
                        break;
                    case Escritura:
                        resultado += "  <Tipo de dato> \t" + lexer.lexeme + "\n";
                        break;
                    case Char:
                        resultado += "  <Tipo de dato> \t" + lexer.lexeme + "\n";
                        break;
                    case If:
                        resultado += "  <Reservada SI> \t" + lexer.lexeme + "\n";
                        break;
                    case Elseif:
                        resultado += "  <Reservada OSI> \t" + lexer.lexeme + "\n";
                        break;
                    case Else:
                        resultado += "  <Reservada SINO> \t" + lexer.lexeme + "\n";
                        break;
                    case While:
                        resultado += "  <Reservada MIENTRAS> \t" + lexer.lexeme + "\n";
                        break;
                    case For:
                        resultado += "  <Reservada HASTA> \t" + lexer.lexeme + "\n";
                        break;
                    case Igual:
                        resultado += "  <Operador igual> \t" + lexer.lexeme + "\n";
                        break;
                    case Suma:
                        resultado += "  <Operador suma> \t" + lexer.lexeme + "\n";
                        break;
                    case Resta:
                        resultado += "  <Operador resta> \t" + lexer.lexeme + "\n";
                        break;
                    case Multiplicacion:
                        resultado += "  <Operador multiplicacion> \t" + lexer.lexeme + "\n";
                        break;
                    case Division:
                        resultado += "  <Operador division> \t" + lexer.lexeme + "\n";
                        break;
                    case Modulo:
                        resultado += "  <Operador modulo> \t" + lexer.lexeme + "\n";
                        break;
                    case INIFUNC:
                        resultado += "  <Reservada Inicio funciones> \t" + lexer.lexeme + "\n";
                        break;
                    case FINFUNC:
                        resultado += "  <Reservada Fin funciones> \t" + lexer.lexeme + "\n";
                        break;
                    case FUNC:
                        resultado += "  <Reservada funcion> \t" + lexer.lexeme + "\n";
                        break;
                    case RET:
                        resultado += "  <Reservada retornar valor> \t" + lexer.lexeme + "\n";
                        break;
                    case CLASE:
                        resultado += "  <Reservada define clase> \t" + lexer.lexeme + "\n";
                        break;
                    case INIOBJ:
                        resultado += "  <Reservada construct clase> \t" + lexer.lexeme + "\n";
                        break;
                    case NVO:
                        resultado += "  <Reservada crea objeto> \t" + lexer.lexeme + "\n";
                        break;
                    case MISM:
                        resultado += "  <Reservada This> \t" + lexer.lexeme + "\n";
                        break;
                    case INIVAR:
                        resultado += "  <Reservada inicio variables> \t" + lexer.lexeme + "\n";
                        break;
                    case FINVAR:
                        resultado += "  <Reservada fin variables> \t" + lexer.lexeme + "\n";
                        break;
                    case INIEJEC:
                        resultado += "  <Reservada inicio ejecucion> \t" + lexer.lexeme + "\n";
                        break;
                    case FINEJEC:
                        resultado += "  <Reservada fin ejecucion> \t" + lexer.lexeme + "\n";
                        break;
                    case Accerder:
                        resultado += "  <Reservada acceder> \t" + lexer.lexeme + "\n";
                        break;
                    case Or:
                        resultado += "  <Operador logico>\t " + lexer.lexeme + "\n";
                        break;
                    case And:
                        resultado += "  <Operador logico>\t " + lexer.lexeme + "\n";
                        break;
                    case Not:
                        resultado += "  <Operador logico>\t " + lexer.lexeme + "\n";
                        break;
                    case Diferencia_logica:
                        resultado += "  <Operador logico>\t " + lexer.lexeme + "\n";
                        break;
                    case Igualdad_logica:
                        resultado += "  <Operador logico>\t " + lexer.lexeme + "\n";
                        break; 
                    case Op_incremento:
                        resultado += "  <Operador incremento>\t " + lexer.lexeme + "\n";
                        break;
                        case Op_decremento:
                        resultado += "  <Operador decremento>\t " + lexer.lexeme + "\n";
                        break;
                    case Op_relacional:
                        resultado += "  <Operador relacional>\t " + lexer.lexeme + "\n";
                        break;
                    case Op_atribucion:
                        resultado += "  <Operador atribucion>\t " + lexer.lexeme + "\n";
                        break;
                    case True:
                        resultado += "  <Operador booleano>\t " + lexer.lexeme + "\n";
                        break;
                    case False:
                        resultado += "  <Operador booleano>\t " + lexer.lexeme + "\n";
                        break;
                    case Inicio_de_delimitador_de_argumentos:
                        resultado += "  <Inicio argumentos>\t " + lexer.lexeme + "\n";
                        break;
                    case Fin_de_delimitador_de_argumentos:
                        resultado += "  <Fin argumentos> \t" + lexer.lexeme + "\n";
                        break;
                    case Inicio_de_delimitador_de_bloque:
                        resultado += "  <Inicio bloque> \t" + lexer.lexeme + "\n";
                        break;
                    case Fin_de_delimitador_de_bloque:
                        resultado += "  <Fin bloque> \t\t" + lexer.lexeme + "\n";
                        break;
                    case Inicio_de_programa:
                        resultado += "  <Inicio de programa> \t" + lexer.lexeme + "\n";
                        break;
                    case Fin_de_programa:
                        resultado += "  <Fin de programa> \t" + lexer.lexeme + "\n";
                        break;
                    case Fin_de_linea:
                        resultado += "  <Fin de linea> \t\t" + lexer.lexeme + "\n";
                        break;
                    case Identificador:
                        resultado += "  <Identificador> \t" + lexer.lexeme + "\n";
                        break;
                    case Numero:
                        resultado += "  <Numero> \t\t" + lexer.lexeme + "\n";
                        break;
                    case NumeroDecimal:
                        resultado += "  <Numero> \t\t" + lexer.lexeme + "\n";
                        break;
                    case Caracteres:
                        resultado += "  <Tipo Dato> \t\t" + lexer.lexeme + "\n";
                        break;
                    case Caracter:
                        resultado += "  <Tipo Dato> \t\t" + lexer.lexeme + "\n";
                        break;
                    case ERROR:
                        resultado += "  <Simbolo no definido>\n";
                        break;
                    default:
                        resultado += "  < " + lexer.lexeme + " >\n";
                        break;
                }
            }
               
             

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        


    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnAnalizarSintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSintActionPerformed
        // TODO add your handling code here:
        String error = (String) txtCodigo.getText().replaceAll("~(.+)", "");
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(error)));
        
        try{
                s.parse();
                txtError.setText("Analisis realizado correctamente");
                txtError.setForeground(new Color(99, 181, 119));
            }
            catch (Exception ex) {
            Symbol sym = s.getS();
            txtError.setText("Error de sintaxis. Linea: "+(sym.right)+" columna: "+(sym.left)+", ERROR antes de: \""+ sym.value + "\"");
            txtError.setForeground(new Color(235, 70, 70));
            }
    }//GEN-LAST:event_btnAnalizarSintActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnAnalizarSint;
    private javax.swing.JLabel iconoCodigo;
    private javax.swing.JLabel iconoResultado1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JLabel lblResultado2;
    private javax.swing.JScrollPane panelCodigo;
    private javax.swing.JScrollPane panelError;
    private javax.swing.JPanel panelMain;
    private javax.swing.JScrollPane panelResultado;
    private javax.swing.JTextArea txtCodigo;
    private javax.swing.JTextArea txtError;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables

}
