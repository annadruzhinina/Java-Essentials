package test;

public class MyClass { //class declaration, has at list one constractor
    // fields - parameters - variables
    //premitive dataTypes: int, double, char, boolean, long, float, short, byte ⬇️

    int i; //primitive variable, here we only declareted it
    //we can have multy constractors
    //constructor ⬇️ is run when i create an object of the class
    public MyClass(){
        i=6;
    }

    //constructor ⬇️
    public MyClass(int i){
        this.i = i;
    }
    //the main method is always static
    public static void main(String[] args) {
        MyClass myClass = new MyClass(7);
        // myClass.initialize();
		System.out.println(myClass.i);

	}
     //methods ⬇️
    public void initialize(){
        //public method is available for the entire program
        i=5;
    }
}
