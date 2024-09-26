public interface Comentarios {
    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha

        /*
         * Eu sou um comentario
         * que posso ser mais detalhado
         * quando necessário
         */

    }

    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretendende elaborar um comentário
     * a nivel de documentação.
     * Que incrível !!!
     */
    public default int somaMultiplica(int n, int x, String m) {
        int r = 0;
        if (m == "M") {
            r = n * x;
        } else {
            r = n + x;
        }
        return r;
    }

}
