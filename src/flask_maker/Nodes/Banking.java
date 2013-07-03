package flask_maker.Nodes;
import org.powerbot.core.script.job.state.Node;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.methods.widget.Bank;
import org.powerbot.game.api.methods.widget.DepositBox;
import flask_maker.utils.Ids;
import flask_maker.utils.Tiles;



public class Banking extends Node {

@Override
public boolean activate() {
return Inventory.containsAll(Ids.flaskid);
}

@Override
public void execute() {	
	
	sleep(1000);
	if (Bank.isOpen()){                   //Bank class,  checks to see if the bank is open
        Bank.depositInventory();
        sleep(800, 1200);
       Bank.close();                     //Closes the bank after depositing
    }   else {
    	Walking.walk(Tiles.bankTile);
        Bank.open();                      //Opens the banks
        sleep(1000 ,1400);                // Sleeps in case of lag
    

}
sleep(1000);
}


}