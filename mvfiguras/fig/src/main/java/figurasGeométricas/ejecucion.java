package figurasGeométricas;

import java.util.*;

public class ejecucion{
    
    public static void main(String[] args) {
        int opc=0;

        Scanner sc = new Scanner(System.in);

        heptagono hep = new heptagono();
        obtusangulo obt = new obtusangulo();
        trapezoide tra = new trapezoide();

        System.out.println("Ingrese la figura que desea conocer el area o el perímetro\n1. heptagono\n2. obtusangulo\n3. trapezoide");
        opc = sc.nextInt();

        switch(opc){
            case 1:
            System.out.println("Elija que calculo desea conocer \n1. Perímetro\n2. Area");
            int men = sc.nextInt();
            switch(men){
                case 1:
                // calculo del perímetro de heptagono con un valor determinado
                hep.setL(20.0);
                hep.calcularPerimetro();
                // calculo del perímetro de heptangono con un valor determinado por el usuario
                System.out.println("\nIngrese el valor del lado de la figura :");
                hep.setL(sc.nextDouble());
                hep.calcularPerimetro();
                    break;
                case 2:
                //Calculo de el area de heptágono con un valor determinado
                hep.setP(34.0);
                hep.setAp(17.0);
                hep.calcularArea();
                //Calculo de el area del heptágono con un valor determindado por el usuario
                System.out.println("\nIngrese el valor de el perímetro :");
                hep.setP(sc.nextDouble());
                System.out.println("\nIngrese el valor de el apotema :");
                hep.setAp(sc.nextDouble());
                hep.calcularArea();
                    break;
                default:
                System.out.println("Valor incorrecto\nIngrese un valor que esté permitido para el próximo intento");
                    break;
            }
                break;

            case 2:
            System.out.println("Elija que calculo desea conocer \n1. Perímetro\n2. Area");
            int men1 = sc.nextInt();
            switch(men1){
                case 1:

                //Calculo del perimetro del obtusangulo
                obt.setL(23.0);
                obt.calcularPerimetro();

                //Calculo del perimetro del obtusangulo con datos del usuario
                System.out.println("\nIngrese el valor del lado de la figura :");
                double lado = sc.nextDouble();
                obt.setL(lado);
                obt.calcularPerimetro();

                    break;
                case 2:

                //Calculo del area del obtusangulo
                obt.setB(26.0);
                obt.setH(38.0);
                obt.calcularArea();

                //Calculo del area del obtusangulo con ingreso de datos
                System.out.println("Ingrese la base de la ficura: ");
                double base = sc.nextDouble();
                obt.setB(base);
                System.out.println("Ingrese la altura de la ficura: ");
                double altura = sc.nextDouble();
                obt.setH(altura);
                obt.calcularArea();
                
                    break;
                default:
                System.out.println("Valor incorrecto\nIngrese un valor que esté permitido para el próximo intento");
                    break;
            }
                break;

            case 3:
            System.out.println("Elija que calculo desea conocer \n1. Perímetro\n2. Area");
            int men2 = sc.nextInt();
            switch(men2){
                case 1:
                //Calculo del perímetro del trapezoide con datos del usuario
                System.out.println("\nIngrese el valor de la medida de los lados del el trapezoide: ");
                tra.setL(sc.nextDouble());
                tra.calcularPerimetro();
                    break;
                case 2:
                //Calculo del area del el trapezoide
                tra.setB(34.0);
                tra.setBm(18.0);
                tra.setH(31.0);
                tra.calcularArea();
                    break;
                default:
                System.out.println("Valor incorrecto\nIngrese un valor que esté permitido para el próximo intento");
                    break;
            }
                break;

            default:
            System.out.println("Valor incorrecto\nIngrese un valor que esté permitido para el próximo intento");
                break;
        }

        sc.close();
    }
}
