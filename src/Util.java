import java.util.ArrayList;


public class Util {
	public static ArrayList<Integer> popList(Integer[] a){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(Integer x: a){
			temp.add(x);
		}
		return temp;
	}
	public static Integer diceRoll(){
		return (int)Math.round((Math.random() * 6));
	}
}
