
public interface ITest {
   /* private int  a = 4 ; interface içersinde herhangi bir private alan tanımlayamassın diyor(java)
    eğer bu yapımızı private değilde public oalrak tanımlarsak sorun ortadan kalkar ve biz bir özellik eklemiş oluruz
   */ 
    public int a = 4 ;
    public int b = 5 ;
    /*
    Buradaki yapımızı static oalrak tanımlamadığımız halde a ifademizin değerine erişebildik
    bunun sebebi javanın bu alanın interface olduğunu direkt olarak tanımlıyor ve buradan obje oluşturulamadğını biliyor olması ...
    buradaki alanlara interface üzerinden erişim izni vermiş olması (yapının esnekliği söz konusu)
    private alanlara erişim için constructor gerektiği için sorun teşkil ederken 
    public alanların böyle sorunları ve istekleri olmaması buralarda tanımlama yapmayı kolaylaştırıyor.
    tanımlaları daha sonra yapmamız sıkıntı olduğu yani değeri sonradan değiştirmek yada değerini atamk için getter yada setter kullanıyor olmamız java tarafından interfaceler için kabul edilmiyor 
    tanımlandığı anda değerlendirilmesini istiyor bizden ...
    
    */
    public static String deneme = "hllbr is connected ";//yapıyı static kurmasak normal kursakta sıkıntı yok static kullanarak buranın ITest kendine özgü bir alan olduğunu belirtmiş oluyor sadece
//vuralarda static anahtar kelimesi büyük bir çoğunlukla anlamını yitiriyor işlevsizleşiyor diyeibiliriz.
    public final int c = 6 ;
    
    public static void gövdeliMetod(){
        System.out.println("static yani gövdeli metod interface içerisinde aktif pozisyona geçirildi.");
    }
}
