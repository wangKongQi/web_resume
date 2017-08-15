package work;

import java.util.Random;

public class Project {
/*思路：
1、首先声明一个6行5列的数组
2、先循环行，再循环列，再赋值为随机数（使用 Random 类）
3、再遍历
 * 
 */
	//随机生成二维数组
	public static String[][] array(){
		String[][] array = new String[3][3];
		for ( int j = 0; j < 3; j++ )
		{
			String a = "";
			String b = "", c = "";
			while (a == b || a == c || b == c)
			{
				a = String.valueOf((int) ( Math.random () * 100 ));
				b = String.valueOf((int) ( Math.random () * 100 ));
				c = String.valueOf((int) ( Math.random () * 100 ));
			}
			array[j][0] = a;
			array[j][1] = b;
			array[j][2] = c;
		}
		return array;
	}
	//二维数组转换成json
	public static void changeData(){
		String[][] data =array();
//		System.out.println("{");
//		for ( String[] is : data )
//		{
//			System.out.print("{");
//			for ( String i : is )
//			{
//				System.out.print (i+",");
//			}
//			System.out.println ("}");
//		}
//		System.out.println("}");
		StringBuffer sb = new StringBuffer();
		boolean first = true;
		sb.append("[");
		 for (int i = 0; i < data.length; i++) {
	            String[] blogItem = data[i];
	            if (!first) {
	                sb.append(",");
	            }
	            sb.append("{");
	            sb.append("postdate: '" + blogItem[0] + "', ");
	            sb.append("title: '" + blogItem[1] + "', ");
	            sb.append("author: '" + blogItem[2] + "' ");
	            sb.append("}");
	            first = false;
	        }
	        sb.append("]");
	        System.out.println(sb.toString());
		
	}
	public static void main ( String[] args )
	{
		changeData();
	}
	
}
