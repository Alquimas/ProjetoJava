package classesAuxiliares;

public class Pair {
    private int primeiro;
    private int segundo;

    public Pair(int a, int b) {
        this.primeiro = a;
        this.segundo = b;
    }

    public int getX() {
        return this.primeiro;
    }

    public int getY() {
        return this.segundo;
    }

    // override dos métodos equals e hashcode para que as funcoes funcionem com as
    // collection
    @Override
    public boolean equals(Object par) {
        if (this == par) {
            return true;
        }
        if (!(par instanceof Pair)) {
            return false;
        }

        Pair nPar = (Pair) par;

        if (this.primeiro != nPar.primeiro) {
            return false;
        }
        if (this.segundo != nPar.segundo) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (11 * (this.primeiro) + this.segundo);
        // explicação simples de porquê esse hash funciona PRA ESSE CASO
        // Estamos mapeando APENAS pares ordenados com primeira entrada
        // entre 0 e 2 e segunda entrada entre 0 e 4
        // 5*primeiro + segundo resulta sempre em número único dadas essas
        // condições (teorema fundamental da aritmética)
        // PORÉM esse seria um código hash PÉSSIMO caso a segunda entrada fosse
        // aumentada pra 5, por exemplo
        // pois 5*0 + 5 e 5*1 + 0 já dariam colisão
        // no fim do dia, qualquer classe pair que recebe entrada entre (0, a)
        // e (0, b) tem hash simples dado como k*a + b, onde k é o menor primo maior
        // que ambos a e b (fácil de provar pelo teorema fundamental da aritmética)
    }

}
