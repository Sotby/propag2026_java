import gxp.Leituras;
public class ReajusteSalario {
    static int nSalarios = 5;
    public static void MostrarSalarios(double salarios[]){
        System.out.println("");
        for(int i = 0; i < nSalarios; i++){
            System.out.printf("Funcionario %d: %.2f\n",i+1,salarios[i]);
        }
        System.out.println("");
    }
    public static void main(){
        double salarios[];
        salarios = new double[nSalarios];
        for(int i = 0; i < nSalarios; i++){
            System.out.print("Insira o salario do "+(i+1)+"º funcionário: ");
            do{
                salarios[i] = Leituras.lerdouble();
                if(salarios[i] <= 0) System.err.println("Salario inválido! Tente novamente:");
            } while(salarios[i] <= 0);
        }
        MostrarSalarios(salarios);
        for(int i = 0; i < nSalarios; i++){
            if(salarios[i] < 2000){
                salarios[i]*=1.1;
            }
        }
        MostrarSalarios(salarios);
    }
}
