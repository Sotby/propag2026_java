package atvav3;
import gxp.Leituras;

public class MediaComMetodo{
    public static double CalcularMedia(double n1, double n2){
        return ((n1+n2)/2);
    }
    public static String Situacao(double media){
        if(media >= 7){
            return "Aprovado";
        } else{
            return "Em Recuperação";
        }
    }
    public static void main(){
        double notas[] = new double[2];
        System.out.print("Insira a primeira nota: ");
        notas[0] = Leituras.lerdouble();
        System.out.print("Insira a segunda nota: ");
        notas[1] = Leituras.lerdouble();
        double media = CalcularMedia(notas[0],notas[1]);
        System.out.println("Nota 1: "+notas[0]);
        System.out.println("Nota 2: "+notas[1]);
        System.out.println("Média: "+media);
        System.out.println("Situação: "+Situacao(media));
    }
}
