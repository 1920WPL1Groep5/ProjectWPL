package main.java.model;
// Maes Bart
public class Abiotisch_multi {
    private Integer abiotisch_id;
    private Integer plant_id;
    private String eigenschap;
    private Integer waarde;

    public Abiotisch_multi(Integer abiotisch_id, Integer plant_id, String eigenschap, Integer waarde) {
        this.abiotisch_id = abiotisch_id;
        this.plant_id = plant_id;
        this.eigenschap = eigenschap;
        this.waarde = waarde;
    }

    public Integer getAbiotisch_id() {
        return abiotisch_id;
    }

    public Integer getPlant_id() {
        return plant_id;
    }

    public String getEigenschap() {
        return eigenschap;
    }

    public Integer getWaarde() {
        return waarde;
    }

    public void setAbiotisch_id(Integer abiotisch_id) {
        this.abiotisch_id = abiotisch_id;
    }

    public void setPlant_id(Integer plant_id) {
        this.plant_id = plant_id;
    }

    public void setEigenschap(String eigenschap) {
        this.eigenschap = eigenschap;
    }

    public void setWaarde(Integer waarde) {
        this.waarde = waarde;
    }

    @Override
    public String toString() {
        return "Abiotisch_multi{" +
                "abiotisch_id=" + abiotisch_id +
                ", plant_id=" + plant_id +
                ", eigenschap='" + eigenschap + '\'' +
                ", waarde=" + waarde +
                '}';
    }
}
