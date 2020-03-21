package main.java.model;
// Maes Bart
public class Beheer {
    private Integer beheer_id;
    private Integer plant_id;
    private String beheerdaad;
    private String opmerking;
    private String maand;
    private Integer frequentie_jaar;

    public Beheer(Integer beheer_id, Integer plant_id, String beheerdaad,
                  String opmerking, String maand, Integer frequentie_jaar) {
        this.beheer_id = beheer_id;
        this.plant_id = plant_id;
        this.beheerdaad = beheerdaad;
        this.opmerking = opmerking;
        this.maand = maand;
        this.frequentie_jaar = frequentie_jaar;
    }

    public Integer getBeheer_id() {
        return beheer_id;
    }

    public Integer getPlant_id() {
        return plant_id;
    }

    public String getBeheerdaad() {
        return beheerdaad;
    }

    public String getOpmerking() {
        return opmerking;
    }

    public String getMaand() {
        return maand;
    }

    public Integer getFrequentie_jaar() {
        return frequentie_jaar;
    }

    public void setBeheer_id(Integer beheer_id) {
        this.beheer_id = beheer_id;
    }

    public void setPlant_id(Integer plant_id) {
        this.plant_id = plant_id;
    }

    public void setBeheerdaad(String beheerdaad) {
        this.beheerdaad = beheerdaad;
    }

    public void setOpmerking(String opmerking) {
        this.opmerking = opmerking;
    }

    public void setMaand(String maand) {
        this.maand = maand;
    }

    public void setFrequentie_jaar(Integer frequentie_jaar) {
        this.frequentie_jaar = frequentie_jaar;
    }

    @Override
    public String toString() {
        return "Beheer{" +
                "beheer_id=" + beheer_id +
                ", plant_id=" + plant_id +
                ", beheerdaad='" + beheerdaad + '\'' +
                ", opmerking='" + opmerking + '\'' +
                ", maand='" + maand + '\'' +
                ", frequentie_jaar=" + frequentie_jaar +
                '}';
    }
}
