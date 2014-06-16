import java.awt.Color;
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
	public static boolean allTerritoriesTaken(Territory[] a){
		for(int i = 0; i < a.length; i++){
			if(a[i].getOwnedBy().getPlayCol() == new Color(0,0,0)){
				return false;
			}
		}
		return true;
	}
}
