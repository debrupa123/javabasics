/*Java provides the two methods of the Object class to compare the objects 
are as follows:
*Java equals() Method
---The equals() method of the Object class compare the equality of two objects.
The two objects will be equal if they share the same memory address.

*Java hashCode() Method
---In Java, hash code is a 32-bit signed integer value. It is a unique id provided by JVM to Java object. Each Java object is associated with the hash code. The
hash code is managed by a hash-based data structure, such as HashTable, HashSet, etc.
It returns a randomly generated hash code value of the object that is unique for each
instance. The randomly generated value might change during the several executions of 
the program.

>The general contract for hashCode is:
--When it is invoked more than once during the execution of an application, the 
hashCode() method will consistently return the same hash code (integer value). 
Note that the object should not be modified.
>If the two objects are equal according to the equals() method, then invoking the 
hashCode() method on these two objects must produce the same integer value.
>It is not necessary that if the two objects are unequal according to equals() method,
then invoking the hashCode() method on these two objects may produce distinct integer 
value. It means that it can produce the same hash code for both objects.

**When we override the equals() method, it is necessary to override the hashCode() 
method. Overriding follow the convention for the hashCode() method that states,
the equal object must have equal hash code.

***Difference Between == Operator and equals() Method--
In Java, the == operator compares that two references are identical or not. 
Whereas the equals() method compares two objects.
Objects are equal when they have the same state (usually comparing variables).
Objects are identical when they share the class identity.
For example, the expression obj1==obj2 tests the identity,
 not equality. While the expression obj1.equals(obj2) compares equality.
*/
public class CompObjEq {

	public static void main(String[] args) {
		
		Double x=new Double(10.5);
		Long y = new Long(246788799);
		System.out.println(x.equals(y));
		
	}

}
