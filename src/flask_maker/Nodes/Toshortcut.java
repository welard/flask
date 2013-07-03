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

public class Toshortcut  extends Node {

@Override
public boolean activate() {	
return   !Inventory.isFull() && !Tiles.minearea.contains(Players.getLocal());
}

@Override
public void execute() {
	
	Walking.walk(Tiles.wallTile);
	System.out.println("Walking To Shortcut");
	
	SceneObject shortcut = SceneEntities.getNearest(Ids.shortcutid);              
    if (Players.getLocal().getAnimation() == -1) {  
              {    
            	  System.out.println("Doing shortcut ");
                    shortcut.interact("Squeeze-through", "Rock passage");
                    
            }
              if (Calculations.distanceTo(Tiles.wall1Tile) <= 1){
    	
              }
    }
    
sleep(1000);
}

}