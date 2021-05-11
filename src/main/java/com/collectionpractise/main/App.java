package com.collectionpractise.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.collectionpractise.model.City;
import com.collectionpractise.model.State;
import com.collectionpractise.util.StateNotExistException;

/**
 * Store details of all cities/towns in a state for all states in India .
 * It should be possible to fetch cities/towns belonging only to specific state .
 * all cities/towns of state need to be stored in acending order of population
 * 
 * 
Exception-In continuation to collections assignment , 
create an Exception class and where user queries for details of any specific state ,
and if state doesn't exist throw above Exception .use try catch ,
in this scenario see that you propagate the exception using throws across  
different methods /classes /packages,and handle it in main method
 *
 */
public class App {
	
	static HashMap<String, State> ListStatesInIndia = new HashMap();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		try {
			TreeSet<City> cityListOfMaharashtra = new TreeSet<City>();
			cityListOfMaharashtra.add(new City("pune", 411001,500000));
			cityListOfMaharashtra.add(new City("Mumbai", 400008,1000000));
			cityListOfMaharashtra.add(new City("Nashik", 422001,300000));
			cityListOfMaharashtra.add(new City("Baramati", 413102,150000));
			
			TreeSet<City> cityListOfKarnataka = new TreeSet<City>();
			cityListOfKarnataka.add(new City("Hassan", 573201,500000));
			cityListOfKarnataka.add(new City("Bangalore", 560002,800000));

			ListStatesInIndia.put("Maharashtra", new State("Maharashtra", "Mumbai", cityListOfMaharashtra));
			ListStatesInIndia.put("Karnataka", new State("Karnataka", "Bangalore", cityListOfKarnataka));
			ListStatesInIndia.put("Maharashtra", new State("Maharashtra", "Mumbai", cityListOfMaharashtra));

			Set statesInIndia = ListStatesInIndia.entrySet();
			Iterator<Map.Entry> iterator = statesInIndia.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
			System.out.println("Enter state to get all cities ");
			String state = sc.nextLine();
			// get cities belonging specific state
			getCities(state);
			
		} catch (StateNotExistException stateNotExistException) {
			System.out.println(stateNotExistException.getMessage());
		} catch(Exception exception)
		{
			System.out.println(exception.getMessage());
		}
		finally {
			sc.close();
		}

	}

	private static void getCities(String state) throws StateNotExistException {
		// TODO Auto-generated method stub
	  if(ListStatesInIndia.get(state)!=null)
	  {
		  System.out.println(ListStatesInIndia.get(state));
	  }else
	  {
		 throw new StateNotExistException("State doesn't exist"); 
	  }
	}

	private static void Hello()
	{
		System.out.println("Hello!!!!!!");
	}
}
