class Example   //Implicitly inherits from Any

/**
open class Base //Class is open for inheritance
**/

//To declare an explicit supertype, place the type after a colon in the class header:
//open class Base(p: Int)

//class Derived(p: Int) : Base(p)
//If the derived class has a primary constructor, the base class can (and must) be
// initialized right there, using the parameters of the primary constructor.

//If the derived class has no primary constructor, then each secondary constructor has to
// initialize the base type using the super keyword, or to delegate to another constructor
// which does that. Note that in this case different secondary constructors can call different
// constructors of the base type:
/**
*
  class MyView : View {
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
  }
 */

/************************Overriding methods************
As we mentioned before, we stick to making things explicit in Kotlin.
So, Kotlin requires explicit modifiers for overridable members (we call them open) and for overrides:

    open class Shape {
        open fun draw() { /*...*/ }
        fun fill() { /*...*/ }
    }

    class Circle() : Shape() {
        override fun draw() { /*...*/ }
    }

The override modifier is required for Circle.draw(). If it were missing, the compiler would complain.
If there is no open modifier on a function, like Shape.fill(), declaring a method with the same signature
in a subclass is illegal, either with override or without it.
The open modifier has no effect when added on members of a final class (i.e.. a class with no open modifier).

**********A member marked override is itself open, i.e. it may be overridden in subclasses.
If you want to prohibit re-overriding, use final:*************

    open class Rectangle() : Shape() {
        final override fun draw() { /*...*/ }
    }

*/

/*********Overriding properties********************
 *
    open class Shape {
        open val vertexCount: Int = 0
    }

    class Rectangle : Shape() {
        override val vertexCount = 4
    }

 *  You can also override a val property with a var property, but not vice versa.
 *  This is allowed because a val property essentially declares a get method, and
 *  overriding it as a var additionally declares a set method in the derived class.

Note that you can use the override keyword as part of the property declaration in a primary constructor.
 *
 *
    interface Shape {
        val vertexCount: Int
    }

    class Rectangle(override val vertexCount: Int = 4) : Shape // Always has 4 vertices

    class Polygon : Shape {
        override var vertexCount: Int = 0  // Can be set to any number later
    }
 *
 *
 *
 *
 *
 * */

/**
 * Derived class initialization order
During construction of a new instance of a derived class, the base class
initialization is done as the first step (preceded only by evaluation of the arguments
for the base class constructor) and thus happens before the initialization logic of the derived class is run.
 * */

open class Base(val name: String) {

    init { println("Initializing Base") }

    open val size: Int =
            name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
        name: String,
        val lastName: String,
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init { println("Initializing Derived") }

    override val size: Int =
            (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}

fun main() {
    println("Constructing Derived(\"hello\", \"world\")")
    val d = Derived("hello", "world")

    val fillRec:FilledRectangle = FilledRectangle()
    fillRec.draw()
}

//Calling the superclass implementation
open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}

//Inside an inner class, accessing the superclass of the outer
// class is done with the super keyword qualified with the outer class name: super@Outer:
/**
    class FilledRectangle: Rectangle() {
        fun draw() { /* ... */ }
        val borderColor: String get() = "black"

        inner class Filler {
            fun fill() { /* ... */ }
            fun drawAndFill() {
                super@FilledRectangle.draw() // Calls Rectangle's implementation of draw()
                fill()
                println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}") // Uses Rectangle's implementation of borderColor's get()
            }
        }
    }
 */

//Overriding rules
/**
 * In Kotlin, implementation inheritance is regulated by the following rule:
 * if a class inherits multiple implementations of the same member from its immediate superclasses,
 * it must override this member and provide its own implementation (perhaps, using one of the inherited ones).
 * To denote the supertype from which the inherited implementation is taken, we use super qualified by the supertype
 * name in angle brackets, e.g. super<Base>:
 *
    open class Rectangle {
        open fun draw() { /* ... */ }
    }

    interface Polygon {
        fun draw() { /* ... */ } // interface members are 'open' by default
    }

    class Square() : Rectangle(), Polygon {
        // The compiler requires draw() to be overridden:
        override fun draw() {
            super<Rectangle>.draw() // call to Rectangle.draw()
            super<Polygon>.draw() // call to Polygon.draw()
        }
    }
 * */

//Abstract classes
/**
 * A class and some of its members may be declared abstract.
 * An abstract member does not have an implementation in its class.
 * Note that we do not need to annotate an abstract class or function with open – it goes without saying.
We can override a non-abstract open member with an abstract one

    open class Polygon {
        open fun draw() {}
    }

    abstract class Rectangle : Polygon() {
        abstract override fun draw()
    }

 * */

/*****TODO - |Companion Objects|******/