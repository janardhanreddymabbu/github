package assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Assin2_EX3 {
	public static void main(String[] args) throws IOException {

		File file = new File("student.txt");
		FileReader fileRead = new FileReader(file);

		BufferedReader br = new BufferedReader(fileRead);
		// BufferedReader br2 = new BufferedReader(fileRead2);
		String line1 = "";
		String line2 = "";
		Float totalMars = 0f;
		Map<String, Student> map = new HashMap<String, Student>();
		Integer count = 0;
		while ((line1 = br.readLine()) != null) {
			String[] stud = line1.split(" ");
			//System.out.println(stud[0] + " " + stud[1]);
			count = 0;
			totalMars = 0f;
			FileReader fileRead2 = new FileReader(file);
			BufferedReader br2 = new BufferedReader(fileRead2);
			while ((line2 = br2.readLine()) != null) {
				String[] stud2 = line2.split(" ");
				if (stud[0].equalsIgnoreCase(stud2[0])) {
					totalMars = totalMars + Integer.parseInt(stud2[1]);
					count++;
				}
			}
			Student st1 = new Student();
			if(map.isEmpty()){
				st1.setTotalMarks(totalMars / count);
				st1.setRank(count);
				map.put(stud[0], st1);
			} else if(!map.containsKey(stud[0])){
				st1.setTotalMarks(totalMars / count);
				st1.setRank(count);
				map.put(stud[0], st1);
				//map.put(stud[0], st1);
			}
			
		}
		int students = 0;
		float total = 0;
		double sd =0;
		
		List<Map.Entry<String, Student>> list = new ArrayList<Map.Entry<String, Student>>(
				map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Student>>() {

			@Override
			public int compare(Entry<String, Student> o1,
					Entry<String, Student> o2) {
				return (o2.getValue().getTotalMarks()).compareTo(o1.getValue().getTotalMarks());
			}
		});
		Map<String, Student> sortedMap = new LinkedHashMap<>();
		//int i = 0;
		for (Map.Entry<String, Student> entry : list) {
			Student st = new Student();
			st.setRank(entry.getValue().getRank());
			st.setTotalMarks(entry.getValue().getTotalMarks());
			sortedMap.put(entry.getKey(), st);
		}
		System.out.println("Print based on merit order:");
		int k =0;
		for (Map.Entry<String, Student> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey()+" "+ entry.getValue().getRank() +" "+entry.getValue().getTotalMarks());
		k++;
		}
		TreeMap<String, Student> treeMap = new TreeMap<>(sortedMap);
		System.out.println("Print based on Alphabetic order:");
		for(Map.Entry<String, Student> entry1 : treeMap.entrySet()){
			System.out.println(entry1.getKey()+" "+ entry1.getValue().getRank() +" "+entry1.getValue().getTotalMarks());
		}
		for(Map.Entry<String, Student> map1 : map.entrySet()){
			if(map1.getValue().getTotalMarks()!=null){
				total = total+Float.parseFloat(map1.getValue().getTotalMarks().toString());
				
			}
			students++;
		}
		
		for(Map.Entry<String, Student> map1 : map.entrySet()){
			if(map1.getValue().getTotalMarks()!=null){
				//total = total+Float.parseFloat(map1.getValue().getTotalMarks().toString());
				
				//squareSum += Math.pow(x[i]-mean, 2);
				
				sd = sd +  Math.pow((total-Float.parseFloat(map1.getValue().getTotalMarks().toString())),2 ) ;
				System.out.println(map1.getValue());
			}
			
			students++;
		}
		
		System.out.println("total students :" +k);
		System.out.println("avg students :"+ total/map.size());
		float sqareroot = (float) (sd/map.size());
		System.out.println("Standarddeviation students :"+ (Math.sqrt(sqareroot)));
		//System.out.println(map);
		
		
	}
	
	

}


