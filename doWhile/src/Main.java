public class Main {
    public static void main(String[] args) {

        int[] meuArraw ={6,10,12,15,20};

        int i = 0;

        do {
            System.out.println("Valor do meu indice: " + i);
            i++;
        } while (i <= meuArraw.length -1);
        System.out.println("Sai do loop");
    }
}