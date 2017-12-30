package me.SkyFighter.com.Managers;

import java.util.*;

import org.bukkit.entity.Player;

import me.SkyFighter.com.BaseClasses.Arena;

public class ArenaManager {
	private Map<String, Arena> arenas = new HashMap<>();
	
	public ArenaManager()
	{
		
	}
	
	public void addArena(String name, int maxPlayers)
	{
		Arena arena = new Arena(name, maxPlayers);
		arenas.put(name, arena);
	}
	
	public void deleteArena(String name)
	{
		arenas.remove(name);
	}
	
	public Map<String, Arena> getArenas()
	{
		return arenas;
	}
	
	public boolean arenaExists(String name)
	{
		if (arenas.containsKey(name)) return true;
		return false;
	}
}
