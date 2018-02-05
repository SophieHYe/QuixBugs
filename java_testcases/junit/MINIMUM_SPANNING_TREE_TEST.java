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
			
			for(WeightedEdge  edge :actual) {
				System.out.println(edge.node1.getValue()+" "+edge.node2.getValue());
			}
		122
			assertEquals("7", actual.toString());
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Arguments are illegal!");
		}
	}
}
