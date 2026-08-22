package www.cibertec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int obtenerSuma(int a,int b)
    { int suma;
        suma=a+b;
        return suma;}
    static int obtenerSumaSerie(int i)
    { int sumaSerie=0;
        for(i=1;i<=7;i++)
        {sumaSerie=sumaSerie+i;
            return sumaSerie;
        }

        public static void main(String[] 'args') {
        int a=5,b=7,suma,sumaSerie=0,modelo=2,i=0;
        double m;
        boolean valorVerdad=true;
        System.out.println("sumar a=5 y b=7 :\n");
        suma=obtenerSuma(a,b);
        System.out.println("sumar es:"+suma+"\n");
        System.out.println("sumar la serie 1,2,3,4,5,6,7:\n");
        sumaSerie=obtenerSumaSerie(i);
        System.out.println("la suma de la serie es:"+sumaSerie+"\n");

        System.out.println("hallar la raiz cuadrada de 7:\n");
        m=Math.pow(7,0.5);
        System.out.println(" 3 < 5 y 5 < 7, entonces 3 < 7 : V true o F false \n");
        if(3<5&&5<7)
        { System.out.println("es V "+valorVerdad);}
        switch(modelo)
        {case 0:
            System.out.println("Precio:150 soles");
            break;
            case 1:
                System.out.println("Precio:250 soles");
                break;
            case 2:
                System.out.println("Precio:175 soles");
                break;
            default:
                break;}
    }