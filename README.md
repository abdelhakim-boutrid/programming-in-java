# programming-in-java




#  1)Résolution of exercies of the lab 1 class

## 1.Explain the concept of encapsulation and the way it is implemented in Java
it is the priciple of hiding the internal state and detail of an object, and controlling how they can be accessed and controlled.

## 2.Explain the following concepts:

- ### mutator method (setter) : 

 ***it is a method used to acces and modifie details of an object***


- ### accessor method (getter) : 
***it is a method used to retrieve information of the state of an object without modifying it***

## 3.Explain two different meanings/roles of: this and super

this : it is a method used to refere to the curent object and can be used to acces to it fields and domain.

Super : it is a method used to refer to the parent class of the current object.

## 4.Explain the concept of inheritence and the way it is implemented in Java

it is the methode allowing a class of inheriting fields and methods from an other class

## 5.Explain the concept of polymorphism, name its three main kinds/forms, and explain the way they are implemented in Java

polymorphism : means that the same method name, operation, or interface can have diferente behavior depending on the context.

## 6.Explain the relationship between inheritance and sub-type/inclusion polymorphism

inheritance create a relation between a superclass and a subclass, a subclass is a subtype of the superclass.

## 7.Read Composition vs. Inheritance: How to Choose?

inheritance is when a class is a type of another class
composition is when a class containes or usess another object

## 8.In the analysed code identify testable methods and write a couple of unit tests for them (the IDE can help with it)

```@Test
void IsFortuneCorrectFortune (){
    BigDecimal fortune = new BigDecimal("1000");

    RichDad dad = new RichDad(
        "John","Smith",
        fortune,
        List.of("123456")
    );
    assertEquals(fortune, dad.getFortune());
}
```


# 2) Static members (variables/constants and methods)

## 1.Explain the following concepts:

-static variable (field/class member) : a static variable belongs to the class and not only to an individual object.there os only one copy, shared by all the instances of the class.

 
-static constant : a static constant belongs to the class and have a fixed value that cannot be modified. it is declared using static final.

-static method : it belongs to the class and not the object.but it can be called directly using the class name without creating an instance.

## 2.Explain why static constants often have public visibility

because they represent a fixed value that intended to be shared between other classes and we cant change theme so exposingg theme is safe 

## 3.Explain why static methods do not have access to instance members (methods and fields)

Static methods do not have direct access to instance members because static methods belong to the class, while instance members belong to a specific object.


## 4.Give one example of a static method application

double result = Math.sqrt(25);




# 3()Constructors, factory methods, and singletons

## 1. Describe the object initialisation process for a class derived from the Object class (including default values for different types of fields/variables, static variables, static constants, anonymous static blocks, anonymous blocks, constructors)

The object initialization process in Java follows a specific order. First, fields receive their default values, such as 0 for numeric types, false for boolean, and null for object references. Static variables, static constants, and static initialization blocks are initialized once when the class is loaded. When an object is created, instance fields and instance initialization blocks are initialized, and finally the constructor is executed.



## 2. For class D9 from (defined in ClassFamily.java):draw the class (inheritence) diagram

Object → B1 → D1 → D9

## 3. Compare capabilities of constructors and factory methods


Constructor → directly creates an object.
Factory method → more flexible way to control object creation.

## 4.Give at least two applications of the singleton pattern

1. Logging system – a single logger instance can be shared across the entire application.
2. Configuration manager – a single instance can manage and provide the application’s global configuration.




# 4) Immutable objects/classes and Java Records


## 1.Explain a strategy for defining immutable objects

To define an immutable object, the class should usually be declared final, its fields should be private final, all fields should be initialized in the constructor, and no setters should be provided. Only accessor methods should be available.


## 2.Compare the concepts of the immutable object and immutable class

An immutable object is an object whose internal state cannot change after it has been created.
An immutable class is a class designed so that all of its instances are immutable.


## 3.Explain the advantages of immutable objects

Immutable objects are safer because their state cannot change. They can be shared without risk, are naturally thread-safe, and are easier to understand and test.


## 4.Give at least two uses of the Java Records

Java Records are useful for representing simple data objects and for creating immutable data-transfer objects (DTOs). They automatically generate the constructor, accessors, equals(), hashCode(), and toString().


## 5. Write a couple of unit tests to for HelloImmutable and HelloJavaRecord
 
  ```
 @Test
void helloImmutableShouldReturnCorrectValues() {
    HelloImmutable obj = new HelloImmutable(1, "abc");

    assertEquals(1, obj.getI1());
    assertEquals("abc", obj.getS1());
}

@Test
void helloJavaRecordShouldReturnCorrectValues() {
    HelloJavaRecord obj = new HelloJavaRecord(1, "abc");

    assertEquals(1, obj.i1());
    assertEquals("abc", obj.s1());
}
```





# 5) Overriding hashCode, equals, and toString

## 1.Explain the difference between == operator and equals method in Java (consider primitive and reference types)

For primitive types, == compares values. For reference types, == checks whether two references point to the same object. The equals() method compares objects for logical equality, depending on its implementation.



## 2. Explain the following formula o1.equals(o2) => hasCode(o1) == hashCode(o2)

If o1.equals(o2) is true, then o1 and o2 must have the same hash code. However, two objects with the same hash code are not necessarily equal.


## 4. Explain the general contract of hashCode and equals

The general contract states that equal objects must have equal hash codes. However, objects with equal hash codes are not necessarily equal. Both equals() and hashCode() should return consistent results as long as the relevant state of the objects does not change.

## 5.Generate JavaDOC documentation for the project (hint: Tools > Generate JavaDoc)

