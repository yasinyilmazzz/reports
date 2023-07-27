@testGoogle
Feature: google test

  Scenario: Ürün bilgisayar
    Given Ana sayfaya gidilir
    And Arama çubuğunda "HP Elitebook" yazılır
    And Arama tuşuna basılır
    Then Sayfa başlığının "HP Elitebook" olduğu görülür.

  Scenario: Ürün telefon
    Given Ana sayfaya gidilir
    And Arama çubuğunda "iPhone" yazılır
    And Arama tuşuna basılır
    Then Sayfa başlığının "iPhone" olduğu görülür.

  Scenario: Ürün negatif
    Given Ana sayfaya gidilir
    And Arama çubuğunda "iPhone" yazılır
    And Arama tuşuna basılır
    Then Sayfa başlığının "negatif" olduğu görülür.