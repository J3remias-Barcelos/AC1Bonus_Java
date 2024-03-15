package org.example;

public class Ordenacao {
    public void ordenaDecrescente(int[] v) {
        for (int x = 0; x < v.length - 1; x++) {
            int indice = x;
            for (int y = x + 1; y < v.length; y++) {
                if (v[indice] < v[y]) {
                    indice = y;
                }
            }
            int aux = v[indice];
            v[indice] = v[x];
            v[x] = aux;
        }
    }

    public int buscaBinaria(int[] vetorBusca, int valorProcurado) {
        int inicio = 0;
        int fim = vetorBusca.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetorBusca[meio] == valorProcurado) {
                return meio;
            } else if (vetorBusca[meio] < valorProcurado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Método ordenacaoDescrecente
        int[] v = {5, 3, 2, 4, 7, 1, 0, 6};
        Ordenacao ordenacao = new Ordenacao();

        ordenacao.ordenaDecrescente(v);

        // Método buscaBinaria
        int[] vetorBusca = {0, 1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < vetorBusca.length; i++) {
            System.out.print(vetorBusca[i] + " ");
        }

        int valorProcurado = 5;
        int posicao = ordenacao.buscaBinaria(v, valorProcurado);
        if (posicao != -1) {
            System.out.println("Valor encontrado na posição: " + posicao);
        } else {
            System.out.println("Valor não encontrado");
        }
    }
}
