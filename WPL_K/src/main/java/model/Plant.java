package main.java.model;

// Vancoillie Matthias (lijn 4 tot 120)
public class Plant {

    private Integer plant_id;
    private String type;
    private String familie;
    private String geslacht;
    private String soort;
    private String variatie;
    private Integer plantdichtheid_min;
    private Integer plantdichtheid_max;
    private String fgsv;

    public Plant(int plant_id, String type, String familie,
                 String geslacht, String soort, String variatie,
                 int plantdichtheid_min, int plantdichtheid_max, String fgsv) {

        this.plant_id = plant_id;
        this.type = type;
        this.familie = familie;
        this.geslacht = geslacht;
        this.soort = soort;
        this.variatie = variatie;
        this.plantdichtheid_min = plantdichtheid_min;
        this.plantdichtheid_max = plantdichtheid_max;
        this.fgsv = fgsv;


    }

    public void setPlant_id(int plant_id) {
        if (this.plant_id != null) {
            throw new UnsupportedOperationException("Id change not permitted");
        }
        this.plant_id = plant_id;
    }

    public int getPlant_id() {
        return plant_id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setFamilie(String familie) {
        this.familie = familie;
    }

    public String getFamilie() {
        return familie;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getSoort() {
        return soort;
    }

    public void setVariatie(String variatie) {
        this.variatie = variatie;
    }

    public String getVariatie() {
        return variatie;
    }

    public void setPlantdichtheid_min(Integer plantdichtheid_min) {
        this.plantdichtheid_min = plantdichtheid_min;
    }

    public Integer getPlantdichtheid_min() {
        return plantdichtheid_min;
    }

    public void setPlantdichtheid_max(Integer plantdichtheid_max) {
        this.plantdichtheid_max = plantdichtheid_max;
    }

    public Integer getPlantdichtheid_max(Integer plantdichtheid_max) {
        return plantdichtheid_max;
    }

    public void setFgsv(String fgsv) {
        this.fgsv = fgsv;
    }

    public String getFgsv() {
        return fgsv;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "plant_id= " + plant_id +
                ", type=" + type +
                ", familie= " + familie +
                ", geslacht= " + geslacht +
                ", soort= " + soort +
                ", variatie= " + variatie +
                ", plantdichtheid_min" + plantdichtheid_min +
                ", plantdichtheid_max" + plantdichtheid_max +
                ", fgsv= " + fgsv +
                '}';
    }
}

