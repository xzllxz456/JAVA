
public class JavaEx02 {
	public static void main(String[] args) {
		
		String name = "홍길동";
		String name1 = "일지매";
		String name2 = "김옥정";
		int age = 20;
		int age1 = 18;
		int age2 = 14;
		String pnum = "010-111-2222";
		String pnum1 = "02-123-4567";
		String pnum2 = "02-345-7890";
		String ad = "경기도";
		String ad1 = "서울";
		String ad2 = "부산";
		boolean man = true;
		boolean female = false;
		double height = 175.12;
		double height1 = 175.12;
		double height2 = 175.12;
		
		
		System.out.println("=================================================");
		System.out.println("\\ name\t age\t man \t phone\t\t heihgt\t address\\");
		System.out.println("=================================================");
		System.out.print("\\" + "\""+name+"\""+ "\t" + age+ "\t" + man+ "\t" + pnum+ "\t" + height+ "\t" +"\"" +ad+"\""+ "\t\\\n");
		System.out.print("\\" + "\""+name+"\""+ "\t" + age1+ "\t" + man+ "\t" + pnum1+ "\t" + height1+ "\t" +"\"" +ad1+"\""+ "\t\\\n");
		System.out.print("\\" + "\""+name2+"\""+ "\t" + age2+ "\t" + female+ "\t" + pnum2+ "\t" + height2+ "\t" +"\"" +ad2+"\""+ "\t\\\n");
		System.out.println("=================================================");
	}
}
