package classSelenium5;

public class ForLoppsrepeat {
    public static void main(String[] args) {
        // identify a starting point i=0
        //identify when it need to stop i<5
        //i++ increment(add to it) it each time
        for (int i = 0; i < 5; i++) {
            System.out.println(i);//01234
        }
        // for( girl: byFlowers){//for each girl u need to byFlowers


        //we have a list(array ) of cars and we put them in the String (contain sequence of Characters)
        String[] cars = {"BMW", "Bug", "Mersedes"};
        //i<cars.length we ara limiting a loop by numbers of an values(names of the cars) in array
        for (String s : cars) {
            System.out.println(s);//we are printing values (name of the cars) of index[i]
        }
        for (String car : cars) {//for each String name of a car inside of cars list print out name of the car
            System.out.println(car);
            //"BMW" is a first String inside of array String , then car is equal to "BMW", then it is printing out
        }
    }
}
