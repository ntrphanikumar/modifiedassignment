package asignment22;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ListreverseTest {

	@Test
	public void test() {
		Listreverse lr=new Listreverse();
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(12);
		al.add(14);
		al.add(7);
		al.add(10);
		ArrayList<Object>al2=lr.listOperations(al);
		ArrayList<Object> al3=new ArrayList<Object>();
		al3.add(10);
		al3.add(7);
		al3.add(14);
		al3.add(12);
		assertTrue(al3.equals(al2));
	}

}
