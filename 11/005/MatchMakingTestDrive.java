

import java.lang.reflect.*;
import java.util.*;

public class MatchMakingTestDrive 
{
	Hashtable datingDB = new Hashtable();
	
	public static void main(String[] args)
	{
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}
	
	public void drive()
	{
		PersonBean joe = getPersonFromDatebase("joe Javabean");
		PersonBean ownerProxy = getOwenerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Inerests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(7);
		} catch (Exception e)
		{
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
		
		PersonBean nonownerProxy = getNonOwenerProxy(joe);
		System.out.println("Name is " + nonownerProxy.getName());
		try {
			nonownerProxy.setInterests("bowling, Go");
		} catch (Exception e)
		{
			System.out.println("Can't set interests from non owner proxy");
		}
		nonownerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonownerProxy.getHotOrNotRating());		
	}
	
	public MatchMakingTestDrive()
	{
		initializeDatabase();
	}
	
	PersonBean getOwenerProxy(PersonBean person)
	{
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}
	
	PersonBean getNonOwenerProxy(PersonBean person)
	{
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(),
				person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}
	
	PersonBean getPersonFromDatebase(String name)
	{
		return (PersonBean)datingDB.get(name);
	}
	
	void initializeDatabase()
	{
		PersonBean joe = new PersonBeanImpl();
		joe.setName("joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setHotOrNotRating(7);
		datingDB.put(joe.getName(), joe);
		
		PersonBean kelly = new PersonBeanImpl();
		kelly.setName("kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setHotOrNotRating(6);
		datingDB.put(kelly.getName(), kelly);		
		
	}
}