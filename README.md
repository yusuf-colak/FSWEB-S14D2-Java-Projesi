# Java s2g3 - Composition

### Proje Kurulumu

Projeyi önce forklayın daha sonra klonlayın ve Intellij kullanarak projeyi açın. 
Proje sayımız ilerledikçe proje yönetimimizi kolaylaştırmak adına projelerimizi belli klasör kalıplarında saklamak işimizi kolaylaştırmak adına iyi bir alışkanlıktır.
Örnek bir Lokasyon: Workintech/Sprint_1/Etud.

### Hedeflerimiz:
 
 Uygulamamız da toplam Main sınıfı hariç 5 sınıftan fazla sınıf oluşturmamalıyız.


### Lamp
* Lamp isimli bir sınıf yazınız.
* Lamp sınıfı için 3 tane ```instance variable``` tanımlamalıyız. ```style``` tipi String olmalı. ```battery``` tipi boolean olmalı. ```globRating``` tipi int olmalı. 
* Lamp sınıfının tüm değişkenleri `private` olmalı. Lamp sınıfı için 3 değişkeninde eklenebileceği tek bir ```constructor``` olmalı.
* Lamp sınıfı için toplamda 4 metod yazmamız gerekiyor. ```turnOn``` herhangi bir değer dönmeyecek. Sadece 'Lamp is being turned on.' mesajının ekrana basacak.
* ```getStyle()``` style değişkenin değerini dönmeli. ```isBattery()``` battery değişkeninin değerini dönmeli. ```getGlobalRating()``` globalRating değişkeninin değerini dönmeli.

### Bed
* Bed isminde bir sınıf yazınız.
* Bed sınıfı için 5 tane ```instance variable``` style tipi String olmalı. ```pillows, height, sheets, quilt``` tipleri int olmalı. Hepsi private olmalı.
* Bed sınıfı için bir constructor yazmalıyız.
* Bed sınıfı için 5 metod yazacağız. ```make``` herhangi bir return değeri olmayacak. Sadece 'The bed is being made.' mesajını ekrana basacak.
* ```getPillows()``` pillows sayısını return etmeli. ```getHeight()``` height değerini return etmeli. ```getSheets()``` sheets sayısını return etmeli. ```getPillow()``` pillows sayısını return etmeli.
 
### Ceiling
* Ceiling isminde bir sınıf yazınız. Ceiling sınıfının 2 tane ```instance variable``` olmalı. ```height``` ve ```paintedColor```. İkisinin de tipi int olmalı ve ikisi de private olmalı.
* Ceiling sınıfının bir ```constructor``` metodu olmalı. 2 değişkenine de değer atamalı.
* Ceiling sınıfının ```getHeight()``` adında bir metodu olmalı. height değerini dönmeli. ```getPaintedColor``` adında bir metodu olmalı ve paintedColor değerini dönmeli.

### Wall
* Wall isminde bir sınıf yazınız. İçerisinde bir tane değişkeni olmalı ```direction``` String değerinde olmalı ve private olarak tanımlanmalı.
* Wall sınıfının bir ```constructor``` metodu olmalı ve tek değişkenine değer atamalı.
* Wall sınıfının tek bir metodu olmalı. ```getDirection``` direction değişkeninin değerini dönmeli.

### Bedroom 
* Bedroom isimli bir sınıf oluşturunuz.
* Bu sınıfın 8 tane ```instance variable``` değeri olmalı. ```name``` String tipinde. ```wall1 wall2 wall3 wall4``` Wall tipinde. ```ceiling``` Ceiling tipinde.
  ```bed``` Bed tipinde. ```lamp``` Lamp tipinde.
* Sınıfımızın ```constructor``` metodu tek olmalı ve 8 değişkeni de almalı. 
* Sınıfımızda iki tane metod olmalı ```getLamp``` lamp değişkenini dönmeli. Diğer metodumuz ```makeBed``` ekrana 'Bed is being made' yazdırmalı ve Bed sınıfının ```meke()``` metodunu çağırmalı.


### Uygulamayı Test Etmek

Test etmek için aşağıdaki gibi bir kod yazdığımızda. Hiçbir hata almadan beklenildiği gibi her şey çalışmalı.

INPUT

Wall wall1 = new Wall("West");

Wall wall2 = new Wall("East");

Wall wall3 = new Wall("South");

Wall wall4 = new Wall("North");
 
Ceiling ceiling = new Ceiling(12, 55);
 
Bed bed = new Bed("Modern", 4, 3, 2, 1);
 
Lamp lamp = new Lamp("Classic", false, 75);
 
Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);

bedRoom.makeBed();
 
bedRoom.getLamp().turnOn()





