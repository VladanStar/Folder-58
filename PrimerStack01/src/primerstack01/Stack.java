package primerstack01;

public class Stack {

    private int[] elementi;
    private int headPrvi;

    public Stack() {
        elementi = new int[3];
        headPrvi = 0;
    }

    public Stack(int[] elementi, int headPrvi) {
        this.elementi = elementi;
        this.headPrvi = headPrvi;
    }

    private void checkCapacity() {
        if (headPrvi == elementi.length - 1) {
            System.out.println("Realokacija niza duzine " + elementi.length + " na " + 2 * elementi.length + " ...");
            elementi = java.util.Arrays.copyOf(elementi, 2 * elementi.length);
        }

    }

    public void push(int val) {
        checkCapacity();
        elementi[headPrvi++] = val;
    }

    public int top() {
        return elementi[headPrvi];
    }

    public int size() {
        return headPrvi;
    }
    public int capacity(){
    
        return elementi.length;
    }
    public void showContent(){
        System.out.println("size: " + headPrvi+ " capacity " + elementi.length );
        for(int i = 0; i<headPrvi;i++){
            System.out.println(" " + elementi[i]);
        
        }
    }
    public int pop() {
		if (headPrvi > 0) {
			headPrvi--;
			return elementi[headPrvi+1];
		} else {
			System.out.println("Stack underflow...");
			return 0;
		}
	}
}
