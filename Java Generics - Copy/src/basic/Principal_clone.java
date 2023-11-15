/*
 * 		BM_CognitiveComplexity	7	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	4	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	331	double
		BM_HalsteadNumOperators	38	double
		BM_HalsteadNumUniqueOperands	71	double
		BM_HalsteadNumUniqueOperators	6	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	0.5	double
		BM_LinesOfCode	50	int
		BM_LinesOfComments	28	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	2	int
		BM_Size	1482	long

 */
package basic;

import java.lang.annotation.Annotation;
import java.lang.constant.ClassDesc;
import java.lang.invoke.TypeDescriptor;
import java.lang.invoke.MethodHandles;
import java.lang.module.ModuleReader;
import java.lang.ref.SoftReference;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamField;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.RecordComponent;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.constant.Constable;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import jdk.internal.loader.BootLoader;
import jdk.internal.loader.BuiltinClassLoader;
import jdk.internal.misc.Unsafe;
import jdk.internal.module.Resources;
import jdk.internal.reflect.CallerSensitive;
import jdk.internal.reflect.CallerSensitiveAdapter;
import jdk.internal.reflect.ConstantPool;
import jdk.internal.reflect.Reflection;
import jdk.internal.reflect.ReflectionFactory;
import jdk.internal.vm.annotation.ForceInline;
import jdk.internal.vm.annotation.IntrinsicCandidate;
import sun.invoke.util.Wrapper;
import sun.reflect.generics.factory.CoreReflectionFactory;
import sun.reflect.generics.factory.GenericsFactory;
import sun.reflect.generics.repository.ClassRepository;
import sun.reflect.generics.repository.MethodRepository;
import sun.reflect.generics.repository.ConstructorRepository;
import sun.reflect.generics.scope.ClassScope;
import sun.security.util.SecurityConstants;
import sun.reflect.annotation.*;
import sun.reflect.misc.ReflectUtil;

/*
 * 
 * //It is valid.
 * 
 */
public class Principal {
	final int myNum = 15;

	/*
	 * This is a method.
	 * 
	 * Example of a method.
	 */
	public static void main(String[] args) {/* Another one */
		// Another type of comment.
		System.out.println("Hello World");// This is a comment.

		String name = "John";
		System.out.println(name);
		int myNum = 15;
		System.out.println(myNum);
		int myNum2;
		myNum2 = 15;
		System.out.println(myNum2);

		// Variables:
		int myNum3 = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		System.out.println(myNum3 + "  " + myFloatNum + " " + myLetter + " " + myBool + " " + myText);

		// Widening casting is done automatically when passing a smaller size type to a
		// larger size type:
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double
		System.out.println(myInt); // Outputs 9
		System.out.println(myDouble); // Outputs 9.0

		// Narrowing casting must be done manually by placing the type in parentheses in
		// front of the value:
		double myDouble2 = 9.78;
		int myInt2 = (int) myDouble2; // Manual casting: double to int
		System.out.println(myDouble2); // Outputs 9.78
		System.out.println(myInt2); // Outputs 9

		// Strings:
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase()); // Outputs "hello world"
		System.out.println(txt.indexOf("Y"));
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName));
		txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt.toLowerCase());
		txt = "It\'s alright.";
		System.out.println(txt.toLowerCase());

		// if else
		if (20 > 18) {//ND(1) CGC(2)
			System.out.println("20 is greater than 18");
		}
		if (1 > 2) {//ND(1) CGC(4)
			// block of code to be executed if condition1 is true
		} else if (1 < 2) {//ND(2) CGC(7)
			// block of code to be executed if the condition1 is false and condition2 is
			// true
		} else {
			// block of code to be executed if the condition1 is false and condition2 is
			// false
		}
		
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);

		String string1 = "Great responsibility";    
        int count;    
            
        //Converts given string into character array    
        char string[] = string1.toCharArray();    
            
        System.out.println("Duplicate characters in a given string: ");    
        //Counts each character present in the string    
        for(int i = 0; i <string.length; i++) {    
            count = 1;    
            for(int j = i+1; j <string.length; j++) {    
                if(string[i] == string[j] && string[i] != ' ') {    
                    count++;    
                    //Set string[j] to 0 to avoid printing visited character    
                    string[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && string[i] != '0')    
                System.out.println(string[i]);    
        }    
		
	}
}

public class Person implements Serializable {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person withFirstName(String firstName) {
        return new Person(firstName, lastName);
    }

    public Person withLastName(String lastName) {
        return new Person(firstName, lastName);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) {
            return false;
        }
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "Person(" + firstName + "," + lastName + ")";
    }
}
