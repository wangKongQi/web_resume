package work;

import java.util.Random;

public class Project {
/*˼·��
1����������һ��6��5�е�����
2����ѭ���У���ѭ���У��ٸ�ֵΪ�������ʹ�� Random �ࣩ
3���ٱ���
 * 
 */
	//������ɶ�ά����
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
	//��ά����ת����json
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
