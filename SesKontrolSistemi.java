package NoromorfikEtkilesimRobotu;

public class SesKontrolSistemi implements OlayDinleyicisi {
    @Override
    public void olayIsle(Olay olay) {
        System.out.println("Ses Sistemi Çalışıyor!");
        olay.detaylariYazdir();
    }
}
