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
			if(a[i].getOwnedBy().getPlayCol().equals(new Color(0,0,0))){
				return false;
			}
		}
		return true;
	}
	public static boolean gameOver(Territory[] a){
		Territory temp = new Territory();
		temp = a[0];
		for(Territory I: a){
			if(!temp.getOwnedBy().equals(I.getOwnedBy())){
				return false;
			}
		}
		return true;
	}
}
