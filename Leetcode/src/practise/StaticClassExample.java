package practise;

public final class  StaticClassExample {
	
	private static String msg = "GeeksForGeeks";
	  
    public static String getMsg() {
		return msg;
	}

	public static void setMsg(String msg) {
		StaticClassExample.msg = msg;
	}

	// Static nested class
    public static class NestedStaticClass {
  
        // Only static members of Outer class
        // is directly accessible in nested
        // static class
        public static void printMessage()
        {
  
            // Try making 'message' a non-static
            // variable, there will be compiler error
            System.out.println(
                "Message from nested static class: "
                + msg);
        }
    }
  
    // Non-static nested class -
    // also called Inner class
    public class InnerClass {
  
        // Both static and non-static members
        // of Outer class are accessible in
        // this Inner class
        public void display()
        {
            System.out.println(
                "Message from non-static nested class: "
                + msg);
        }
    }

}
