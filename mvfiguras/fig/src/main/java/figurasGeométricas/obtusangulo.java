package figurasGeométricas;

public class obtusangulo extends Figura{
    /*-obtusangulo
    Es un triángulo el cual tiene la característica de que uno de sus ángulos es mayor a 90°
    perímetro= P= L+L+L
    Area= A = (b*h)/2 */
    private double p,l,a,b,h;

    public obtusangulo(){}

    public obtusangulo(double p,double l,double a,double b,double h){
        this.p = p;
        this.l = l;
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
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

    

    public void calcularArea(){
        System.out.println("Para calcular el area de la figura tenemos una base y altura de "+ b + " - "+ h);
        double x = b * h;
        a = x / 2;
        System.out.println("El valor de el area es: "+a);
    }

    public void calcularPerimetro(){
        System.out.println("Para calcular el perímetro de la figura tenemos un lado de"+ l);
        p = l + l + l + l;
        System.out.println("El valor de el perímetro es: "+p);
    }
}
