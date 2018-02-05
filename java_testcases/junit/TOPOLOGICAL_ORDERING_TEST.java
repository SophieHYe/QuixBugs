package java_testcases.junit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import java_programs.TOPOLOGICAL_ORDERING;
import java_programs.Node;

public class TOPOLOGICAL_ORDERING_TEST {

	/**
	 * Case 1: Wikipedia graph
	 * Output: 5 7 3 11 8 10 2 9
	 */
	@Test
	public void test1() {
		Node five = new Node("5");
		Node seven = new Node("7");
		Node three = new Node("3");
		Node eleven = new Node("11");
		Node eight = new Node("8");
		Node two = new Node("2");
		Node nine = new Node("9");
		Node ten = new Node("10");
		
		ArrayList arr5 = new ArrayList<Node>();
		arr5.add(eleven);
		five.setSuccessors(arr5);
		
		ArrayList arr7 = new ArrayList<Node>();
		arr7.add(eleven);
		arr7.add(eight);
		seven.setSuccessors(arr7);
		
		ArrayList arr3 = new ArrayList<Node>();
		arr3.add(eight);
		arr3.add(ten);
		three.setSuccessors(arr3);
		
		ArrayList arr11 = new ArrayList<Node>();
		arr11.add(five);
		arr11.add(seven);
		eleven.setPredecessors(arr11);
		
		
		ArrayList arrout11 = new ArrayList<Node>();
		arrout11.add(two);
		arrout11.add(nine);
		arrout11.add(ten);
		eleven.setSuccessors(arrout11);
		
		ArrayList in8 = new ArrayList<Node>();
		in8.add(seven);
		in8.add(three);
		eight.setPredecessors(in8);
		
		
		ArrayList out8 = new ArrayList<Node>();
		out8.add(nine);
		eight.setSuccessors(out8);
		
		
		ArrayList in2 = new ArrayList<Node>();
		in2.add(eleven);
		two.setPredecessors(in2);
		
		ArrayList in9 = new ArrayList<Node>();
		in9.add(eleven);
		in9.add(eight);
		nine.setPredecessors(in9);
		
		ArrayList in10 = new ArrayList<Node>();
		in10.add(eleven);
		in10.add(three);
		ten.setPredecessors(in10);
		
		ArrayList<Node> nodes = new ArrayList<Node>();
		nodes.add(five);
		nodes.add(seven);
		nodes.add(three);
		nodes.add(eleven);
		nodes.add(eight);
		nodes.add(two);
		nodes.add(nine);
		nodes.add(ten);
		
		ArrayList<Node> results= TOPOLOGICAL_ORDERING.topological_ordering(nodes);
		
		String resultStr="";
		for(Node node : results) {
			resultStr += node.getValue()+" ";
			System.out.println(resultStr);
		}		
		 assertEquals("5 7 3 11 8 10 2 9 ",resultStr );
		
	}
	
	/**
	 * Case 2: GeekforGeeks example
	 * Output: 4 5 0 2 3 1
	 */
	
	
	@Test
	public void test2() {
		Node five = new Node("5");
		Node zero = new Node("0");
		Node four = new Node("4");
		Node one = new Node("1");		
		Node two = new Node("2");	
		Node three = new Node("3");
		
		ArrayList arr5 = new ArrayList<Node>();
		arr5.add(two);
		arr5.add(three);
		five.setSuccessors(arr5);
		
		ArrayList arr4 = new ArrayList<Node>();
		arr4.add(zero);
		arr4.add(one);
		four.setSuccessors(arr4);
		
		
		
		ArrayList arr2 = new ArrayList<Node>();
		arr2.add(five);
		two.setPredecessors(arr2);
		
		
		ArrayList arrout2 = new ArrayList<Node>();
		arrout2.add(three);
		two.setSuccessors(arrout2);
		
		ArrayList in0 = new ArrayList<Node>();
		in0.add(five);
		in0.add(four);
		zero.setPredecessors(in0);
		
		
		ArrayList in1 = new ArrayList<Node>();
		in1.add(four);
		in1.add(three);
		one.setPredecessors(in1);
		
	
		
		ArrayList in3 = new ArrayList<Node>();
		in3.add(two);
		three.setPredecessors(in3);
		
		ArrayList out3 = new ArrayList<Node>();
		out3.add(one);
		three.setSuccessors(out3);
		
		ArrayList<Node> nodes = new ArrayList<Node>();
		nodes.add(zero);
		nodes.add(one);
		nodes.add(two);
		nodes.add(three);
		nodes.add(four);
		nodes.add(five);

		
		ArrayList<Node> results= TOPOLOGICAL_ORDERING.topological_ordering(nodes);
		
		String resultStr="";
		for(Node node : results) {
			resultStr += node.getValue()+" ";
		}		
		 assertEquals("4 5 0 2 3 1 ",resultStr );
		
	}
	
	
	
	
	
}
