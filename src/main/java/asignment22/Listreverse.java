package asignment22;

import java.awt.List;

import java.util.ArrayList;

public class Listreverse {
	
		public ArrayList<Object> listOperations(ArrayList<Object> al1)
		{
	    
		ArrayList<Object> al2=new ArrayList<Object>();
		for(int j=al1.size()-1;j>=0;j--)
			{
			al2.add(al1.get(j));
			}
		return al2;	
		}
	
}
