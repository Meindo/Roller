package net.minigameking.roller;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class API {
    public static void roll(ItemStack itemToRoll, Player pl){
        int rNumb1;
        int max1 = 10;
        int min1 = 1;
        int rNumb2;
        int max2 = 10000;
        int min2 = 100;
        rNumb1 = (int) ((Math.random() * max1) + min1);
        rNumb2 = (int) ((Math.random() * max2) + min2);
        if (!(rNumb1 == 10)) {
            pl.sendMessage("You rolled a " + rNumb1);
        } else {
            pl.sendMessage("You rolled a " + rNumb2);
            if (!(itemToRoll.getType() == Material.AIR)) {
                World world = pl.getWorld();
                for (int i = 0; i < rNumb2 / 100; i++) {
                    world.dropItemNaturally(pl.getLocation(), itemToRoll);
                }
            }

        }
    }
}
