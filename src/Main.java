public class Main {
    public static void main(String[] args) {

        Stack num = new Stack();

        System.out.println(num.isEmpty());

        num.push(5);
        num.push(32);
        num.push(3);

        System.out.println(num.isFull());

        num.pop();
        num.push(5);
        num.push(8);

        System.out.println(num.isFull());

        System.out.println(num.peek());


    }
}