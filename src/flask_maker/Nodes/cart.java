package flask_maker.Nodes;


import org.powerbot.core.script.job.Task;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.wrappers.interactive.Player;
import org.powerbot.game.api.wrappers.node.SceneObject;


import flask_maker.utils.Ids;
import flask_maker.utils.Tiles;

public class cart  extends Node {

@Override
public boolean activate() {	
final Player player = Players.getLocal();
return !player.isMoving() && Inventory.containsAll(Ids.stoneid);
}


@Override
public void execute() {
	Walking.walk(Tiles.cartTile);
    sleep(1000);
	 SceneObject cart = SceneEntities.getNearest(Ids.cartid);
     if (Players.getLocal().getAnimation() == -1) {
             if (cart != null) {
                      if (cart.isOnScreen()) {
                                     cart.interact("Fill", "Robust glass machine");
                                                             {
                                             Task.sleep(5000, 5500);
                                                 System.out.println("make robust glass ");
                                                   Widgets.get(1370, 38).click(true);
                                                     Task.sleep(10000, 10500);
                                                             }}}}  
     sleep(1000);
     
}
}