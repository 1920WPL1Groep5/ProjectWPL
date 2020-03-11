package model;

public class Commensialisme_multi {
    private Integer commensialisme_id;
    private Integer plant_id;
    private String eigenschap;
    private String waarde;

    public Commensialisme_multi(Integer commensialisme_id, Integer plant_id, String eigenschap, String waarde) {
        this.commensialisme_id = commensialisme_id;
        this.plant_id = plant_id;
        this.eigenschap = eigenschap;
        this.waarde = waarde;
    }

    public Integer getCommensialisme_id() {
        return commensialisme_id;
    }

    public Integer getPlant_id() {
        return plant_id;
    }

    public String getEigenschap() {
        return eigenschap;
    }

    public String getWaarde() {
        return waarde;
    }

    public void setCommensialisme_id(Integer commensialisme_id) {
        this.commensialisme_id = commensialisme_id;
    }

    public void setPlant_id(Integer plant_id) {
        this.plant_id = plant_id;
    }

    public void setEigenschap(String eigenschap) {
        this.eigenschap = eigenschap;
    }

    public void setWaarde(String waarde) {
        this.waarde = waarde;
    }

    @Override
    public String toString() {
        return "Commensialisme_multi{" +
                "commensialisme_id=" + commensialisme_id +
                ", plant_id=" + plant_id +
                ", eigenschap='" + eigenschap + '\'' +
                ", waarde='" + waarde + '\'' +
                '}';
    }
}
