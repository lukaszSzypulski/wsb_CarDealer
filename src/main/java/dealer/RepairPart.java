package dealer;

import java.util.HashMap;
import java.util.Map;

public class RepairPart {

    Map<String, Integer> repairCost = new HashMap<>();


    private void addCosts (){
        repairCost.put("Brakes", 10);
        repairCost.put("Dampers", 20);
        repairCost.put("Engine", 100);
        repairCost.put("Car body", 50);
        repairCost.put("Gearbox", 50);
    }

}
