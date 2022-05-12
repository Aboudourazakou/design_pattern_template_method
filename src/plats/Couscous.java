package plats;

import java.util.ArrayList;
import java.util.List;

public class Couscous extends  Plat {
    @Override
    public List<String> collecterIngredients() {
        List<String> ingredients=new ArrayList<>();
        ingredients.add("couscous");
        ingredients.add(" 7 ingredients");
        ingredients.add("sel");
        ingredients.add("huile");
        ingredients.add("viande de poulet");
        return  ingredients;
    }

    @Override
    public Plat preparerPlat(List<String> ingredients) {
        System.out.println("La preparation du couscous a commence");
        System.out.println("L'eau commence a bouillir");
        for(String ingredient:ingredients){
            System.out.println("Ajout de "+ingredient);
        }
        System.out.println("Fin de preparation du couscous");
        return this;
    }

    @Override
    public void servir() {
        System.out.println("Je suis entrain de servir couscous");
    }
}
