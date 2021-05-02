package PracticeProgramsCoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import scala.math.Integral;

public class CaesarChiperNumberShift {

	public static void main(String[] args) {
		//1,2,3,4,5
		//5,1,2,3,4
		//4,5,1,2,3

		Integer[] arr= {1,2,3,4,5};
		//rot(arr, 1);
		rotateCipher(arr, 2);
	}
	
	public static void rot(Integer[] arr, int n) {
		List<Integer> lt=new ArrayList<>(Arrays.asList(arr));
		List<Integer> ltnew=new ArrayList<>();
		
		for(int i=0; i<lt.size(); i++) {
			if(n>0 && i<n) {
				ltnew.add(lt.get(lt.size()-n));
				lt.remove(lt.get(lt.size()-n));
				//break;
			}
			ltnew.add(lt.get(i));
		}
		System.out.println(lt);
		System.out.println(ltnew);
	}
	
	
	public static void rotateCipher(Integer[] arr, int n) {
		final List<Integer> lt=new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		List<Integer> givenlt=new ArrayList<>(Arrays.asList(arr));
		List<Integer> newlt=new ArrayList<>();
		
		//System.out.println(lt.indexOf(lt.get(6)));
		
		for(int i=0; i<givenlt.size(); i++){
			Integer position=lt.indexOf(givenlt.get(i));
			System.out.println("position:"+position);
			
			Integer val=(position + n) % 10;
			System.out.println("val"+val);
			
			int repVal=lt.get(val);
			System.out.println("repVal"+repVal);
			
			newlt.add(repVal);
		}	
		System.out.println(newlt);
	}
	
}
