package NoromorfikEtkilesimRobotu;

public class EkranParlaklikSistemi implements OlayDinleyicisi{
    @Override
    public void olayIsle(Olay olay) {
        System.out.println("Parlaklık Sistemi Çalışıyor! İşlenen Olay: ");
        olay.detaylariYazdir();
    }
}
