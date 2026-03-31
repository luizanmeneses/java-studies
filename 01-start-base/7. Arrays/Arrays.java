public class Arrays {
    public static void main(String[] args) {
        double [] temperatures = new double [10];

    //For inform values
        temperatures[0] = 33.1;
        temperatures[1] = 32;
        temperatures[2] = 31.8;
        temperatures[3] = 31;

        System.out.println(temperatures[2]);

    //To know the lenght of this array
        System.out.println(temperatures.length);

    
        for (int i = 0; i < temperatures.length; i++){
            System.out.println("Temperature value day " + (i+1) + " is: " + temperatures[i]);
        }

    //Use for more quickly to arrays
        for (double temp: temperatures){
            System.out.println(temp); //Here, we don't have the position, just the value.
        }

    }
}