import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * Ultima modificacion: 8/04/2022
 * 
 * Clase test de los heap 
 * @file HeapTest.java
 * @author Montserrat Gil
 * @author Gabriela Archila
 */
public class HeapTest {
	
	/**
	 * Evalua agregar y quitar de un vector heap
	 */
	@Test
	void testInsert()  {
		VectorHeap<String> pac =  new VectorHeap<String>();
		pac.add("hola");
		pac.add("adios");
		pac.add("roca");
		pac.add("perfume");
		pac.add("spotify");
		try {
			assertEquals("adios",pac.remove());
			assertEquals("hola",pac.remove());
			assertEquals("perfume",pac.remove());
			assertEquals("roca",pac.remove());
			assertEquals("spotify",pac.remove());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
