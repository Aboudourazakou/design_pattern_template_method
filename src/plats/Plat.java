package plats;

import java.util.List;

public abstract class Plat {

    public  final Plat cuisineTemplateMethod(){
         nettoyerFourneau();
         allumerFourneau();
         List<String> ingredients=collecterIngredients();
         Plat plat=preparerPlat(ingredients);
         eteindreFourneau();
         servir();

         return  plat;
    }


    public  void nettoyerFourneau(){
        System.out.println("En cours de nettoyage du fourneau");
        System.out.println("Fourneau nettoye");
    };
    public  void allumerFourneau(){
        System.out.println("Le fourneau a ete allumé");
    }

    public  abstract List<String> collecterIngredients();
    public  abstract  Plat preparerPlat(List<String> ingredients);

    public void eteindreFourneau(){
        System.out.println("Preparation terminee.Fourneau eteint");
    }

    public  abstract  void servir();
}
