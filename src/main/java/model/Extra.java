package main.java.model;
// Maes Bart
public class Extra {
    private Integer extra_id;
    private Integer plant_id;
    private Integer nectarwaarde;
    private Integer pollenwaarde;
    private String bijvriendelijk;
    private String vlindervriendelijk;
    private String eetbaar_kruidgebruik;
    private String geurend;
    private String vorstgevoelig;

    public Extra(Integer extra_id, Integer plant_id, Integer nectarwaarde,
                 Integer pollenwaarde, String bijvriendelijk, String vlindervriendelijk,
                 String eetbaar_kruidgebruik, String geurend, String vorstgevoelig) {
        this.extra_id = extra_id;
        this.plant_id = plant_id;
        this.nectarwaarde = nectarwaarde;
        this.pollenwaarde = pollenwaarde;
        this.bijvriendelijk = bijvriendelijk;
        this.vlindervriendelijk = vlindervriendelijk;
        this.eetbaar_kruidgebruik = eetbaar_kruidgebruik;
        this.geurend = geurend;
        this.vorstgevoelig = vorstgevoelig;
    }

    public Integer getExtra_id() {
        return extra_id;
    }

    public Integer getPlant_id() {
        return plant_id;
    }

    public Integer getNectarwaarde() {
        return nectarwaarde;
    }

    public Integer getPollenwaarde() {
        return pollenwaarde;
    }

    public String getBijvriendelijk() {
        return bijvriendelijk;
    }

    public String getVlindervriendelijk() {
        return vlindervriendelijk;
    }

    public String getEetbaar_kruidgebruik() {
        return eetbaar_kruidgebruik;
    }

    public String getGeurend() {
        return geurend;
    }

    public String getVorstgevoelig() {
        return vorstgevoelig;
    }

    public void setExtra_id(Integer extra_id) {
        this.extra_id = extra_id;
    }

    public void setPlant_id(Integer plant_id) {
        this.plant_id = plant_id;
    }

    public void setNectarwaarde(Integer nectarwaarde) {
        this.nectarwaarde = nectarwaarde;
    }

    public void setPollenwaarde(Integer pollenwaarde) {
        this.pollenwaarde = pollenwaarde;
    }

    public void setBijvriendelijk(String bijvriendelijk) {
        this.bijvriendelijk = bijvriendelijk;
    }

    public void setVlindervriendelijk(String vlindervriendelijk) {
        this.vlindervriendelijk = vlindervriendelijk;
    }

    public void setEetbaar_kruidgebruik(String eetbaar_kruidgebruik) {
        this.eetbaar_kruidgebruik = eetbaar_kruidgebruik;
    }

    public void setGeurend(String geurend) {
        this.geurend = geurend;
    }

    public void setVorstgevoelig(String vorstgevoelig) {
        this.vorstgevoelig = vorstgevoelig;
    }

    @Override
    public String toString() {
        return "Extra{" +
                "extra_id=" + extra_id +
                ", plant_id=" + plant_id +
                ", nectarwaarde=" + nectarwaarde +
                ", pollenwaarde=" + pollenwaarde +
                ", bijvriendelijk='" + bijvriendelijk + '\'' +
                ", vlindervriendelijk='" + vlindervriendelijk + '\'' +
                ", eetbaar_kruidgebruik='" + eetbaar_kruidgebruik + '\'' +
                ", geurend='" + geurend + '\'' +
                ", vorstgevoelig='" + vorstgevoelig + '\'' +
                '}';
    }
}
