package NoromorfikEtkilesimRobotu;

public class ElHareketiOlayi extends Olay {
    private String hareketIsmi;

    public ElHareketiOlayi(String id, long zamanDamgasi, String hareketIsmi ) {
        super(id, zamanDamgasi,"HAREKET");
        this.hareketIsmi = hareketIsmi;
    }
    public String getHareketIsmi() {
        return hareketIsmi;
    }
    public void setHareketIsmi(String hareketIsmi) {
        this.hareketIsmi = hareketIsmi;
    }
    @Override
    public void detaylariYazdir() {
        System.out.println(getId() + ", " + getZamanDamgasi() + ", " + getHareketIsmi());
    }
}
