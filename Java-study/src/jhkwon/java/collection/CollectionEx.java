package jhkwon.java.collection;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.HashMap;

public class CollectionEx{
	public static void main(String... args){
		//ArrayList: add(object): add(index, object), clear(), contains(object), get(index), indexOf(object), isEmpty(), 
		//remove(index), remove(object), set(index, object), size(),toArray()
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("hello");
		alist.add("I am John.");
		alist.add(1,".");
		
		out.println(alist.contains("hello"));
		out.println(alist.get(2));
		out.println(alist.indexOf("I am John."));
		alist.set(2,"Nice to meet you.");

		Iterator<String> iter = alist.iterator();
		while(iter.hasNext())
			out.println(iter.next());

		alist.remove(2);
		alist.remove("hello");

		alist.clear();
		out.println(alist.isEmpty());
		out.println(alist.size());


		//HashMap: get(key),put(key,value),remove(key),size(),
		//containsKey(Object),containsValue(Object),keyset(),values(), clear()
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Boa");
		map.put(2, "JYP");
		map.put(3, "YG");
		out.println(map);

		map.remove(2);
		out.println(map.containsKey(2));
		out.println(map.containsValue("Boa"));
		map.put(4, "SM");

		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			out.println(it.next());
		}
		Collection<String> collection = map.values();
		Iterator it2= collection.iterator();
		while(it2.hasNext()){
			out.println(it2.next());
		}

		map.clear();

		//HashMap object
		HashMap<Player, Integer> hm2 = new HashMap<Player,Integer>();
		hm2.put(new Player(1,"John"),50);
		hm2.put(new Player(2,"Mary"),100);
		hm2.put(new Player(3,"Chris"),150);
		int result = hm2.get(new Player(1,"Jo"));
		out.println(result);

		//HashSet: add (Element), clear(), contains(object), isEmpty(), iterator(), remove(object), size()
		// HashSet<Integer> hs = new HashSet<Integer>();

		//TreeSet:
		// Set<Integer> ts = new TreeSet<Integer>(hs);
	}

}

class Player {
		private int id;
		private String playerName;

		public Player(int id, String playerName){
			this.id = id;
			this.playerName = playerName;
		}

		@Override
		public String toString(){
			return "id: " + id + ", player name: " + playerName;
		}

		@Override
		public boolean equals(Object other){
			if (!(other instanceof Player))
				return false;
			if (other == this)
				return true;
			return this.id == ((Player) other).id;
		}

		@Override
		public int hashCode() {
			return new Integer(id).hashCode();
		}
	}