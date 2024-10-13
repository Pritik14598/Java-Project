//package javaProgram;
//
//class Sweet
//{
//   void price()
//   {
//	   System.out.println("sweet=$10");
//   }
//   
//   class Sugar extends Sweet
//   {
//	   void price()
//	   {
//		   super.price();//it will be call the method of parent class
//		   				// is inheritance class
//		   System.out.println("sweet=$20");
//	   }
//   }
// public class Inheritance
// {
//   public static void main(String[] args) 
//   {
//	  Sugar su = new Sugar();
//	  su.price();
//   }
//	
// }
//}








package javaProgram;

class Sweet {
    void price() {
        System.out.println("sweet=$10");
    }
}

class Sugar extends Sweet {
    
    void price() {
        super.price(); // Calls the method of the parent class
        System.out.println("sweet=$20");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Sugar su = new Sugar();
        su.price();
    }
}