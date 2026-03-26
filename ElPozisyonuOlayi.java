package NoromorfikEtkilesimRobotu;

public class ElPozisyonuOlayi extends Olay{
    private int koordinatX;
    private int koordinatY;

    public ElPozisyonuOlayi(String id, long zamanDamgasi, int koordinatX, int koordinatY) {
        super(id, zamanDamgasi,"POZİSYON");
        this.koordinatX = koordinatX;
        this.koordinatY = koordinatY;
    }
    public int getKoordinatX() {
        return koordinatX;
    }
    public void setKoordinatX(int koordinatX) {
        this.koordinatX = koordinatX;
    }
    public int getKoordinatY() {
        return koordinatY;
    }
    public void setKoordinatY(int koordinatY) {
        this.koordinatY = koordinatY;
    }
    @Override
    public void detaylariYazdir() {
        System.out.println(getId() + ", " + getZamanDamgasi() + ", " + getKoordinatX() +  ", " + getKoordinatY());
    }
}
