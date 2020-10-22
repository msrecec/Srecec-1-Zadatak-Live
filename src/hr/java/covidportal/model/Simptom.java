package hr.java.covidportal.model;

import java.util.Objects;

public class Simptom {
    public static final String RIJETKO = "RIJETKO", SREDNJE = "SREDNJE", CESTO = "ČESTO";
    private String naziv, vrijednost, sifra;

    public Simptom(String naziv, String vrijednost, String sifra) {
        this.naziv = naziv;
        this.vrijednost = vrijednost;
        this.sifra = sifra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Simptom)) return false;
        Simptom simptom = (Simptom) o;
        return getNaziv().equals(simptom.getNaziv()) &&
                getVrijednost().equals(simptom.getVrijednost());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNaziv(), getVrijednost());
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getVrijednost() {
        return vrijednost;
    }

    public void setVrijednost(String vrijednost) {
        this.vrijednost = vrijednost;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }
}
