import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Integer[] a = {5,3,1,4,8,7,6,7,9,8,8,10};
        ObligSBinTre<Integer> tre = new ObligSBinTre<>(Comparator.naturalOrder());
        for (int verdi : a) tre.leggInn(verdi);
        System.out.println(tre.antall()); // Utskrift: 10
        System.out.println();

    }
}
