package nimonscooked.entity.station;

import nimonscooked.entity.item.Plate;

public class ServingCounter extends Station {

    public ServingCounter(String id, float x, float y) {
        super(id, "Serving Counter", x, y);
    }

    public void serveItem(Plate plate){
        Dish dish = plate.getDish();

        if(RecipeManager.checkRecipe(dish)){
            // masih dipikirin, intinya ngecek apakah ada order yang sama ama ini
            plate.setDirty(true);
        }

    }
}