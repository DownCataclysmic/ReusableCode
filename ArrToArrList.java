public static void arrToArrListString() { 
		String[] ArrName = {"a", "b", "c", "d", "e"};  //String Array to ArrayList Conversion
		ArrayList<String> ArrListName = new ArrayList<>(Arrays.asList(ArrName));

public static void arrToArrListInteger() {
		Integer[] ArrName = {1, 2, 4, 4, 5};  
		ArrayList<Integer> ArrListName = new ArrayList<>(Arrays.asList(ArrName));
		
		for(Integer i : ArrListName) 
			System.out.println(i);