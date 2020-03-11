package model;
// Maes Bart
import java.awt.*;

public class Foto {
    private Integer foto_id;
    private Integer plant_id;
    private String eigenschap;
    private String url;
    private Image figuur;

    public Foto(Integer foto_id, Integer plant_id, String eigenschap, String url, Image figuur) {
        this.foto_id = foto_id;
        this.plant_id = plant_id;
        this.eigenschap = eigenschap;
        this.url = url;
        this.figuur = figuur;
    }

    public Integer getFoto_id() {
        return foto_id;
    }

    public Integer getPlant_id() {
        return plant_id;
    }

    public String getEigenschap() {
        return eigenschap;
    }

    public String getUrl() {
        return url;
    }

    public Image getFiguur() {
        return figuur;
    }

    public void setFoto_id(Integer foto_id) {
        this.foto_id = foto_id;
    }

    public void setPlant_id(Integer plant_id) {
        this.plant_id = plant_id;
    }

    public void setEigenschap(String eigenschap) {
        this.eigenschap = eigenschap;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setFiguur(Image figuur) {
        this.figuur = figuur;
    }

    @Override
    public String toString() {
        return "Foto{" +
                "foto_id=" + foto_id +
                ", plant_id=" + plant_id +
                ", eigenschap='" + eigenschap + '\'' +
                ", url='" + url + '\'' +
                ", figuur=" + figuur +
                '}';
    }
}
