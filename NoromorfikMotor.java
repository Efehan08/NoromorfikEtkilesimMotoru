package NoromorfikEtkilesimRobotu;

import java.util.*;

public class NoromorfikMotor {
    List<Olay> olayKuyrugu;
    Set<OlayDinleyicisi> kayitliDinleyiciler;
    Map<String, OlayDinleyicisi> hareketRehberi;

    public NoromorfikMotor() {
        olayKuyrugu = new ArrayList<>();
        kayitliDinleyiciler = new HashSet<>();
        hareketRehberi = new HashMap<>();
    }
    public void dinleyiciEkle(OlayDinleyicisi dinleyici) {
        kayitliDinleyiciler.add(dinleyici);
        System.out.println("Yeni Sistem Motora Bağlandı.");
    }
    public void kuralEkle(String hareket, OlayDinleyicisi dinleyici) {
        hareketRehberi.put(hareket, dinleyici);
    }
    public void olayKabulEt(Olay yeniOlay) {
        olayKuyrugu.add(yeniOlay);
    }
    public void olaylariIsle() {
        System.out.println("Olaylar İşleniyor...");
        if (olayKuyrugu.isEmpty()) {
            System.out.println("İşlenecek Olay Bulunamadı!");
            return;
        } else {
            Collections.sort(olayKuyrugu);
            Iterator<Olay> itr = olayKuyrugu.iterator();
            while (itr.hasNext()) {
                Olay siradakiOlay = itr.next();
                siradakiOlay.detaylariYazdir();

                if (siradakiOlay instanceof ElHareketiOlayi) {
                    ElHareketiOlayi hareket =  (ElHareketiOlayi) siradakiOlay;
                    OlayDinleyicisi ilgiliSistem = hareketRehberi.get(hareket.getHareketIsmi());

                    if (ilgiliSistem != null) {
                        ilgiliSistem.olayIsle(siradakiOlay);
                        itr.remove();
                    }
                }
            }
        }
    }
}
