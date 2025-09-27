package thanu.java;

public class loop {

		public static void main (String[]args) {
		int[] a = {-3,-2,0,5,9};
		int Firstpos = -1;
		for(int v : a) {
			if(v>0) {
				Firstpos = v;
				break;
			}
		}
		System.out.println(Firstpos);
		}
	}


