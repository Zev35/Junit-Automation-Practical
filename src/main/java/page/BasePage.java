package page;

import java.util.Random;

public class BasePage {
	
public static int generateRandomNumber(int boundry) {
	
	Random rnd = new Random();
	int generatednumber = rnd.nextInt(boundry);
	return generatednumber;
	
}	



}
