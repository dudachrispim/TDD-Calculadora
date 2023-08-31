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
    public double raizQuadrada1(double numero) {
    return Math.sqrt(numero);
}
    public double raizQuadrada(double numero) {
    if (numero < 0) {
        throw new IllegalArgumentException("Não é possível calcular a raiz de um número negativo");
    }
    return Math.sqrt(numero);
	}
}
