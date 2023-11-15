package basic.classes.innerclasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	    OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);
	    
	    OuterClass2.InnerClass myInner2 = new OuterClass2.InnerClass();
	    System.out.println(myInner2.y);
	    
	    OuterClass3 myOuter3 = new OuterClass3();
	    OuterClass3.InnerClass myInner3 = myOuter3.new InnerClass();
	    System.out.println(myInner3.myInnerMethod());
	}

}
