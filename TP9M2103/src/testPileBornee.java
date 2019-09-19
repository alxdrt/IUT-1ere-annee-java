import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Test;


public class testPileBornee {
	
	@Test
	public void test1() {
		PileBornee<Integer> test = new PileBornee<Integer>(2);
		assertTrue(test.isEmpty());
	}

	@Test
	public void test2() throws FullStack {
		PileBornee<Integer> test = new PileBornee<Integer>(2);
		test.push(11);
		assertFalse(test.isEmpty());
	}

	@Test
	public void test3() {
		PileBornee<Integer> test = new PileBornee<Integer>(4);
		assertEquals(4, test.getMaxSize());
	}

	@Test
	public void test4() throws FullStack {
		PileBornee<Integer> test = new PileBornee<Integer>(3);
		test.push(44);
		assertEquals(3, test.getMaxSize());
	}

	@Test
	public void test5() {
		PileBornee<Integer> test = new PileBornee<Integer>(15);
		assertEquals(0, test.getSize());
	}

	@Test
	public void test6a() throws FullStack {
		PileBornee<Integer> test = new PileBornee<Integer>(1);
		test.push(30);
		assertEquals(test.getSize(), test.getMaxSize());
	}

	@Test
	public void test6b() throws FullStack {
		PileBornee<Integer> test = new PileBornee<Integer>(6);
		test.push(3);
		test.push(20);
		assertEquals(1+1, test.getSize());
	}

	@Test
	public void test7(){
		PileBornee<Integer> test = new PileBornee<Integer>(1);
		assertFalse(test.isFull());

	}

	@Test
	public void test8a() throws FullStack{
		PileBornee<Integer> test = new PileBornee<Integer>(2);
		test.push(33);
		test.push(29);
		assertTrue(test.isFull());
	}

	@Test
	public void test8b() throws FullStack{
		PileBornee<Integer> test = new PileBornee<Integer>(5);
		test.push(69);
		assertFalse(test.isFull());
	}

	@Test 
	public void test9(){
		PileBornee<Integer> test = new PileBornee<Integer>(5);
		try {
			test.top();
		}
		catch (EmptyStackException e) {
			System.out.println(e);
		}
	}
	@Test 
	public void test10() throws FullStack{
		PileBornee<Integer> test = new PileBornee<Integer>(5);

		test.push(1);
		try {
			assertEquals(1, test.top());
		}
		catch (EmptyStackException e) {
			System.out.println(e);
		}

		test.push(3);
		try {
			assertEquals(3, test.top());
		}
		catch (EmptyStackException e) {
			System.out.println(e);
		}
		test.push(5);
		try {
			assertEquals(5, test.top());;
		}
		catch (EmptyStackException e) {
			System.out.println(e);
		}

	}

	@Test
	public void test11(){
		PileBornee<Integer> test = new PileBornee<Integer>(0);
		try {
			test.pop();
		} catch (EmptyStackException e) {

			e.printStackTrace();
		}
		assertEquals(0,test.getSize());
		assertEquals(0,test.getMaxSize());
	}

	@Test
	public void test12a() throws FullStack{
		PileBornee<Integer> test = new PileBornee<Integer>(2);
		try {
			test.pop();
		} catch (EmptyStackException e) {

			e.printStackTrace();
		}
		assertEquals(0,test.getSize());
		assertEquals(2,test.getMaxSize());
		test.push(1);
		try {
			test.pop();
		} catch (EmptyStackException e) {

			e.printStackTrace();
		}
		assertEquals(0,test.getSize());
		test.push(1);
		test.push(5);
		try {
			test.pop();
		} catch (EmptyStackException e) {

			e.printStackTrace();
		}
		assertEquals(1,test.getSize());


	}

}




