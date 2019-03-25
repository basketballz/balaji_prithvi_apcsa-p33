class A{
  private int x;

  public A(){
    x=0;
  }
}

class B{
  private int x;

  public B(){
    x=0;
  }
  public String toString(){
    return ""+x;
  }
}


class C{
  private int x;

  public C(){
    x=0;
  }
  public C(int num){
    x=num;
  }
  public String toString(){
    return ""+x;
  }


//////////////////////////////////////////
//runner code in the main of another class
public static void Main (String args[])
{A test = new A();
System.out.println(test);



B runner = new B();
System.out.println(runner);
}


C tester = new C(56);
System.out.println(tester);	
