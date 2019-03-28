package com.github.remartins.main;

import com.sun.tools.javadoc.Main;

public class RunExtract {

	public static void main(String[] args) {

		for (String classPath : args) {
			Main.execute("", ProcessJavadoc.class.getName(), new String[] { classPath });
		}

	}

}
