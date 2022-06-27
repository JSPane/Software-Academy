
public class results {
	
	public void method1(int physics, int chemistry, int biology, int total, int percentage) {
		System.out.println("Physics score is: " + physics);
		System.out.println("Chemistry score is: " + chemistry);
		System.out.println("Biology score is: " + biology);
		
		total = physics + chemistry + biology;
		
		System.out.println("Total score is: " + total);
		
		results b = new results();
		
		b.method2(total, percentage);
		
	}
	
	public void method2(int total, int percentage) {
		percentage = (total * 100) / 450;
		
		System.out.println("Total percentage is: " + percentage);
		
		if (percentage >= 60) {
			System.out.println("You passed!");
			
		} else {
			System.out.println("You failed!");
			
		}
		
	}
	
}
