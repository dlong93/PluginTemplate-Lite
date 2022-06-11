package org.mineacademy.template;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 *
 * It uses Foundation for fast and efficient development process.
 */
public final class PluginTemplate extends SimplePlugin {

	/**
	* Automatically perform login ONCE when the plugin starts.
	*/
	@Override
	protected void onPluginStart() {

		//Random console outputs at startup
		System.out.println(1);
		System.out.println("knock, knock!");
		System.out.println("hello");
		System.out.println("Adding 1 plus 1, " + (1 + 1));

         int apple = 5;

	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {

		event.getRightClicked().setFireTicks(2 * 20); // 20 ticks = 1 second

		//if (event.getRightClicked().getType() == EntityType.SHEEP)
		//	event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
	}
}
