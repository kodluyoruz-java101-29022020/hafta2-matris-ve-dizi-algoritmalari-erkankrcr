
# Ödev Sorusu

**Açıklama1:** Soruların her biri ayrı ayrı algoritmaları ifade eder. Algoritma dediğimiz kavram bilgisayar programcılığı için çok önemli bir konudur.
Algoritma düşünce sistematiğini geliştirmeyen bir yazılımcı yazılım kütüphanelerini, programlama dillerini öğrenerek iyi bir programcı olma yolunda çok ileriye gidemez.

**Açıklama2:** Bu önemine istinaden ekstra algoritma ödevleriyle bu sizlerin bu yönünü geliştirmek hedefindeyiz.

**Açıklama3:** Verilen soruları Java dilinde kodlamanızı rica ediyorum. Ayrıca, hazır çözümler kullanmadan herkesin bireysel kodlamalasını rica ediyorum.
Yardımlaşma için birbirinizden ve benden yardım alabilirsiniz. Tek şart copy-paste kodlar lütfen olmasın :) Sizin gelişiminiz için bu çok önemlidir.

**Açıklama4:** Ödev sorularını yaparken takıldığınız yerlerde Google'da aramalar yaparak yardım alabilirsiniz. Unutmayın Google en büyük yardımcınız :)

#Sorular

**Soru1:** 

M x N boyutunda her elemanı 1 veya 0 değerlerinden oluşan bir matris tanımlayınız. 
Matrisin her elemanı bir hücredir. 
1 değerine sahip hücre canlı olarak kabul edilir.
0 değerine sahip hücre ölü olarak kabul edilir.

Örnek: 1 ve 0'lardan oluşan 5 x 5' lik matris 

<img width="84" alt="Screen Shot 2020-03-16 at 00 08 33" src="https://user-images.githubusercontent.com/2838457/76711010-1313d200-671d-11ea-80f0-5842d3036e42.png">

Her hücre üstündeki, altındaki, sağındaki ve solundaki komşu ile etkileşim halindedir.
Bu etkileşim aşağıdaki kurallar ile tarif edilmiştir.

- 1- Canlı hücre etrafında 2'den az canlı hücre varsa ölür. (1'den 0'a dönüşür)
- 2- Canlı hücre etrafında 2 veya 3 canlı hücre varsa yaşamaya devam eder. (1 değeri almaya devam eder)
- 3- Canlı hücre etrafında 3'ten fazla canlı hücre varsa ölür. (1'den 0'a dönüşür)
- 4- Ölü bir hücre etrafında 3 tane canlı hücre varsa canlı hale gelir. (0'dan 1'e dönüşür)


Yukarıdaki bilgiler ışığında verilen matrisin bir sonraki durumda hangi değerlerden oluşacağını hesaplayan bir fonksiyon yazınız.

Örnek:

Input: 

<img width="55" alt="Screen Shot 2020-03-16 at 00 08 40" src="https://user-images.githubusercontent.com/2838457/76711011-1444ff00-671d-11ea-8006-26a294e73c21.png">

Output: 

<img width="56" alt="Screen Shot 2020-03-16 at 00 08 47" src="https://user-images.githubusercontent.com/2838457/76711012-14dd9580-671d-11ea-94c8-da35c0493e64.png">


**Soru2:**

Girdi:

<img width="130" alt="Screen Shot 2020-03-16 at 00 23 10" src="https://user-images.githubusercontent.com/2838457/76711013-14dd9580-671d-11ea-9157-93452af607cc.png">

Çıktı:

<img width="485" alt="Screen Shot 2020-03-16 at 00 23 18" src="https://user-images.githubusercontent.com/2838457/76711014-160ec280-671d-11ea-8493-4f574e8d955b.png">

Yukarıdaki matrisi Spiral bir biçimde ekrana yazdıran algoritmayı yazınız. Matrisi sabit şekilde oluşturabilirsiniz. Örnek girdi ve çıktı yukarıda yer almaktadır.


**Soru3:**

N x M ile M x T boyutlarında 0-10 arası rastgele sayılardan oluşan iki matris tanımlayınız. Bu iki matrisin çarpımını yapan fonksiyonu yazın. Çarpım sonucu oluşan matrisi ekrana yazdırın.


**Soru4:**

N boyutunda 0-10 arası rastgele sayılardan oluşan bir dizi tanımlayınız. Bu dizi içinde mükerrer olan elemanları ekrana yazdıran algoritmayı tasarlayınız.

Örnek: { 2, 4, 5, 11, 33, 2, 5, 55, 100, 1 }

Örnek çıktı:
2
5

**Bu bir sınav değildir! Yeni sloganımız ==> Geliştirmek için kodluyoruz ... :))**
