package xyz.blujay.splasharrows.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class SplashArrowsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //----Tipped Arrows----
        // Created by blujay
        // (source)
        // Like my work? you can support me!
        // https://www.paypal.com/paypalme/blujayxyz
        // Website: blujay.xyz
        //---------------------
        sender.sendMessage("&#00bffb&l-&#0db5f8&l-&#1babf5&l-&#28a1f2&l-&#3597f0&lT&#438ded&li&#5083ea&lp&#5d79e7&lp&#6b6fe4&le&#7865e1&ld &#855adf&lA&#9250dc&lr&#a046d9&lr&#ad3cd6&lo&#ba32d3&lw&#c828d0&ls&#d51ece&l-&#e214cb&l-&#f00ac8&l-&#fd00c5&l-");
        sender.sendMessage("&e&nhttps://github.com/blu-jay/SplashArrows");
        sender.sendMessage("&#00bffb&lL&#0ab8f9&li&#13b0f7&lk&#1da9f5&le &#27a2f3&lm&#319af1&ly &#3a93ef&lw&#448cec&lo&#4e84ea&lr&#587de8&lk&#6176e6&l? &#6b6ee4&ly&#7567e2&lo&#7e60e0&lu &#8858de&lc&#9251dc&la&#9c49da&ln &#a542d8&ls&#af3bd6&lu&#b933d4&lp&#c32cd1&lp&#cc25cf&lo&#d61dcd&lr&#e016cb&lt &#ea0fc9&lm&#f307c7&le&#fd00c5&l!");
        sender.sendMessage("&e&nhttps://www.paypal.com/paypalme/blujayxyz");
        sender.sendMessage("&#00bffb&lW&#24a4f3&le&#4888ec&lb&#6c6de4&ls&#9152dc&li&#b537d4&lt&#d91bcd&le&#fd00c5&l: &e&nblujay.xyz");
        return true;
    }
}
