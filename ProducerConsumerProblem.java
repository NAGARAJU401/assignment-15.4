package problem;



//package : Package is name that organizes a set of related classes and interfaces similar to  
//different folders on my computer
public class ProducerConsumerProblem {
	//public : members which can access as public,public members are visible to all other classes.
			//class : is a context of java that are used to create objects and to define object data types and methods.
			//declares a class called evennumbers.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		Data data =new Data(); //created object of the class 
		
		Thread producer = new Thread (new Runnable() {//here creating a producer thread
              //here now we create an object which is runnable interface which is anonymous
			
			public void run() {   //created the run method to execute the thread
				for (int number =0;number<11;number++){ //to execute the condition of put and get method data we are using for loop
					
					data.put(number);//put the data of variable
			
				}
				}
		});
          Thread consumer = new Thread(new Runnable (){
        	  
        	  public void run(){
        		  for (int number =0;number<11;number++){
        			
  					data.get();//get the data of variable 
  				
        		  }
        	  }
          }); 
                     producer.start(); //put the data of producer 
                     consumer.start();//get the data of consumer

	}

}
