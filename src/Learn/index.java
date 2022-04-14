package Learn;

public class index {

	public static void main(String[] args) {
		
		String s = "The last airbender is known as the avatar. His name is Aang. He has a flying bison whose name is appa";
	    System.out.println(s.indexOf("Aang"));
	    System.out.println(s.substring(55));
		
		String st = "Naruto loves to learn new jutsu. Kakashi is his master. But he is in love with Sasuke";
		
		    
        int count = 0;    
            
            
        for(int i = 0; i < st.length(); i++) {    
            if(st.charAt(i) == 'a')    
                count++;    
        }    
            
           
        System.out.println("Total number of a: " + count);
		
		String x = "This is sparta!!!";
		String y = "This is sparta!!!";
		
		System.out.println(x.equals(y));
		
	}
}