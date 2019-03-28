package com.github.remartins.main;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.Doclet;
import com.sun.javadoc.FieldDoc;
import com.sun.javadoc.MethodDoc;
import com.sun.javadoc.RootDoc;
import com.sun.javadoc.Tag;

public class ProcessJavadoc extends Doclet {

	public static boolean start(RootDoc root) {

		for (ClassDoc classDoc : root.classes()) {

			System.out.println();
			
			System.out.println("Class: " + classDoc.qualifiedName());
			System.out.println("Class Comment: " + classDoc.commentText());
			
			System.out.println();
			
			for (Tag tag : classDoc.tags()) {
				System.out.println("Class tag name: " + tag.name());
				System.out.println("Class tag text: " + tag.text());
			}
			

			System.out.println();

			for (FieldDoc fieldDoc : classDoc.fields(false)) {
				System.out.println("Field: " + fieldDoc.qualifiedName());
				System.out.println("Field Comment: " + fieldDoc.commentText());
			}
			
			System.out.println();
			
			for (MethodDoc methodDoc : classDoc.methods()) {
				System.out.println("Method: " + methodDoc.qualifiedName());
				System.out.println("Method Comment: " + methodDoc.commentText());
			}
		}
		
		return true;
	}

}
