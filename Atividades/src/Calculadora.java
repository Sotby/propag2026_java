import gxp.Leituras;

public class Calculadora {
    public static double Somar(double a, double b){
        return  a + b;
    }
    public static double Subtrair(double a, double b){
        return  a-b;
    }
    public static double Multiplicar(double a, double b){
        return (a*b);
    }
    public static double Dividir(double a, double b){
        return(a/b);
    }
    public static void main(){
        double a, b;
        System.out.print("Insira o primeiro valor: ");
        a = Leituras.lerdouble();
        System.out.print("Insira o segundo valor: ");
        b = Leituras.lerdouble();
        System.out.println("Soma: "+Somar(a,b));
        System.out.println("Subtração: "+Subtrair(a,b));
        System.out.println("Multiplicação: "+Multiplicar(a,b));
        if(b!= 0){
            System.out.println("Divisão: "+Dividir(a,b));
        } else {
            System.out.println("Divisão: não é possivel dividir por zero");
        }
          

    }
}
