package exceptionHandling;

public class ExceptionExample {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(50/2);
		try {
			System.out.println(10/0);}
		catch(Exception e) {
			System.out.println("Exception occured");//if exception occurs catch block is executed
			}
		finally {
			System.out.println("hello");//finally executes every time
		}
		System.out.println("123");
		Thread.sleep(5000);
		System.out.println("456");
			
			
		}

	}


