public class Distance {

    public static void main(String[] args) {

        int a;
        a = -1;
        if (a >= 0 && a < 5){
            System.out.println("You ran less than 4 miles, here is $2");
        } else if (a >= 5 && a < 16){
            System.out.println("You ran between 5 and 15 miles, here is $5");
        } else if (a >= 16 && a < 26){
            System.out.println("You ran between 16 and 25 miles, here is $10");
        } else if (a >= 26 && a < 50){
            System.out.println("You ran between 26 and 50 miles, here is $15");
        } else if (a > 50){
            System.out.println("You ran more than 50 miles, here is $20");
        }




    }
}

