package model;
// Maes Bart
public class Familie {
    private Integer familie_id;
    private String familie_naam;
    private Integer type_id;

    public Familie(Integer familie_id, String familie_naam, Integer type_id) {
        this.familie_id = familie_id;
        this.familie_naam = familie_naam;
        this.type_id = type_id;
    }

    public Integer getFamilie_id() {
        return familie_id;
    }

    public String getFamilie_naam() {
        return familie_naam;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setFamilie_id(Integer familie_id) {
        this.familie_id = familie_id;
    }

    public void setFamilie_naam(String familie_naam) {
        this.familie_naam = familie_naam;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    @Override
    public String toString() {
        return "Familie{" +
                "familie_id=" + familie_id +
                ", familie_naam=" + familie_naam +
                ", type_id=" + type_id +
                '}';
    }
}
