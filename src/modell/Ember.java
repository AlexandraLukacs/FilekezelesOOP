package modell;

public class Ember {
    private String nev;
    private String cim;

    public Ember(String nev, String cim) {
        this.nev = nev;
        this.cim = cim;
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }
    
}
