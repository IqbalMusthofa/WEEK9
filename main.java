package week9;

public class main
{
    public static void main(String[] args)
    {
        BangunDatar persegi = new BangunDatar(2);
        BangunDatar pp = new BangunDatar(2,3);
        BangunDatar segitiga = new BangunDatar(4, 2);
        BangunDatar lingkaran = new BangunDatar(6);

        //Bangun Ruang
        BangunRuang balok = new BangunRuang(5,4,2);
        BangunRuang kubus = new BangunRuang(5);

        //Hitung LUAS
        System.out.println("Hasil persegi = " +persegi.luas(2));
        System.out.println("Hasil persegi panjang = " +pp.luas(2,3));
        System.out.println("Hasil segitiga = " +segitiga.luas(4.0, 2.0));
        System.out.println("Hasil lingkaran = " +lingkaran.luas(6.0));

        //Hitung volume
        System.out.println("Hasil Balok = "+balok.volume(5,4,2));
        System.out.println("Hasil Kubus = "+kubus.volume(5));
    }
}