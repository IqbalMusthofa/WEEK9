package week9;

public class BangunRuang extends BangunDatar
{
    private int tinggi;

    public BangunRuang(int panjang, int lebar, int tinggi)
    {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public BangunRuang(int sisi)
    {
        super(sisi);
        this.sisi = sisi;
    }

    public int getTinggi()
    {
        return tinggi;
    }

    public int volume(int sisi)
    {
        return super.getSisi()*super.getSisi()*super.getSisi();
    }

    public int volume(int panjang,int lebar,int tinggi)
    {
        return super.getPanjang()*super.getLebar()*getTinggi();
    }


}