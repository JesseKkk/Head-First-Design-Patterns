

//延迟实例化
public class Singleton
{
	private static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();
		return uniqueInstance;
	}
}

//getInstance()方法同步实例化
public class Singleton
{
	private static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static synchronized Singleton getInstance()
	{
		if (uniqueInstance == null)
		{
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}

//急切实例化
public class Singleton
{
	private static Singleton uniqueInstance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		return uniqueInstance;
	}
}

//双重检查加锁
public class Singleton
{
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		if (uniqueInstance == null) 
		{
			synchronized (this) 
			{
				if (uniqueInstance == null) 
				{
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}