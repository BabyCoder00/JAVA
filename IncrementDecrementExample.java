public class IncrementDecrementExample {
    public static void main(String[] args) {
        int num = 10;
        
        System.out.println("Increment and Decrement Operators:");
        System.out.println("Original num: " + num);
        
        // Post-increment
        System.out.println("Post-increment (num++): " + (num++));
        System.out.println("After post-increment: " + num);
        
        // Pre-increment
        System.out.println("Pre-increment (++num): " + (++num));
        
        // Post-decrement
        System.out.println("Post-decrement (num--): " + (num--));
        System.out.println("After post-decrement: " + num);
        
        // Pre-decrement
        System.out.println("Pre-decrement (--num): " + (--num));
    }
}
