package me.SkyFighter.com.Commands;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.SkyFighter.com.Info.Info;
import me.SkyFighter.com.Managers.ArenaManager;

public class SkyFighter implements CommandExecutor {
	
	private Player p = null;
	private String packageName = Info.getMainPackage();
	
	public SkyFighter()
	{

	}
	
	private void info(Player p)
	{
		p.sendMessage(Info.mainInfo());
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		p = (Player) sender;
		
		if (!label.equalsIgnoreCase("skyfighter")) return false;
		
		if (args.length == 0)
		{
			info(p);
		}
		else if (args.length == 1)
		{
			
		}
		else
		{
			p.sendMessage("more than 1 arg");
		}
		
		return false;
	}
	
}
