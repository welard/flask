package flask_maker.Nodes;


import org.powerbot.core.script.job.Task;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.tab.Inventory;
import flask_maker.utils.Ids;

public class Make  extends Node {

@Override
public boolean activate() {	
return Inventory.containsAll(Ids.glassid);
}


@Override
public void execute() {
	   
          
          Inventory.getItem(Ids.glassid).getWidgetChild().interact("Craft", "Robust glass");
          sleep(1000, 1200);
          Widgets.get(1370, 38).click(true);
                  Task.sleep(50000, 55050);
  

                       sleep(1000);
     }
}
