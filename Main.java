package NoromorfikEtkilesimRobotu;

public class Main {
    public static void main(String[] args) {
        NoromorfikMotor motor = new NoromorfikMotor();
        SesKontrolSistemi sesSistemi = new SesKontrolSistemi();
        EkranParlaklikSistemi parlaklikSistemi = new EkranParlaklikSistemi();

        motor.dinleyiciEkle(sesSistemi);
        motor.dinleyiciEkle(parlaklikSistemi);

        motor.kuralEkle("Yumruk_Sikma", sesSistemi);
        motor.kuralEkle("Yukari_Kaydir", parlaklikSistemi);

        ElHareketiOlayi olay1 = new ElHareketiOlayi("EVT-001", 3000, "Yukari_Kaydir");
        ElHareketiOlayi olay2 = new ElHareketiOlayi("EVT-002", 1000, "Yumruk_Sikma");
        ElPozisyonuOlayi olay3 = new ElPozisyonuOlayi("EVT-003", 2000, 150, 250);

        motor.olayKabulEt(olay1);
        motor.olayKabulEt(olay2);
        motor.olayKabulEt(olay3);

        motor.olaylariIsle();
    }
}
