package javadocextract;

import org.junit.Test;

import com.github.remartins.main.ProcessJavadoc;
import com.sun.tools.javadoc.Main;

public class ProcessJavadocTest {

	@Test
	public void extractSimpleJavadoc( ) {
		
		 String javaClass = this.getClass().getResource("../").getPath() + "Sample.java";
		
		 Main.execute("", ProcessJavadoc.class.getName(), new String[]{javaClass});
		
	}

}
