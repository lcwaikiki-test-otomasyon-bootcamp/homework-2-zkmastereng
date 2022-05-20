@Cart
Feature: Cart Page

  @UrunEkleme
  Scenario: Sepete Urun Ekleme
    Given Uygulama acilir
    When Arama cubuguna "Ayakkabi" yazilir
    When Ara butonuna tiklanir
    Then Search Page in geldigi kontrol edilir
    When 3. siradaki ayakkabbiya tiklanir
    Then Product Pagein acildigi kontrol edilir
    When Ayakkabi bedeni olarak 38 secilir
    When Sepete ekleye tiklanir
    When Sepete gidilir
    Then Urunun sepete eklendigi kontrol edilir

  @UrunCikarma
  Scenario: Sepetten urun cikarma
    Given Uygulama acilir
    When Arama cubuguna "Ayakkabi" yazilir
    When Ara butonuna tiklanir
    Then Search Page in geldigi kontrol edilir
    When 3. siradaki ayakkabbiya tiklanir
    Then Product Pagein acildigi kontrol edilir
    When Ayakkabi bedeni olarak 38 secilir
    When Sepete ekleye tiklanir
    When Sepete gidilir
    Then Urunun sepete eklendigi kontrol edilir

  @UrunGuncelleme
  Scenario: Sepetteki urunu guncelleme
    Given Uygulama acilir
    When Arama cubuguna "Ayakkabi" yazilir
    When Ara butonuna tiklanir
    Then Search Page in geldigi kontrol edilir
    When 3. siradaki ayakkabbiya tiklanir
    Then Product Pagein acildigi kontrol edilir
    When Ayakkabi bedeni olarak 38 secilir
    When Sepete ekleye tiklanir
    When Sepete gidilir
    Then Urunun sepete eklendigi kontrol edilir
