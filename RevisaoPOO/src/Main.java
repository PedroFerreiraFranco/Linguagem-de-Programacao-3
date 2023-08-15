public class Main {

	public static void main(String[] args) {
	Student maria = new Student(1, 999);
	maria.setName("Maria");
	maria.setBirthDate("11/06/2000");
	maria.setCourse("Engenharia Química");
	maria.setSemester((short)4);
	
	Student jose = new Student(2, 1000);
	jose.setName("Jose");
	jose.setBirthDate("15/12/2001");
	jose.setCourse("Engenharia de Produção");
	jose.setSemester((short)8);
	
	System.out.println(maria.toString()+ "\n" + maria.formatPersonalData());
	System.out.println(jose.toString()+ "\n" + jose.formatPersonalData());	
	}
}
