package atvav3;
import gxp.Leituras;
public class TemperaturaSemanas{
    public static void main(){
        String DiasSemana[] = {"Domingo","Segunda-Feira","Terça-Feira","Quarta-Feira","Quinta-Feira","Sexta-Feira","Sabado"};
        double temperaturas[];
        double total = 0;
        int maior = 0;
        temperaturas = new double[7];
        for(int i = 0; i < 7; i++){
            System.out.print("Insira a temperatura de "+DiasSemana[i]+":");
            temperaturas[i] = Leituras.lerdouble();
            total += temperaturas[i];
            if(temperaturas[maior]< temperaturas[i]) maior = i;
        }
        double media = total/7;
        System.out.printf("Média da semana: %.2f°C\n",media);
        System.out.println("Dias acima da média:");
        for(int i = 0; i < 7;i++){
            if(temperaturas[i] > media){
                System.out.printf("%s ( %.2f °C)\n",DiasSemana[i],temperaturas[i]);
            }
        }
        System.out.printf("Dia mais quente: %s ( %.2f °C)\n",DiasSemana[maior],temperaturas[maior]);
    }
}
