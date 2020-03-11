package model;
// Maes Bart
public class Geslacht {
    private Integer geslacht_id;
    private String geslacht_naam;
    private Integer familie_id;

    public Geslacht(Integer geslacht_id, String geslacht_naam, Integer familie_id) {
        this.geslacht_id = geslacht_id;
        this.geslacht_naam = geslacht_naam;
        this.familie_id = familie_id;
    }

    public Integer getGeslacht_id() {
        return geslacht_id;
    }

    public String getGeslacht_naam() {
        return geslacht_naam;
    }

    public Integer getFamilie_id() {
        return familie_id;
    }

    public void setGeslacht_id(Integer geslacht_id) {
        this.geslacht_id = geslacht_id;
    }

    public void setGeslacht_naam(String geslacht_naam) {
        this.geslacht_naam = geslacht_naam;
    }

    public void setFamilie_id(Integer familie_id) {
        this.familie_id = familie_id;
    }

    @Override
    public String toString() {
        return "Geslacht{" +
                "geslacht_id=" + geslacht_id +
                ", geslacht_naam='" + geslacht_naam + '\'' +
                ", familie_id=" + familie_id +
                '}';
    }
}
