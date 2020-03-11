package main.java.model;
// Maes Bart
public class Soort {
    private Integer soort_id;
    private String soort_naam;
    private Integer geslacht_id;

    public Soort(Integer soort_id, String soort_naam, Integer geslacht_id) {
        this.soort_id = soort_id;
        this.soort_naam = soort_naam;
        this.geslacht_id = geslacht_id;
    }

    public Integer getSoort_id() {
        return soort_id;
    }

    public String getSoort_naam() {
        return soort_naam;
    }

    public Integer getGeslacht_id() {
        return geslacht_id;
    }

    public void setSoort_id(Integer soort_id) {
        this.soort_id = soort_id;
    }

    public void setSoort_naam(String soort_naam) {
        this.soort_naam = soort_naam;
    }

    public void setGeslacht_id(Integer geslacht_id) {
        this.geslacht_id = geslacht_id;
    }

    @Override
    public String toString() {
        return "Soort{" +
                "soort_id=" + soort_id +
                ", soort_naam='" + soort_naam + '\'' +
                ", geslacht_id=" + geslacht_id +
                '}';
    }
}
