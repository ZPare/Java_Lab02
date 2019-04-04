package Zoe_Pare_Exercise02;

public class Lotto {
//An array
    private int[] array;
//Constructor that generates randomly populates the array
    public Lotto()
    {
//Array that will hold 3 int values
        array = new int[3];
       
        for (int i = 0; i <3 ; i++) {
//Random number generated
            int number = (int) (Math.random() * (9 - 1)+ 1);
            array[i] = number;
        }
}
	public int[] returnArray() {
		return array;
	}
}
