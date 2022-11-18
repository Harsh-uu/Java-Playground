//Example of an abstract class that has abstract and non-abstract methods  
abstract class child{  
    child(){System.out.println("child is playing");}  
    abstract void run();  
    void goes(){System.out.println("child goes to mom");}  
  }  
 //Creating a Child class which inherits Abstract class  
  class mom extends child{  
  void run(){System.out.println("mom is calling");}  
  }  
 //Creating a Test class which calls abstract and non-abstract methods  
  class tract{  
  public static void main(String args[]){  
   child obj = new mom();  
   obj.run();  
   obj.goes();  
  }  
 }  