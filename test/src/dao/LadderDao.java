package dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Ladder;

public class LadderDao {
	private static HashMap<Integer,Ladder> ladders = new HashMap<Integer,Ladder>();
	private static int index = 0;
	public void saveLadder(Ladder ladder) {
		ladders.put(index++,ladder);
	}
	public List<Ladder> getLadder() {
		return new ArrayList<Ladder>(ladders.values());
	}
}
