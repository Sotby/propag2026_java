package aula11_11;
public class App {
    static int MAX_REGISTROS = 26;
    public static void main(String[] args) throws Exception {
        char[] letras;
        letras = new char[MAX_REGISTROS];
        int next_char = 65;
        for(int i = 0; i < MAX_REGISTROS; i++){
            letras[i] = (char)next_char;
            System.out.print(letras[i]+" ");
            next_char++;
        }
        
    }
}
