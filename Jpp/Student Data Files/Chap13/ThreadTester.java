class ThreadTester
{
  public static void main(String args[])
  {
    TestThread threadA = new TestThread("One");
    TestThread threadB = new TestThread("Two");

    threadA.start();
    threadB.start();
  }
}
