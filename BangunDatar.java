package week9;

public class BangunDatar
{
    private int panjang;
    private int lebar;
    private int diameter;
    protected int sisi;
    private static final double pi = 3.14;

    public BangunDatar(int sisi)
    {
        this.sisi = sisi;
    }

    public BangunDatar(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luas(int a)
    {
        return a*a;
    }

    public int luas(int a, int b)
    {
        return a*b;
    }

    public double luas(double a, double b)
    {
        return (a*b)/2;
    }

    public double luas(double a)
    {
        return (double)pi*a*a;
    }

    //Getter
    public int getSisi()
    {
        return sisi;
    }

    public int getPanjang()
    {
        return panjang;
    }

    public int getLebar()
    {
        return lebar;
    }

    // //Keliling
    // public int keliling(int a)
    // {
    //     return a+a+a+a;
    // }

    // public int keliling()
}