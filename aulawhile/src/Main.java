public class Main {
    public static void main(String[] args) {
        int[] meuArraw = {6,10,12,15,20};
        int meuNumero = 10;
        int i = 0;

        while (i <= meuArraw.length -1) {
            System.out.println("Valor do elemento" + meuArraw[i]);
            i++;
        }
        System.out.println("Sai do while");
    }
}