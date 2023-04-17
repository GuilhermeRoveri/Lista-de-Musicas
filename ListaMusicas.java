import java.util.ArrayList;

public class ListaMusicas{


public static void main(String [] args){


    ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
    listaParaIlhaDeserta.add("Bones");
    listaParaIlhaDeserta.add("Enemy");
    listaParaIlhaDeserta.add("If I Can Dream");
    listaParaIlhaDeserta.add("Paradise");
    listaParaIlhaDeserta.add("Shape of You");
    listaParaIlhaDeserta.add("Way Down We Go");
    listaParaIlhaDeserta.add("Don't You Worry Child");
    listaParaIlhaDeserta.add("Treat You Better");
    listaParaIlhaDeserta.add("7 Rings");
    listaParaIlhaDeserta.add("Sweather Weather");
   


    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());


    listaParaIlhaDeserta.remove("Paradise");
    listaParaIlhaDeserta.remove("Don't You Worry Child");
    listaParaIlhaDeserta.remove("Treat You Better");
    listaParaIlhaDeserta.remove("Shape of You");
    listaParaIlhaDeserta.remove("If I Can Dream");
    System.out.println(listaParaIlhaDeserta.size());
    
    String musicaA ="Bones";
        String musicaB ="Enemy";
        int indexA = listaParaIlhaDeserta.indexOf(musicaA);
        int indexB = listaParaIlhaDeserta.indexOf(musicaB);
        System.out.println(indexA);
        System.out.println(indexB);
        String tempA = listaParaIlhaDeserta.get(indexA);
        listaParaIlhaDeserta.set(indexA, listaParaIlhaDeserta.get(indexB));
        listaParaIlhaDeserta.set(indexB, tempA);
        System.out.println("Minha lista de músicas (após trocar " + musicaA + " com " + musicaB + "): " + listaParaIlhaDeserta);
        listaParaIlhaDeserta.set(indexB, listaParaIlhaDeserta.get(indexA));
        listaParaIlhaDeserta.set(indexA, tempA);
        System.out.println("Minha lista após voltar as músicas as suas posições" + listaParaIlhaDeserta);
    
    }
}