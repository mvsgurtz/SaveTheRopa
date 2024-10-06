package theSaveTheRopa.tests;

import theSaveTheRopa.domain.Clothing;
import theSaveTheRopa.domain.Tshirt;
import theSaveTheRopa.domain.Wardrobe;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        List<Clothing> clothings = new ArrayList<>(){{
            add(new Tshirt("blusa", "DC"));
            add(new Tshirt("camiseta", "BMW"));
            add(new Tshirt("tenis", "nike"));

        }};
        List<Clothing> clothings2 = new ArrayList<>(){{
            add(new Tshirt("bone", "DC"));
            add(new Tshirt("shorts", "BMW"));
            add(new Tshirt("tenis", "nike"));

        }};

        wardrobe.saveClothing(clothings);
        wardrobe.saveClothing(clothings2);
        wardrobe.showClothing();
        wardrobe.retriveClothing(2);
    }
}
