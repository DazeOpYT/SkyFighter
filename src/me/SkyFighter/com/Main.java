package me.SkyFighter.com;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.SkyFighter.com.Commands.SkyFighter;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		setup();
	}
	
	@Override
	public void onDisable()
	{

	}
	
	private void setup()
	{
		registerCommands();
	}
	
	private void registerCommands()
	{
		getCommand("skyfighter").setExecutor(new SkyFighter());
	}
	
}
