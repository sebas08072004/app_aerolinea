import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_registro {
 
    static LinkedList <cls_registro> pasajero = new LinkedList<>();
    static LinkedList <cls_compra_tiquetes> tiquetes = new LinkedList<>();
   // static cls_compra_tiquetes tiquete = new cls_compra_tiquetes();
   //+ "precio de tiquete" + tiquete.getPrecioFlt()
    public static void main(String[] args) {
        fnt_menu(true);
    }

    public static void fnt_menu(boolean menu){
        
            boolean m = true;

            if(menu == true){

                while(m == true){
                String men = JOptionPane.showInputDialog(null,"_______________AEREOLINEA____________ \n 1. registrar clientes:   \n 2. comprar tiquetes:   \n 3.reportes   \n4.salir ");
                if(men.equals("1")){
                    String id = JOptionPane.showInputDialog(null,"identificacion:  ");
                    String nombre = JOptionPane.showInputDialog(null, "nombre:  ");
                    String contacto = JOptionPane.showInputDialog(null, "contacto: ");
                    String correo = JOptionPane.showInputDialog(null, "correo: ");
                    String sexo = JOptionPane.showInputDialog(null, "sexo: ");
                    int membresia =Integer.parseInt( JOptionPane.showInputDialog(null,"-------MENBRESIAS---------- \n 1. bronce: \n 2. plata: \n 3. oro: \n 4.platino: "));
                    
                    if(id.equals("") || nombre.equals("")|| contacto.equals("")||correo.equals("")||sexo.equals("")){
                        JOptionPane.showMessageDialog(null,"debes ingresar todos los datos para poder realizar el registro ");
                   
                     }
                    else{
                    pasajero.add (new cls_registro(id, nombre, contacto, correo, sexo, membresia));
                    JOptionPane.showMessageDialog(null, "has sido registrado con exito");
                    }
                }    

                if ((men.equals("2"))) {
                    if(pasajero.size() > 0){
                        String id_cliente = JOptionPane.showInputDialog(null,"identificacion: ");

                        float descu_membreFlt = 0;

                        for(int i = 0; i < pasajero.size(); i++){
                            if(pasajero.get(i).getIdStr().equals(id_cliente)){

                                descu_membreFlt = pasajero.get(i).getDesc_membresiaFlt();
                            
                            }
                        }
                        
                        
                        int cantidad = Integer.parseInt( JOptionPane.showInputDialog(null,"cantidad: "));
                        String  tipo_clase =  JOptionPane.showInputDialog(null, "---------CLASE--------- \n1 economica: \n 2. turista \n 3. VIP \n");

                        String metodo_pago = JOptionPane.showInputDialog(null, "------METODO DE PAGO---------\n 1. efectivo (5%) \n 2. tarjeta credito (7%) \n 3. tarjeta ahorro (2%) \n4. transferencia (10%) \n");

                        tiquetes.add(new cls_compra_tiquetes(id_cliente, cantidad, tipo_clase, metodo_pago, descu_membreFlt));
                    }else{
                        
                    }
                }
                if(men.equals("3")){
                    String id_reporte = JOptionPane.showInputDialog(null, "identificacion: ");
                    
                    for(int i = 0; i < tiquetes.size(); i++) {
                        if(tiquetes.get(i).getIdcliente().equals(id_reporte)){
                             JOptionPane.showMessageDialog(null,"---------REPORTE---------- \n\nidentificacion: "+tiquetes.get(i).getIdcliente()+" \n nombre:  " + pasajero.get(i).getNombreStr()+ "\ncontacto: "+pasajero.get(i).getContactoStr()  + "\n cantidad: "+ tiquetes.get(i).getCantidadInt() + "\n subototal: "+ tiquetes.get(i).getSubtotalFlt() + "\n descuento: "+ tiquetes.get(i).getDescuentoFlt()+"\niva: "+ tiquetes.get(i).getIvaFlt()+ "\n total: "+ tiquetes.get(i).getTotalFlt());
                        }

                    }

                }
                if(men.equals("4")){
                    System.exit(0);
                }
            
            
            }
                
    }
}
}
