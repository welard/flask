package flask_maker.Nodes;


import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.Calculations;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.wrappers.node.SceneObject;

import flask_maker.utils.Ids;
import flask_maker.utils.Tiles;

public class Mine  extends Node {

@Override
public boolean activate() {	
return  !Inventory.isFull();
}

@Override
public void execute() {
	if (Calculations.distanceTo(Tiles.mineTile) <= 10)
	 System.out.println("mineing rock");
     SceneObject mine = SceneEntities.getNearest(Ids.mineid);
     if (Players.getLocal().getAnimation() == -1) {
     
                             mine.interact("Mine");
                             sleep(65000,65200);
     
     }
     else
     {
    	 Walking.walk(Tiles.mineTile);
     }
                            
sleep(1000);
}

}