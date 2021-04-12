package service;


import java.util.List;

import dao.SnakeDao;
import model.Snake;
public class SnakeService {
	private SnakeDao snakeDao = new SnakeDao();

	public void saveSnakes(Snake obj) {
		snakeDao.saveSnakes(obj);
	}
	public List<Snake> getSnakes()
	{
		return snakeDao.getSnakes();
	}

}
