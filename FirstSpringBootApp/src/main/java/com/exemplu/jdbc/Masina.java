package com.exemplu.jdbc;

public class Masina {
    private int id;
    private String nrInmatriculare;
    private String marca;
    private int anul;
    private String culoare;
    private int Nrkm;
    
    
    
    public Masina() {}
    
    public Masina(int id, String nrInmatriculare, String marca, int anul,String culoare,int Nrkm  ) {
        super();
        this.id = id;
        this.nrInmatriculare = nrInmatriculare;
        this.marca = marca;
        this.anul=anul;
        this.culoare=culoare;
        this.Nrkm=Nrkm;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnul() {
        return anul;
    }

    public void setAnul(int anul) {
        this.anul = anul;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNrkm() {
        return Nrkm;
    }

    public void setNrkm(int Nrkm) {
        this.Nrkm = Nrkm;
    }
    
    @Override
   
    public String toString() {
        return "Masina [id=" + id + ", nrInmatriculare=" + nrInmatriculare + ", marca=" + marca + ", anul=" + anul + ", culoare=" + culoare + ", Nrkm=" + Nrkm + "]";
    }
}