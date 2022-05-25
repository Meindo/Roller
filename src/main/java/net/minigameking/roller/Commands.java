package net.minigameking.roller;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("roll")){
            if(sender instanceof Player) {
                Player player = (Player) sender;
                ItemStack stack = player.getInventory().getItemInMainHand();
                API.roll(stack, player);
            }
        }
        return true;
    }
}
