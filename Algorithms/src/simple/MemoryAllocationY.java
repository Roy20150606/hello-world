package simple;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoryAllocationY {

	public static void main(String[] args) throws IOException{
	
		List<String> input = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String temp = "";
		String array[];
		System.out.println("�ܾ �Է��ϼ���, x ġ�� ����: ");
		int i =0;
		
		while(true){
			temp = scan.next();
			if(temp.equals("x")){
				break;
			}else{
				input.add(temp);
				i++;
			}
		}
		System.out.println("input finished");
		
		array = new String[input.size()];
		for(i=0; i <input.size(); i++){
			array[i]  = input.get(i);
		}
		
		System.out.println("�����Ҵ�� �迭 ���");
		for(i=0; i <array.length; i++){
			System.out.println(array[i]);
		}
	}
}
