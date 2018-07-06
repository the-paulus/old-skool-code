class TestThread extends Thread
{
  TestThread(String newName)
  {
    setName(newName);
  }

  public void run()
  {
    while(true)
    {
      System.out.println(Thread.currentThread().getName());
	  }
  }
}
