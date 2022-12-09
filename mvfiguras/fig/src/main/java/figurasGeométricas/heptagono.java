package figurasGeométricas;

public class heptagono extends Figura{
    /* -heptágono
    Es una figura que cuenta con siete lados iguales y siete vértices.
    Perímetro: P=L*7
    Area: A=(P*ap)/2 */
    private double l, p, a, ap;

    public heptagono(){ }

    public heptagono(double l, double p, double a, double ap){
        this.l = l; 
        this.p = p; 
        this.a = a; 
        this.ap = ap;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getAp() {
        return ap;
    }

    public void setAp(double ap) {
        this.ap = ap;
    }

    public void calcularArea(){
        System.out.println("Para calcular el area de la figura tenemos un perímetro de "+ p + " y una apotema de "+ ap);
        a = (p*ap)/2;
        System.out.println("El valor de el area es: "+a);
    }

    public void calcularPerimetro(){
    System.out.println("Para calcular el perimetro de la figura tenemos "+ l);
    p = l * 7;
    System.out.println("El valor de el perímetro es: "+p);
    }
}
