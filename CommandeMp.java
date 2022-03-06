package plugin.Ozyris;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandeMp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(label.equals("mp")){
                Player t = Bukkit.getPlayer(args[0]);
                String thefinalstring = "";
                int ag = args.length;
                int a = ag - 1;
                for (int i = 1; i < args.length - 1; i++) {
                    thefinalstring += args[i] + ' ';
                }
                thefinalstring += args[a] ;
                thefinalstring = thefinalstring.trim();
                t.sendMessage(ChatColor.AQUA + "<" + player.getName() + "> " + thefinalstring);
                player.sendMessage(ChatColor.LIGHT_PURPLE + "<" + player.getName() + "> " + thefinalstring);
            }
        }
        return false;
    }
}

