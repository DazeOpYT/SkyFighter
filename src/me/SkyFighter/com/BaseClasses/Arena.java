package me.SkyFighter.com.BaseClasses;

public class Arena {
	
	private String name;
	private int maxPlayers;
	
	public Arena(String _name, int _maxPlayers)
	{
		name = _name;
		maxPlayers = _maxPlayers;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMaxPlayers()
	{
		return maxPlayers;
	}
}
