package figurasGeométricas;

public class trapezoide extends Figura{
    /*-trapezoides asimétricos
    Es una figura que no tiene lados paralelos ni eje de simetría.La suma de susángulos interiores será de 360°.
    Area= A=(B+b/2)h
    perímetro = P=L+L+L+L */
    private double a,p,l,b,h,bm;

    public trapezoide(){}

    public trapezoide(double a,double p,double l,double b, double h,double bm){
        this.a = a;
        this.p = p;
        this.l = l;
        this.b = b;
        this.h = h;
        this.bm = bm;
    }
    
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getP() {
        return p;
    }
    public void setP(double p) {
        this.p = p;
    }
    public void setL(double l) {
        this.l = l;
    }
    public double getL() {
        return l;
    }
    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getBm() {
        return bm;
    }

    public void setBm(double bm) {
        this.bm = bm;
    }

    public void calcularArea(){
        System.out.println("Para calcular el area de la figura tenemos una base menor de "+ b +", una base mayor de "+ bm +" y una altura de "+h);
        a= ((b+bm)/2)*h;
        System.out.println("El valor de el area es: "+a);
    }

    public void calcularPerimetro(){
        System.out.println("Para calcular el perimetro de la figura tenemos "+ l);
        for(int i=0;i<=4;i++){
            p = l + p;
        }
        System.out.println("El valor de el perímetro es: "+p);
    }
}
