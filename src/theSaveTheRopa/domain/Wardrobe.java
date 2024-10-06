package theSaveTheRopa.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wardrobe {
    private Map<Integer, List<Clothing>> wardrobe = new HashMap<>();
    private int id;
    private static int idCounter = 1;


    public Wardrobe() {

    }

    public Map<Integer, List<Clothing>> getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Map<Integer, List<Clothing>> wardrobe) {
        this.wardrobe = wardrobe;
    }

    public int getId() {
        return id;
    }
    public void setId() {
        this.id = idCounter++;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "wardrobe=" + wardrobe +
                ", id=" + getId() +
                '}';
    }

    public Integer saveClothing(List<Clothing> clothing) {
        setId();
        wardrobe.put(getId(), clothing);
        return getId();
    }

    public void showClothing() {
        for (Map.Entry<Integer, List<Clothing>> clothing : wardrobe.entrySet()) {
            System.out.println(clothing);
        }
    }

    public List<Clothing> retriveClothing(int id) {
        System.out.println("Roupas a devolver: "+ wardrobe.get(id));
        return wardrobe.get(id);
    }

}
