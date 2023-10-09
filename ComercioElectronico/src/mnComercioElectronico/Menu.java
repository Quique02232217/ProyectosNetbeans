/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mnComercioElectronico;

import javax.swing.JOptionPane;

/**
 *
 * @author l
 */
public class Menu {
  public static void main (String []args){
      int opcion=0;
    do{
     opcion= Integer.parseInt (JOptionPane.showInputDialog (null,
                     " SELECCIONAR OPCION  \n"+
                     "1.-INICIE SESION\n"+
                     "2.-CATEGORIAS\n"+
                     "3.-MIS COMPRAS\n"+
                     "4.-MI BOLSA\n"+
                     "5.-BUSQUEDA\n"+
                     "6.-CERRAR SESION\n"+
                     "INGRESE UNA OPCION [1-6]","MENU PRINCIPAL",JOptionPane.QUESTION_MESSAGE));
 
      switch(opcion){
          case 1: inicie_sesion();break;
          case 2: categorias();break;
          case 3: mis_compras();break;
          case 4: mi_bolsa();break;
          case 5: busqueda();break;
          case 6: JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DIA");System.exit(0);break;
          default:JOptionPane.showMessageDialog(null,"ELIJA UNA OPCION VALIDA\n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);
          
      } }while(opcion!=6);  
    }
      public static void inicie_sesion (){
          String a=JOptionPane.showInputDialog("INGRESE NOMBRE");
          String b=JOptionPane.showInputDialog("INGRESE APELLIDOS");
          String c=JOptionPane.showInputDialog("INGRESE CORREO");
          String d=JOptionPane.showInputDialog("INGRESE CONTRASEÑA");
          }
      public static void categorias (){
          JOptionPane.showMessageDialog(null, "Electrodomesticos, Ropa Infantil, Ropa Para Adultos");
          }
      public static void mis_compras (){
          JOptionPane.showInputDialog("INGRESE SU COMPRA");
  } 
      public static void mi_bolsa (){
          JOptionPane.showInputDialog("INGRESE SU BOLSA");
      }
      public static void busqueda (){
          JOptionPane.showInputDialog("INGRESE SU BUSQUEDA");
}
      }
  
