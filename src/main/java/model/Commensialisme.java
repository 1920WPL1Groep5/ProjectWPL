package model;
// Maes Bart
public class Commensialisme {
    private Integer commensialisme_id;
    private Integer plant_id;
    private String strategie;
    private String ontwikkelingssnelheid;

    public Commensialisme(Integer commensialisme_id, Integer plant_id, String strategie, String ontwikkelingssnelheid) {
        this.commensialisme_id = commensialisme_id;
        this.plant_id = plant_id;
        this.strategie = strategie;
        this.ontwikkelingssnelheid = ontwikkelingssnelheid;
    }

    public Integer getCommensialisme_id() {
        return commensialisme_id;
    }

    public Integer getPlant_id() {
        return plant_id;
    }

    public String getStrategie() {
        return strategie;
    }

    public String getOntwikkelingssnelheid() {
        return ontwikkelingssnelheid;
    }

    public void setCommensialisme_id(Integer commensialisme_id) {
        this.commensialisme_id = commensialisme_id;
    }

    public void setPlant_id(Integer plant_id) {
        this.plant_id = plant_id;
    }

    public void setStrategie(String strategie) {
        this.strategie = strategie;
    }

    public void setOntwikkelingssnelheid(String ontwikkelingssnelheid) {
        this.ontwikkelingssnelheid = ontwikkelingssnelheid;
    }

    @Override
    public String toString() {
        return "Commensialisme{" +
                "commensialisme_id=" + commensialisme_id +
                ", plant_id=" + plant_id +
                ", strategie='" + strategie + '\'' +
                ", ontwikkelingssnelheid='" + ontwikkelingssnelheid + '\'' +
                '}';
    }
}
