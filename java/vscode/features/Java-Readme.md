

annotation
==========
kind of metadata

@Retention
@Documented
@Target
@Inherited
@Repeatable

- custom annotation must have the keyword @interface
- each method declaration defines an element of the annotation type
- method declaration must have any parameters or a throws clause

varargs
=======
varargs allows the method to accept zero or multiple arguments.
we don't have to provide overloaded methods.

static imports
==============
import static members and use them without class reference.

single-static = one member from a type
static-import-on-demand = imports all members of a type

volatile
========
variable's value will be modified by different threads
never be cached thread-locally
acts as though it is enclosed in a synchronized block
changes made in one thread are immediately reflect in other thread

Thread safe
===========
Method or class instance can be used by multiple threads at the same time without any problem

Mutual Exclusion
================
Only one thread or process can execute a block of code at a time

enum
====
set of related constants.
enums extend java.lang.Enum abstract class.
enum implements Comparable and Serializable
enum types in java are singleton by default so you can use '==' operator
*** when declared inside a class enums are always static
enum types are final by default and cannot be extended

enum does not require you to give constructor definition but you can give define your own constructor to initialize the state.

https://howtodoinjava.com/core-java/enum/guide-for-understanding-enum-in-java/





