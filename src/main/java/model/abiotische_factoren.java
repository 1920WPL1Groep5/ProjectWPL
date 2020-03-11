package model;
// Maes Bart
public class abiotische_factoren {
    private Integer abiotische_id;
    private Integer plant_id;
    private String bezonning;
    private String grondsoort;
    private String vochtbehoefte;
    private String voedingsbehoefte;
    private String reactie_antagonistische_omg;

    public abiotische_factoren(Integer abiotische_id, Integer plant_id, String bezonning,
                               String grondsoort, String vochtbehoefte, String voedingsbehoefte,
                               String reactie_antagonistische_omg) {
        this.abiotische_id = abiotische_id;
        this.plant_id = plant_id;
        this.bezonning = bezonning;
        this.grondsoort = grondsoort;
        this.vochtbehoefte = vochtbehoefte;
        this.voedingsbehoefte = voedingsbehoefte;
        this.reactie_antagonistische_omg = reactie_antagonistische_omg;
    }

    public Integer getAbiotische_id() {
        return abiotische_id;
    }

    public Integer getPlant_id() {
        return plant_id;
    }

    public String getBezonning() {
        return bezonning;
    }

    public String getGrondsoort() {
        return grondsoort;
    }

    public String getVochtbehoefte() {
        return vochtbehoefte;
    }

    public String getVoedingsbehoefte() {
        return voedingsbehoefte;
    }

    public String getReactie_antagonistische_omg() {
        return reactie_antagonistische_omg;
    }

    public void setAbiotische_id(Integer abiotische_id) {
        this.abiotische_id = abiotische_id;
    }

    public void setPlant_id(Integer plant_id) {
        this.plant_id = plant_id;
    }

    public void setBezonning(String bezonning) {
        this.bezonning = bezonning;
    }

    public void setGrondsoort(String grondsoort) {
        this.grondsoort = grondsoort;
    }

    public void setVochtbehoefte(String vochtbehoefte) {
        this.vochtbehoefte = vochtbehoefte;
    }

    public void setVoedingsbehoefte(String voedingsbehoefte) {
        this.voedingsbehoefte = voedingsbehoefte;
    }

    public void setReactie_antagonistische_omg(String reactie_antagonistische_omg) {
        this.reactie_antagonistische_omg = reactie_antagonistische_omg;
    }

    @Override
    public String toString() {
        return "abiotische_factoren{" +
                "abiotische_id=" + abiotische_id +
                ", plant_id=" + plant_id +
                ", bezonning='" + bezonning + '\'' +
                ", grondsoort='" + grondsoort + '\'' +
                ", vochtbehoefte='" + vochtbehoefte + '\'' +
                ", voedingsbehoefte='" + voedingsbehoefte + '\'' +
                ", reactie_antagonistische_omg='" + reactie_antagonistische_omg + '\'' +
                '}';
    }
}
