public class VertTriTest {

	public static void main(String[] args) {
		VertTri vtri1 = new VertTri(5,3);
        vtri1.draw();
        System.out.println();
		VertTri vtri2 = new VertTri(5,4);
        vtri2.draw();
        System.out.println();
        VertTri vtri3 = new VertTri();
        vtri3.setHeight(8);
        vtri3.setType(3);
        vtri3.setCh("$");
        vtri3.draw();
        System.out.printf("Height=%d; Type=%d; Ch=%s\n", vtri3.getHeight(), vtri3.getType(), vtri3.getCh());
        System.out.println(vtri3);
	}

}
