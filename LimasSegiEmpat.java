public abstract class LimasSegiEmpat extends LimasSegitiga implements BangunRuang 
{
    
    protected double panjang;
    protected double lebar;
    protected double tinggi;

    Override
    public abstract void setPanjang(double panjang);
    public double getPanjang() {
        return panjang;
    }
    
    @Override
    public abstract void setLebar(double lebar);
    public double getLebar() {
        return lebar;
    }
    @Override
    public abstract void setTinggi(double tinggi);
    public double getTinggi(){
        return tinggi;
    }
    
    
}