package flask_maker.utils;

import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.api.wrappers.Tile;

public class Tiles {
	 
     public static final Area bankarea = new Area(new Tile[] {
                            new Tile(2553, 2837, 0), new Tile(2554, 2837, 0),
                            new Tile(2555, 2837, 0), new Tile(2555, 2838, 0),
                            new Tile(2556, 2838, 0), new Tile(2556, 2839, 0),
                            new Tile(2557, 2839, 0), new Tile(2557, 2840, 0),
                            new Tile(2557, 2841, 0), new Tile(2556, 2841, 0),
                            new Tile(2555, 2841, 0), new Tile(2555, 2842, 0),
                            new Tile(2554, 2842, 0), new Tile(2553, 2842, 0),
                            new Tile(2553, 2843, 0)
            });
   
     
     public static final Area minearea = new Area(new Tile[] {
    		
    					new Tile(2600, 2871, 0), new Tile(2599, 2870, 0),
    					new Tile(2598, 2870, 0), new Tile(2597, 2870, 0),
    					new Tile(2596, 2870, 0), new Tile(2595, 2869, 0),
    					new Tile(2594, 2869, 0), new Tile(2593, 2869, 0),
    					new Tile(2592, 2869, 0), new Tile(2591, 2869, 0),
    					new Tile(2591, 2870, 0), new Tile(2590, 2870, 0),
    					new Tile(2589, 2870, 0), new Tile(2588, 2870, 0),
    					new Tile(2587, 2871, 0), new Tile(2586, 2871, 0),
    					new Tile(2585, 2871, 0), new Tile(2584, 2871, 0),
    					new Tile(2584, 2872, 0), new Tile(2583, 2872, 0),
    					new Tile(2583, 2873, 0), new Tile(2582, 2873, 0),
    					new Tile(2582, 2874, 0), new Tile(2581, 2874, 0),
    					new Tile(2581, 2875, 0), new Tile(2580, 2875, 0),
    					new Tile(2580, 2876, 0), new Tile(2580, 2877, 0),
    					new Tile(2580, 2878, 0), new Tile(2580, 2879, 0),
    					new Tile(2581, 2879, 0), new Tile(2581, 2880, 0),
    					new Tile(2582, 2880, 0), new Tile(2582, 2881, 0),
    					new Tile(2583, 2881, 0), new Tile(2584, 2881, 0),
    					new Tile(2585, 2882, 0), new Tile(2586, 2882, 0),
    					new Tile(2587, 2882, 0), new Tile(2588, 2882, 0),
    					new Tile(2589, 2882, 0), new Tile(2590, 2882, 0),
    					new Tile(2591, 2882, 0), new Tile(2592, 2882, 0),
    					new Tile(2593, 2882, 0), new Tile(2594, 2881, 0),
    					new Tile(2595, 2881, 0), new Tile(2595, 2880, 0),
    					new Tile(2596, 2880, 0), new Tile(2596, 2879, 0),
    					new Tile(2596, 2878, 0), new Tile(2597, 2878, 0),
    					new Tile(2597, 2877, 0), new Tile(2597, 2876, 0),
    					new Tile(2597, 2875, 0), new Tile(2598, 2875, 0),
    					new Tile(2598, 2874, 0), new Tile(2599, 2874, 0),
    					new Tile(2600, 2874, 0), new Tile(2600, 2873, 0)
    			});
     
  
     public static final Tile [] wall_path = {new Tile(2560, 2845, 0), new Tile(2571, 2849, 0), new Tile(2582, 2857, 0),new Tile(2590, 2863, 0), new Tile(2596, 2869, 0)};
     
   //to rock
     public static final Tile [] trock_path = {new Tile(2596,2871,0),new Tile(2587,2877,0)};

   //from rock
     public static final Tile [] frock_path = {new Tile(2587,2877,0), new Tile(2596,2871,0)};
     
   //to cart
     public static final Tile [] tocart_path = {new Tile(2596,2869,0),new Tile(2588,2861,0),new Tile(2585,2854,0)};

   //from cart to bank
     public static final Tile [] carttobank_path = {new Tile(2585,2854,0), new Tile(2579,2849,0), new Tile(2568,2847,0), new Tile(2556,2845,0), new Tile(2556,2840,0)};
     
     public static final Tile bankTile = new Tile (2556, 2839, 0);
     public static final Tile wallTile = new Tile(2596, 2868, 0);
     public static final Tile mineTile = new Tile (2587, 2878, 0);
     public static final Tile wall1Tile = new Tile (2596, 2871, 0);
     public static final Tile cartTile = new Tile (2582, 2855, 0);
}
