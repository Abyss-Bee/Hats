package me.DuckyProgrammer.Hats;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HatCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You must be a player to use this command!");
            return false;
        }
        Player player = (Player) sender;
        if (!player.hasPermission("hats.hat")) {
            player.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            return false;
        }
        if (player.getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
            player.sendMessage(ChatColor.RED + "You must be holding an item to use this command!");
            return false;
        }
        player.getInventory().setHelmet(player.getInventory().getItemInMainHand());
        player.getInventory().setItemInMainHand(null);
        player.sendMessage(ChatColor.GREEN + "You are now wearing your item as a hat!");
        return true;
    }
}
