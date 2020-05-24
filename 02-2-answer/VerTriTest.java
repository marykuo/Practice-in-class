public class VerTriTest {

	public static void main(String[] args) {
		VerTri vtri1=new VerTri(5,1);
		vtri1.draw();
		System.out.println();
		
		VerTri vtri2=new VerTri(5,2);
		vtri2.draw();
		System.out.println();
		
		VerTri vtri3=new VerTri();
		vtri3.setHeight(8);
		vtri3.setType(3);
		vtri3.setCh("$");
		vtri3.draw();
		System.out.printf("Height=%d; Type=%d; Ch=%s\n", vtri3.getHeight(), vtri3.getType(), vtri3.getCh());
		System.out.println(vtri3);
	}

}
