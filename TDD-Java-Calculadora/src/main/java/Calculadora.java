public class Calculadora {
    public int sub(int a, int b) {
        return a - b;
    }
    public  int divisao (int d, int e){
        return d/e;
    }
    public int potencia(int base, int expoente) {
        if (expoente < 0) {
            return 0;
        }

        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }
}
