package aula11_11;
import java.util.Scanner;
public class calculadora {
    static Scanner scanner = new Scanner(System.in);
    static float mul(float a, float b){
        return a*b;
    }
    static float sum(float a, float b){
        return a+b;
    }
    static float sub(float a, float b){
        return a-b;
    }
    static float div(float a, float b){
        if(b != 0){
            return a/b;
        } else {
            return 0;
        }
    }
    static float pon(float v, int exp){
        float result=1;
        for(int i = 0; i < exp; i++){
            result*=v;
        }
        return result;
    }
    static float operator_to_function(float values[],char operator){
        switch (operator) {
            case '+':
                return sum(values[0],values[1]);
            case '-':
                return sub(values[0],values[1]);
            case '*':
                return mul(values[0],values[1]);
            case '/':
                return div(values[0],values[1]);
            default:
                return 0;
        }
    }
    public static void main(){
        String input;
        boolean exit = false;
        do{
            float[] values;
            values = new float[2];
            int current_value = 0;
            boolean decimal = false, error = false;
            int casas_decimais = 1;
            char operator = '\0';
            System.out.println("Calculadora");
            input = scanner.nextLine();
            for(int i = 0; i < input.length(); i++){
                if(input.charAt(i) >= 48 && input.charAt(i) <= 57){   
                    if(decimal == false){
                        values[current_value]*=10;
                        values[current_value]+=Character.getNumericValue(input.charAt(i));
                    } else{
                        values[current_value]+=Character.getNumericValue(input.charAt(i))/pon(10,casas_decimais);
                        casas_decimais++;
                    }
                    
                } else{
                    switch (input.charAt(i)) {
                        case '+':
                            decimal = false;
                            casas_decimais = 1;
                            if(current_value == 0){
                                current_value = 1;
                                operator = '+';
                            } else{
                                values[0]=operator_to_function(values,operator);
                                operator = '+';
                                values[1] = 0;
                            }
                        break;
                        case '-':
                            decimal = false;
                            casas_decimais = 1;
                            if(current_value == 0){
                                current_value = 1;
                                operator = '-';
                            } else{
                                values[0]=operator_to_function(values,operator);
                                operator = '-';
                                values[1] = 0;
                            }
                        break;
                        case '*':
                            decimal = false;
                            casas_decimais = 1;
                            if(current_value == 0){
                                current_value = 1;
                                operator = '*';
                            } else{
                                values[0] = operator_to_function(values,operator);
                                operator = '*';
                                values[1] = 0;
                            }
                        break;
                        case '/':
                            decimal = false;
                            casas_decimais = 1;
                            if(current_value == 0){
                                current_value = 1;
                                operator = '/';
                            } else{
                                values[0]=operator_to_function(values,operator);
                                operator = '/';
                                values[1] = 0;
                            }
                        break;
                        case '.':
                            if(decimal == false){
                                decimal = true;
                            }
                        break;
                        default:
                            System.err.println("ERROR: "+input.charAt((i))+" is not a valid component!\n");
                            error = true;
                        break;
                        
                    }
                    if(error == true){
                        break;
                    }
                }
            }
            values[0] = operator_to_function(values,operator);
            System.out.println("Resultado: "+values[0]);
        } while(exit == false);
    }
}
