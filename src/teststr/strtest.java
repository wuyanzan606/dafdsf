package teststr;

import java.net.*;
import java.io.*;
public class strtest{
	
	public static void main(String args[]){
//		StringBuilder dsString = new StringBuilder();
//		String data[][] = new String[1][];
//		
//		String s="sdnfsdnf[3134]";
//		data[0]=SplitUtil.split(s, ',', '$', '-', '[', ']');
//		System.out.println(data[0].length);
//		System.out.println(data.length);
//		System.out.println(data[0]);
//		
//		for(int i=0,n=data[0].length;i<n;i++){
//			for (int dsIndex = 0; dsIndex < data.length; ++dsIndex) {
//                if (dsIndex > 0) {
//                    dsString.append(',');
//                }
//                dsString.append(data[dsIndex][i]);
//			}
//		}
//		
//		System.out.println(dsString);
		try{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String input=null; 
			
			while(!(input=br.readLine()).equals("quit")){
				System.out.println(input);
			}
			
			br.close();
//			InetAddress inet1=InetAddress.getByName("www.baidu.com");
//			System.out.println(inet1);
//			
//			InetAddress inet2=InetAddress.getByName("127.0.0.1");
//			System.out.println(inet2);
//			
//			String host=inet2.getHostName();
//			System.out.println(host);
//			
//			InetAddress inet3=InetAddress.getLocalHost();
//			System.out.println(inet3);
//			
//			String host1=inet3.getHostName();
//			System.out.println(host1);
//			
//			String ip=inet3.getHostAddress();
//			System.out.println(ip);
			
		}catch(Exception e){}
	}
}