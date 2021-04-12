package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Snake;

public class SnakeDao {
	private static HashMap<Integer,Snake> hm = new HashMap<Integer,Snake>();
	private int i = 0;
	public void saveSnakes(Snake obj) {
		hm.put(i++, obj);
	}
	public List<Snake> getSnakes() {
		return new ArrayList<Snake>(hm.values());
	}

}
