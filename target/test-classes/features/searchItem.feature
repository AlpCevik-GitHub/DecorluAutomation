Feature:Contacts page

  Background:
    Given user is logged in and on the dashboard page
    Then Ana sayfanın açıldığı kontrol edilir.



  Scenario: User should be able to enter some products names and adjust shopping card
      When Arama kutucuğuna “şort” kelimesi girilir.
      And  Arama kutucuğuna girilen “şort” kelimesi silinir.
      And Arama kutucuğuna “gömlek” kelimesi girilir.
      And Klavye üzerinden “enter” tuşuna bastırılır
      And Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
      And Seçilen ürünün ürün bilgisi ve tutar bilgisi txt dosyasına yazılır.
       And Seçilen ürün sepete eklenir.
       And Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
       Then Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.
       Then Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.

