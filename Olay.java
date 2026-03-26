package NoromorfikEtkilesimRobotu;

public abstract class Olay implements Comparable<Olay>{
    private String id;
    private long zamanDamgasi;
    private String olayTipi;

    public Olay(String id, long zamanDamgasi, String olayTipi) {
        this.id = id;
        this.zamanDamgasi = zamanDamgasi;
        this.olayTipi = olayTipi;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public long getZamanDamgasi() {
        return zamanDamgasi;
    }
    public void setZamanDamgasi(long zamanDamgasi) {
        this.zamanDamgasi = zamanDamgasi;
    }
    public String getOlayTipi() {
        return olayTipi;
    }
    public void setOlayTipi(String olayTipi) {
        this.olayTipi = olayTipi;
    }

    public abstract void detaylariYazdir();

    public int compareTo(Olay digerOlay) {
        return Long.compare(this.zamanDamgasi, digerOlay.getZamanDamgasi());
    }
}

