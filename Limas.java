public class Limas implements BangunRuang {
    
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public Limas() {
        setPanjang(1);
        setLebar(1);
        setTinggi(1);
    }
    public Limas(double panjang, double lebar, double tinggi) {
        setPanjang(panjang);
        setLebar(lebar);
        setTinggi(tinggi);
    }
    
    @Override
    public void setPanjang(double panjang) {
        this.panjang = panjang < 0 ? 1 : panjang;
    }
    @Override
    public void setLebar(double lebar) {
        this.lebar = lebar < 0 ? 1 : lebar;
    }
    @Override
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi < 0 ? 1 : tinggi;
    }

    @Override
    public double getVolume() {
        return panjang * lebar * tinggi;
    }
    
}