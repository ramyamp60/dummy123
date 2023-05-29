package Groups;

import org.testng.annotations.Test;

public class data1 {
	@Test(groups = {"ramya"})
	public void test1()
	{
		System.out.println("hai");
	}
	@Test(groups = {"ramya","nuthan"})
	public void test2()
	{
		System.out.println("hello");
	}
	@Test(groups = {"nuthan"})
	public void test3()
	{
		System.out.println("bye");
	}
	@Test(groups = {"tashvik"})
	public void test4()
	{
		System.out.println("tata");
	}
}
