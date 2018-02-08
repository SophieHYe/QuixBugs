package java_testcases.junit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import java_programs.MINIMUM_SPANNING_TREE;
import java_programs.Node;
import java_programs.WeightedEdge;

public class MINIMUM_SPANNING_TREE_TEST {

	/**
	 * Case 1: Simple tree input.
	 * Output: (1, 2) (3, 4) (1, 4)
	 */
	@Test
	public void minimum_spanning_tree_test1() {
		try {
			List<WeightedEdge> weightedEdges = new ArrayList<WeightedEdge>();
			WeightedEdge weightedEdge1 = new WeightedEdge(new Node("1"), new Node("2"), 10);
			WeightedEdge weightedEdge2 = new WeightedEdge(new Node("2"), new Node("3"), 15);
			WeightedEdge weightedEdge3 = new WeightedEdge(new Node("3"), new Node("4"), 10);
			WeightedEdge weightedEdge4 = new WeightedEdge(new Node("1"), new Node("4"), 10);
			weightedEdges.add(weightedEdge1);
			weightedEdges.add(weightedEdge2);
			weightedEdges.add(weightedEdge3);
			weightedEdges.add(weightedEdge4);

			Set<WeightedEdge> actual = MINIMUM_SPANNING_TREE.minimum_spanning_tree(weightedEdges);
			String resultStr = "";
			for(WeightedEdge  edge :actual) {
				resultStr += "("+edge.node1.getValue()+","+edge.node2.getValue()+")"+" "; 
				System.out.println(edge.node1.getValue()+" "+edge.node2.getValue());
			}
			assertEquals("(1, 2) (3, 4) (1, 4) ", resultStr);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Arguments are illegal!");
		}
	}
	
	
	
	/**
	 * Case 3: Minimum spanning tree input.
	 * Output: (1, 2) (1, 3) (2, 4)
	 */
	@Test
	public void minimum_spanning_tree_tes3() {
		try {
			List<WeightedEdge> weightedEdges = new ArrayList<WeightedEdge>();
			WeightedEdge weightedEdge1 = new WeightedEdge(new Node("1"), new Node("2"), 6);
			WeightedEdge weightedEdge2 = new WeightedEdge(new Node("1"), new Node("3"), 1);
			WeightedEdge weightedEdge3 = new WeightedEdge(new Node("2"), new Node("4"), 2);

			weightedEdges.add(weightedEdge1);
			weightedEdges.add(weightedEdge2);
			weightedEdges.add(weightedEdge3);

			Set<WeightedEdge> actual = MINIMUM_SPANNING_TREE.minimum_spanning_tree(weightedEdges);
			String resultStr = "";
			for(WeightedEdge  edge :actual) {
				resultStr += "("+edge.node1.getValue()+","+edge.node2.getValue()+")"+" "; 
				System.out.println(edge.node1.getValue()+" "+edge.node2.getValue());
			}
			assertEquals("(1, 2) (1, 3) (2, 4) ", resultStr);
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Arguments are illegal!");
		}
	}
	
}
