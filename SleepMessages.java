public class SleepMessages{

	public static void main(String...args)throws InterruptedException{
	
		String[]messages = {
		"message one",
		"message two",
		"message three",
		"message four"
		};

		for(int i =0; i< messages.length;i++){
			System.out.println(messages[i]);
			Thread.sleep(4000);
			if(Thread.interrupted()){System.out.println("we've been interrupted.");return ;}
		}
	}

}
