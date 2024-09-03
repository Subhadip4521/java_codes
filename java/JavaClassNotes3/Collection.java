Collection (I):
 If we want to Represent a Group of Individual Objects as a Single Entity then we should 
go for Collections.
 Collection Interface is considered as Root Interface of Collection Framework.
 Collection Interface defines the Most Common Methods which are Applicable for any 
Collection Object.
List (I):
 It is the Child Interface of Collection.
 If we want to Represent a Group of Individual Objects as a Single Entity where 
Duplicates are allowed and Insertion Order Preserved. Then we should go for List.
Note: In 1.2 Version onwards Vector and Stack Classes are re-engineered to Implement List 
Interface
ArrayList:
 The Underlying Data Structure for ArrayList is Resizable Array OR Growable Array.
 Duplicate Objects are allowed.
 Insertion Order is Preserved.
 Heterogeneous Objects are allowed (Except TreeSet and TreeMap Everywhere 
Heterogeneous Objects are allowed).
 null Insertion is Possible
LinkedList:
 The Underlying Data Structure is Double LinkedList.
 Insertion Order is Preserved. 
 Duplicate Objects are allowed.
 Heterogeneous Objects are allowed.
 null Insertion is Possible.
 Implements Serializable and Cloneable Interfaces but Not RandomAccessInterface.
 Best Choice if Our Frequent Operation is Insertion OR Deletion in the Middle.
 Worst Choice if Our Frequent Operation is Retrieval.
Vector:
 The Underlying Data Structure is Resizable Array OR Growable Array.
 Insertion Order is Preserved.
 Duplicate Objects are allowed.
 Heterogeneous Objects are allowed.
 null Insertion is Possible.
 Implements Serializable, Cloneable and RandomAccess interfaces.
 Every Method Present Inside Vector is Synchronized and Hence Vector Object is Thread Safe.
 Vector is the Best Choice if Our Frequent Operation is Retrieval.
 Worst Choice if Our Frequent Operation is Insertion OR Deletion in the Middle.
Stack:
 It is the Child Class of Vector.
 It is a Specially Designed Class for Last In First Out (LIFO) Order.



Set (I):
 It is the Child Interface of the Collection.
 If we want to Represent a Group of Individual Objects as a Single Entity where 
Duplicates are Not allowed and Insertion Order won't be Preserved. Then we should go 
for Set Interface
HashSet:
 The Underlying Data Structure is Hashtable.
 Insertion Order is Not Preserved and it isBased on hashCode of the Objects.
 Duplicate Objects are Not Allowed. If we are trying to Insert Duplicate Objects then we 
won't get any Compile Time ORRuntime Error.add() Simply Returns false.
 null Insertion is Possible.
 Heterogeneous objects are allowed.
 HashSet implements Serializable and Cloneable Interfaces but Not RandomAccess.
 If Our Frequent Operation is Search Operation, then HashSet is the Best Choice.
LinkedHashSet:
 It is the Child Class of HashSet.
 It is Exactly Same as HashSet Except the following Differences
SortedSet (I):
 It is the Child Interface of Set.
 If we want to Represent a Group of Individual Objects Without Duplicates According to 
Some Sorting Order then we should go for SortedSet
NavigableSet (I):
 It is the Child Interface of SortedSet.
 It defines Several Methods for Navigation Purposes.
TreeSet:
 The Underlying Data Structure is Balanced Tree.
 Insertion Order is Not Preserved and it is Based on Some Sorting Order.
 Heterogeneous Objects are Not Allowed. If we are trying to Insert we will get Runtime 
Exception Saying ClassCastException.
 Duplicate Objects are Not allowed.
 null Insertion is Possible (Only Once).
 Implements Serializable and Cloneable Interfaces but Not RandomAccess Interface.



Queue (I):
 It is the Child Interface of Collection.
 If we want to Represent a Group of Individual Objects Prior to Processing then we 
should go for Queue.
Eg: Before sending a Mail we have to Store All MailID’s in Some Data Structure and in which 
Order we added MailID’s in the Same Order Only Mails should be delivered (FIFO). For this 
Requirement Queue is Best Suitable.
PriorityQueue:
 This is a Data Structure which can be used to Represent a Group of Individual Objects 
Prior to processing according to Some Priority.
 The Priority Order can be Either Default Natural Sorting Order OR Customized Sorting 
Order specified by Comparator Object.
 If we are Depending on Natural Sorting Order then the Objects should be Homogeneous
and Comparable otherwise we will get ClassCastException.
 If we are defining Our Own Sorting by Comparator then the Objects Need Not 
beHomogeneous and Comparable.
 Duplicate objects are Not Allowed.
 Insertion Order is Not Preserved and it is Based on Some Priority.
 null Insertion is Not Possible Even as 1
st Element Also.
BlockingQueue: 
 It is the Child Interface of Queue. Present in java.util.Concurrent Package.
 It is a Thread Safe Collection.
 It is a specially designed Collection Not Only to Store Elements but also Supports Flow 
Control by Blocking Mechanism.
 If Queue is Empty take() (Retrieval Operation) will be Blocked until Queue will be Updated 
with Items.
 put() will be blocked if Queue is Full until Space Availability.
 This Property Makes BlockingQueue Best Choice for Producer Consumer Problem. When 
One Thread producing Items to the Queue and the Other Thread consuming Items from the 
Queue.
PriorityBlockingQueue:
The PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules 
as class PriorityQueue and supplies blocking retrieval operations. Since it is unbounded, 
adding elements may sometimes fail due to resource exhaustion resulting in OutOfMemoryError. 
This class does not permit null elements. 
PriorityBlockingQueue class and its iterator implement all of the optional methods of the 
Collection and Iterator interfaces. 
The Iterator provided in method iterator() and the Spliterator provided in the method 
spliterator() are not guaranteed to traverse the elements of the PriorityBlockingQueue 
in any particular order. For ordered traversal, use Arrays.sort(pq.toArray()). Also, method 
drainTo() can be used to remove some or all elements in priority order and place them in 
another collection.
Operations on this class make no guarantees about the ordering of elements with equal 
priority. If an ordering is needed to be enforced, define custom classes or comparators 
that use a secondary key to break ties in primary priority values.
LinkedBlockingQueue: 
The LinkedBlockingQueue is an optionally-bounded blocking queue based on linked nodes. 
It means that the LinkedBlockingQueue can be bounded, if its capacity is given, else the 
LinkedBlockingQueue will be unbounded. The capacity can be given as a parameter to the 
constructor of LinkedBlockingQueue. This queue orders elements FIFO (first-in-first-out). 
It means that the head of this queue is the oldest element of the elements present in this 
queue. The tail of this queue is the newest element of the elements of this queue. 
The newly inserted elements are always inserted at the tail of the queue, and the queue 
retrieval operations obtain elements at the head of the queue. Linked queues typically 
have higher throughput than array-based queues but less predictable performance in most 
concurrent applications.
The capacity, if unspecified, is equal to Integer.MAX_VALUE. Linked nodes are dynamically 
created upon each insertion, till the capacity of the queue is not filled. This class and 
its iterator implement all of the optional methods of the Collection and Iterator interfaces. 
It is a member of the Java Collections Framework.


Note:
 All the Above Interfaces (Collection, List , Set, SortedSet, NavigableSet,and Queue) Meant 
for representing a Group of Individual Objects.
 If we want to Represent a Group of Key - Value Pairs then we should go for Map.


Map (I):
 Map is Not Child Interface of Collection.
 If we want to Represent a Group of Objects as Key- Value Pairs then we should go for 
Map Interface.
 Duplicate Keys are Not allowed but Values can be Duplicated.
HashMap:
 The Underlying Data Structure is Hashtable.
 Duplicate Keys are Not Allowed. But Values can be Duplicated.
 Heterogeneous Objects are allowed for Both Keys and Values.
 Insertion Order is not preserved and it is based on hash code of the keys.
 null Insertion is allowed for Key (Only Once) and allowed for Values (Any Number of 
Times
LinkedHashMap:
 It is the Child Class of HashMap.
 It is Exactly Same as HashMap Except the following Differeces.
HashMap LinkedHashMap
The Underlying Data 
Structure is Hashtable.
The Underlying Data Structure is 
Combination of Hashtable and LinkedList.
Insertion is Not Preserved. Insertion Order is Preserved.
Introduced in 1.2 Version. Introduced in 1.4 Version

IdentityHashMap:
It is Exactly Same as HashMap Except the following Difference.
 In HashMap JVM will Use .equals() to Identify Duplicate Keys, which is Meant for 
ContentComparision.
 In IdentityHashMap JVM will Use == Operator to Identify Duplicate Keys, which is Meant 
for Reference Comparison.
WeakHashMap:
It is Exactly Same as HashMap Except the following Difference.
 In Case of HashMap, HashMap Dominates Garbage Collector. That is if Object doesn’t 
have any Reference Still it is Not Eligible for Garbage Collector if it is associated with 
HashMap. 
 But In Case of WeakHashMap if an Object doesn't contain any References then it is Always 
Eligible for GC Even though it is associated with WeakHashMap. That is Garbage Collector 
Dominates WeakHashMap
SortedMap (I):
 It is the Child Interface of Map. 
 If we want to Represent a Group of Objects as Key- Value Pairs according to Some 
Sorting Order of Keys then we should go for SortedMap.
 Sorting should be Based on Key but Not Based on Value.
NavigableMap (I):
 It is the Child Interface of SortedMap. 
 It Defines Several Methods for Navigation Purposes
TreeMap:
The Underlying Data Structure is Red -Black Tree.
Duplicate Keys are Not Allowed. But Values can be Duplicated.
Insertion Order is Not Preserved and it is Based on Some Sorting Order of Keys.
If we are depending on Default Natural Sorting Order then the Keys should be Homogeneous
and Comparable. Otherwise we will get Runtime Exception Saying ClassCastException.
If we defining Our Own Sorting by Comparator then Keys can be Heterogeneous and NonComparable.
But there are No Restrictions on Values. They can be Heterogeneous and Non- Comparable.

Hashtable:
 The Underlying Data Structure for Hashtable is Hashtable Only.
 Duplicate Keys are Not Allowed. But Values can be Duplicated.
 Insertion Order is Not Preserved and it is Based on Hashcode of the Keys.
 Heterogeneous Objects are Allowed for Both Keys and Values.
 null Insertion is Not Possible for Both Key and Values. Otherwise we will get Runtime 
Exception Saying NullPointerException.
 Every Method Present in Hashtable is Synchronized and Hence Hashtable Object is Thread 
Safe.
Properties:
 It is the Child Class of Hashtable.
 In Our Program if anything which Changes Frequently (Like Database User Name, 
Password, Database URLs Etc) Never Recommended to Hard Code in Java Program. 
Because for Every Change in Source File we have to Recompile, Rebuild and Redeploying 
Application and Sometimes Server Restart Also Required, which Creates Business Impact to the 
Client.
 To Overcome this Problem we have to Configure Such Type of Propertiesin Properties File.
 The Main Advantage in this Approach is if a there is a Change in Properties File, to Reflect 
that Change Just Redeployment is Enough, which won't Create any Business Impact.
 We can Use Properties Object to Hold Properties which are coming from Properties File.
 Properties can be used to Represent a Group of Key – Value Pairs where Both Key and 
Value should be String Type.



The 3 Cursors of Java:
 If we want to get Objects One by One from the Collection then we should go for Cursors.
 There are 3 Types of Cursors Available in Java.
1) Enumeration
2) Iterator
3) ListIterator
1) Enumeration:
 We can Use Enumeration to get Objects One by One from the Collection.
 We can Create Enumeration Object by using elements().
public Enumeration elements();
2) Iterator:
 We can Use Iterator to get Objects One by One from Collection.
 We can Apply Iterator Concept for any Collection Object. Hence it is Universal Cursor.
 By using Iterator we can Able to Perform Both Read and Remove Operations.
 We can Create Iterator Object by using iterator() of Collection Interface.
public Iterator iterator();
3) ListIterator:
 ListIterator is the Child Interface of Iterator.
 By using ListIterator we can Move Either to the Forward Direction OR to the 
Backward Direction. That is it is a Bi-Directional Cursor.
 By using ListIterator we can Able to Perform Addition of New Objects andReplacing 
existing Objects. In Addition to Read and Remove Operations.
 We can Create ListIterator Object by using listIterator().
publicListIteratorlistIterator();


Sorting:
Comparable (I):
Comparable Interface Present in java.lang Package and it contains Only One Method 
compareTo().
Comparator (I):
This Interface Present in java.util Package.
Methods: It contains 2 Methods compare() and equals().


Utility Classes
☀ Collections
☀ Arrays
Collections (C):
Collections Class is an Utility Class Present in java.util Package to Define Several Utility 
Methods for Collection Objects.
Arrays:
Arrays Class is an Utility Class to Define Several Utility Methods for Array 
Objects.
