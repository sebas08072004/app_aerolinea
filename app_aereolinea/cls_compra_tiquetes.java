import java.time.LocalDate;

public class cls_compra_tiquetes {
    
    private LocalDate fechaStr;
    private String Idcliente;
    private int cantidadInt;
    private String tipo_claseStr;
    private String metodo_pagoStr;
    private float subtotalFlt;
    private float ivaFlt;
    private float descuentoFlt;
    private float totalFlt;
    private float precioFlt;
    private float desc_tipo_pagoFlt;
    
    public cls_compra_tiquetes( String Idcliente, int cantidadInt, String tipo_claseStr, String metodo_pagoStr, float desc_membresiaFlt ){
        this.fechaStr = LocalDate.now();
        this.Idcliente = Idcliente;
        this.cantidadInt = cantidadInt;
        this.tipo_claseStr = tipo_claseStr;

        if (tipo_claseStr.equals("1")){
            this.precioFlt= (float) (450000);
        }
        
        if (tipo_claseStr.equals("2")){
            this.precioFlt= (float) (600000);
        }
        
        if (tipo_claseStr.equals("3")){
            this.precioFlt= (float) (900000);
        }

      
        


        if (metodo_pagoStr.equals("1")){
            this.desc_tipo_pagoFlt= (float) (this.subtotalFlt * 0.05);
        }
        if (metodo_pagoStr.equals("2")){
            this.desc_tipo_pagoFlt= (float) (this. subtotalFlt * 0.07);
        }
        if (metodo_pagoStr.equals("3")){
            this.desc_tipo_pagoFlt= (float) (this.subtotalFlt * 0.02);
        }
        if (metodo_pagoStr.equals("4")){
            this.desc_tipo_pagoFlt= (float) (this.subtotalFlt * 0.10);
        }

        this.subtotalFlt = (this.precioFlt * cantidadInt);

        this.ivaFlt = (float) ((this.subtotalFlt * 0.19));

        this.descuentoFlt = ((this.subtotalFlt*desc_membresiaFlt) + this.desc_tipo_pagoFlt );

        this.totalFlt = ((this.subtotalFlt - this.descuentoFlt)+ this.ivaFlt);
    }

    public LocalDate getFechaStr() {
        return fechaStr;
    }

    public void setFechaStr(LocalDate fechaStr) {
        this.fechaStr = fechaStr;
    }

    public String getIdcliente() {
        return Idcliente;
    }

    public void setIdcliente(String idcliente) {
        Idcliente = idcliente;
    }

    public int getCantidadInt() {
        return cantidadInt;
    }

    public void setCantidadInt(int cantidadInt) {
        this.cantidadInt = cantidadInt;
    }

    public String getTipo_claseStr() {
        return tipo_claseStr;
    }

    public void setTipo_claseStr(String tipo_claseStr) {
        this.tipo_claseStr = tipo_claseStr;
    }

    public String getMetodo_pagoStr() {
        return metodo_pagoStr;
    }

    public void setMetodo_pagoStr(String metodo_pagoStr) {
        this.metodo_pagoStr = metodo_pagoStr;
    }

    public float getSubtotalFlt() {
        return subtotalFlt;
    }

    public void setSubtotalFlt(float subtotalFlt) {
        this.subtotalFlt = subtotalFlt;
    }

    public float getIvaFlt() {
        return ivaFlt;
    }

    public void setIvaFlt(float ivaFlt) {
        this.ivaFlt = ivaFlt;
    }

    public float getDescuentoFlt() {
        return descuentoFlt;
    }

    public void setDescuentoFlt(float descuentoFlt) {
        this.descuentoFlt = descuentoFlt;
    }

    public float getTotalFlt() {
        return totalFlt;
    }

    public void setTotalFlt(float totalFlt) {
        this.totalFlt = totalFlt;
    }

    public float getPrecioFlt() {
        return precioFlt;
    }

    public void setPrecioFlt(float precioFlt) {
        this.precioFlt = precioFlt;
    }

    public float getDesc_tipo_pagoFlt() {
        return desc_tipo_pagoFlt;
    }

    public void setDesc_tipo_pagoFlt(float desc_tipo_pagoFlt) {
        this.desc_tipo_pagoFlt = desc_tipo_pagoFlt;
    }

    

}
