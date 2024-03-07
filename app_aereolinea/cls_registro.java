public class cls_registro {

    private String idStr;
    private String nombreStr;
    private String contactoStr;
    private String correoStr;
    private String sexoStr;
    private int membresiaInt;
    private float desc_membresiaFlt = 0;
    
    public cls_registro(String idStr, String nombreStr, String contactoStr, String correoStr, String sexoStr, 
    int membresiaInt) {

        this.idStr = idStr;
        this.nombreStr = nombreStr;
        this.contactoStr = contactoStr;
        this.correoStr = correoStr;
        this.sexoStr = sexoStr;
        this.membresiaInt = membresiaInt;
        if (membresiaInt == 1){
            this.desc_membresiaFlt= (float) (0.10);
        }
        if (membresiaInt == 2){
            this.desc_membresiaFlt= (float) (0.15);
        }
        if (membresiaInt == 3){
            this.desc_membresiaFlt= (float) (0.25);
        }
        if (membresiaInt == 4){
            this.desc_membresiaFlt= (float) (0.35);
        }
    }

    public String getIdStr() {
        return idStr;
    }

    
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }

    public String getCorreoStr() {
        return correoStr;
    }

    public void setCorreoStr(String correoStr) {
        this.correoStr = correoStr;
    }

    public String getSexoStr() {
        return sexoStr;
    }

    public void setSexoStr(String sexoStr) {
        this.sexoStr = sexoStr;
    }

    public int getMembresiaInt() {
        return membresiaInt;
    }

    public void setMembresiaInt(int membresiaInt) {
        this.membresiaInt = membresiaInt;
    }

    public float getDesc_membresiaFlt() {
        return desc_membresiaFlt;
    }

    public void setDesc_membresiaFlt(float desc_membresiaFlt) {
        this.desc_membresiaFlt = desc_membresiaFlt;
    }

    
}