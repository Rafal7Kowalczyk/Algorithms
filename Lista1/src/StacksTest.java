import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class StacksTest extends TestCase {
	
	public void topOnEmptyStuck() {
		
	}
	
	public void topWhenOnlyOneElement(){
		
	}
	
	public void topWhenMaxNumberOfElements() {
		
	}
	
	public void popOnEmptyStack() {
		
	}
	
	public void popWhenOneElement() {
		
	}
	
	public void popWhenMaxNumberOfElements() {
		
	}
	
	public void pushOnEmptyStack() {
		
	}
	
	public void pushOnMaxElementsStack(){
		
	}
	
	public void maxOnEmptyStack() {
		
	}
	
	public void maxWhenOnlyOneElement(){
		
	}
	
	public void maxWhenAllTheSameValues() {
		
	}
	

	public void testPush() {
		Stacks stacks = new Stacks(20);
		stacks.push(10);
		assertEquals(10, stacks.tab[0]);
		stacks.push(20);
		assertEquals(20, stacks.tab[1]);
	}

	
	public void testTop() {
		Stacks stacks1 = new Stacks(25);
		stacks1.push(10);
		stacks1.push(20);
		stacks1.push(7);
		assertEquals(7, stacks1.tab[2]);
	}


	public void testPop() {
		Stacks stacks1 = new Stacks(30);
		stacks1.pop();
		
	}

	
	public void testMax() {
		Stacks stacks2 = new Stacks(25);
		stacks2.push(10);
		stacks2.push(20);
		stacks2.push(7);
		assertEquals(20, stacks2.tab[1]);
	}

}
