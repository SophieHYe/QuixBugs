package java_testcases.junit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import java_programs.SHORTEST_PATH_LENGTHS;
import java_programs.Node;

public class SHORTEST_PATH_LENGTHS_TEST {

	
	@Test
	public void test1() {
		Map<List<Integer>, Integer> length_by_edge = new HashMap<List<Integer>, Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(0);
		list1.add(1);
		length_by_edge.put(list1,3);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		length_by_edge.put(list2,5);
		
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(2);
		list3.add(3);
		length_by_edge.put(list3,-2);
		
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(3);
		list4.add(4);
		length_by_edge.put(list4,7);
		
		
		Map<List<Integer>,Integer> result = SHORTEST_PATH_LENGTHS.shortest_path_lengths(5, length_by_edge);
		Set<List<Integer>> sets = result.keySet();		
		
		
	}
}
