package plats;

import java.util.ArrayList;
import java.util.List;

public class Igname extends Plat {

    @Override
    public List<String> collecterIngredients() {
       List<String> ingredients=new ArrayList<>();
       ingredients.add("tubercules igname");
       ingredients.add("tomates");
       ingredients.add("sel");
       ingredients.add("huile");
       ingredients.add("piment");
       ingredients.add("viande de la biche");
       return  ingredients;
    }

    @Override
    public Plat preparerPlat(List<String> ingredients) {
        System.out.println("La preparation de l'igname a commence");
        System.out.println("L'eau commence a bouillir");
        for(String ingredient:ingredients){
            System.out.println("Ajout de  "+ingredient);
        }
        System.out.println("Fin de preparation de l'igname");
        return  this;
    }

    @Override
    public void servir() {
        System.out.println("Je suis entrain de servir l'igname");
    }
}
