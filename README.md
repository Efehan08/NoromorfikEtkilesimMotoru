# Nöromorfik Etkileşim Motoru

Bu proje, sensörlerden gelen asenkron hareket ve pozisyon verilerini işlemek üzere tasarlanmış, olay güdümlü (event-driven) bir sistem mimarisidir. Geleneksel sürekli kontrol (polling) yöntemleri yerine, sadece sisteme veri ulaştığında çalışan ve işlem bitiminde beklemeye geçen enerji verimli bir altyapı hedeflenmiştir.

## Projenin Amacı ve Kullanılan Teknolojiler

Proje, harici kütüphaneler kullanılmadan Core Java ile geliştirilmiştir. Temel amaç, olay tabanlı veri akışlarını yönetmek için Nesne Yönelimli Programlama (OOP) kavramlarını ve veri yapılarını entegre etmektir.

* **OOP Prensipleri:** Abstraction, Inheritance, Polymorphism ve Encapsulation kullanılarak esnek ve genişletilebilir bir modül yapısı kurulmuştur.
* **Java Collections Framework:**
  * `ArrayList`: Gelen olayları işlem kuyruğunda sıralı tutmak için.
  * `HashSet`: Sisteme eklenen kontrol modüllerinin benzersizliğini sağlamak için.
  * `HashMap`: Spesifik el hareketlerini, tetiklenmesi gereken ilgili hedef modüllerle eşleştirmek için.
* **Bellek Yönetimi:** Kuyruktaki olayların döngü sırasında işlendikten sonra listeden güvenli bir şekilde silinmesi için `Iterator` kullanılmıştır.
* **Zaman Çizelgesi Kontrolü:** `Comparable` arayüzü ve `Collections.sort()` kullanılarak senkronizasyonu olmayan asenkron olayların zaman damgasına (timestamp) göre kronolojik olarak işlenmesi sağlanmıştır.

## Sistem Mimarisi

Sistem üç ana bileşenden oluşmaktadır:

1. **Olay Sınıfları:** `Olay` soyut sınıfından türetilen `ElHareketiOlayi` ve `ElPozisyonuOlayi` gibi yapılandırılmış veri paketleri.
2. **Merkezi Motor (`NoromorfikMotor`):** Olayları kabul eden, kuyruğa alan, zaman damgalarına göre sıralayan ve HashMap referansları üzerinden doğru hedefe yönlendiren ana kontrolcü sınıf.
3. **Dinleyici Modüller:** `OlayDinleyicisi` arayüzünü uygulayan ve merkezi motordan gelen olaylara göre kendi iç süreçlerini yürüten bağımsız alt sistemler (örn. `SesKontrolSistemi`, `EkranParlaklikSistemi`).
