package ch03;

public class Method1Demo {
    public static void main(String[] args) {
        // sum = sum(0, 10);
    	
    	Method1Demo m = new  Method1Demo();
    
        System.out.println("1부터 10까지의 합은? " +  m.sum(0, 10));
        System.out.println("1부터 100까지의 합은? " +  m.sum(0, 100));
        System.out.println("1부터 1000까지의 합은? " +  m.sum(0, 1000));
       
        
    }
    
    public int sum(int start, int end) {
    	
        int sum = 0;

        for (start = 0; start <= end; start++) {
            sum = sum + start;
        }
    	
    	return sum;
    }
}
