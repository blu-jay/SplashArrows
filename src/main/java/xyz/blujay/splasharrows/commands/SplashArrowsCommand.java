package xyz.blujay.splasharrows.commands;


import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.minimessage.MiniMessage;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import xyz.blujay.splasharrows.SplashArrows;

public class SplashArrowsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //----Tipped Arrows----
        // Created by blujay
        // https://github.com/blu-jay/SplashArrows
        // Like my work? you can support me!
        // https://www.paypal.com/paypalme/blujayxyz
        // Website: blujay.xyz
        //---------------------
        var senderAudience = SplashArrows.getPlugin().adventure().sender(sender);
        senderAudience.sendMessage(MiniMessage.get().parse("<gradient:#00BFFB:#FD00C5>---------------------</gradient>"));
        senderAudience.sendMessage(MiniMessage.get().parse("<gradient:#00BFFB:#FD00C5>⋙ SplashArrows</gradient>"));
        senderAudience.sendMessage(MiniMessage.get().parse("<gradient:#00BFFB:#FD00C5>⋙ Created by blujay</gradient>"));
        senderAudience.sendMessage(MiniMessage.get().parse("<gradient:#00BFFB:#FD00C5>⋙ Like my work? You can support me!</gradient>"));
        senderAudience.sendMessage(MiniMessage.get().parse("<gradient:#00BFFB:#FD00C5>⋙ Source Code:</gradient> <blue><underlined>github.com/blu-jay/SplashArrows"));
        senderAudience.sendMessage(MiniMessage.get().parse("<gradient:#00BFFB:#FD00C5>⋙ Donations:</gradient> <blue><underlined>paypal.com/paypalme/blujayxyz"));
        senderAudience.sendMessage(MiniMessage.get().parse("<gradient:#00BFFB:#FD00C5>⋙ Website:</gradient> <blue><underlined>blujay.xyz"));
        senderAudience.sendMessage(MiniMessage.get().parse("<gradient:#00BFFB:#FD00C5>---------------------</gradient>"));

        return true;
    }
}
