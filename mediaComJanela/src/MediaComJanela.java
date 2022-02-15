public class MediaComJanela {
    public static void main(String[] args) {
        int X = 5;
        int Y = 2;
        int[] notas = {7, 8, 4, 1, 6};
        float[] medias = media(notas, X, Y);
        printaVetor(medias);

    }

    public static float[] media (int[] vetorDados, int X, int Y){

        int aux = X - Y + 1;
        float[] vetorResultante = new float[aux];
        int somaJanela = 0;
        for (int i = 0; i <= X - Y; i++) {
            for (int i2 = 0; i2 < Y; i2++) {
                somaJanela += vetorDados[i + i2];
            }
            vetorResultante[i] = somaJanela / Y;
            somaJanela = 0;
        }
        return vetorResultante;
    }

    public static void printaVetor (float[] vetor){
        System.out.print("[  ");
        for(float parte:vetor){
            System.out.print(parte + "  ");
        }
        System.out.print("]");
    }

}
