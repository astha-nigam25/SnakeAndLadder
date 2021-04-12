package model;

import java.util.ArrayList;
import java.util.List;

import service.LadderService;
import service.SnakeService;

public class SnakeAndLadder {
	private List<Snake> snakes;
	private List<Ladder> ladders;
	private LadderService ladderService = new LadderService();
	private SnakeService snakeService = new SnakeService();
	
	
	private int size;
	public SnakeAndLadder(int size)
	{
		this.size = size;
		this.ladders = ladderService.getLadders();
		this.snakes = snakeService.getSnakes();
	}
	public int getSize()
	{
		return size;
	}
	public List<Snake> getSnakes()
	{
		return snakes;
	}
	public void setSnakes(List<Snake> snakes)
	{
		this.snakes = snakes;
	}
	public List<Ladder> getLadders()
	{
		return ladders;
	}
	public void setLadders(List<Ladder> ladders)
	{
		this.ladders = ladders;
	}
}
