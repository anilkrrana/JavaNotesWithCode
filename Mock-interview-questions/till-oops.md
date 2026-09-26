Java Mock Interview — Beginner to OOP
ROUND 1 — Introduction/HR

1. Tell me about yourself.

Follow-up questions:

What are you currently learning?
Why did you choose Java?
What do you know about Java?
What have you built using Java?
Which Java topic are you most comfortable with?

2. Why did you choose Java?
3. What is your current level in Java?
4. What topics have you learned in Java so far?
5. What is your favorite topic in Java and why?
6. Tell me about one Java program or mini-project you have created.
7. What was the most difficult concept you learned in Java?


ROUND 2 — Java Fundamentals

8. What is Java?
9. What are the main features of Java?

Possible follow-ups:

What does platform independent mean?
What does "Write Once, Run Anywhere" mean?
Why is Java called object-oriented?

10. What is the difference between JDK, JRE and JVM?
11. What happens when you compile a Java program?

Expected discussion:

.java
  ↓
javac
  ↓
.class
  ↓
JVM
  ↓
Program execution

12. What is the purpose of the main() method?
13. Why is the main method written as:
public static void main(String[] args)

Ask them to explain each keyword.

14. What is a variable?
15. What are primitive data types in Java?
16. What is the difference between primitive and non-primitive data types?
17. What is the difference between int and double?
18. What is the difference between char and String?
19. Is String a primitive data type?
20. What is a boolean?
ROUND 3 — Input, Operators & Expressions
21. How do you take input from the user in Java?

Ask them to write:

Scanner sc = new Scanner(System.in);
22. Why do we use Scanner?
23. What is the difference between:
next()
nextLine()
nextInt()
nextDouble()
24. Why do we sometimes need sc.nextLine() after nextInt()?

This is a very good practical question based on what you taught them.

25. What are operators in Java?
26. What are arithmetic operators?
27. What is the difference between = and ==?
28. What is the difference between && and ||?
29. What is the ! operator?
30. What is short-circuit evaluation?

Ask:

if (a > 10 && b > 20)

Which condition is evaluated first?

ROUND 4 — Conditional Statements
31. What are conditional statements in Java?
32. Difference between if, if-else, and else-if?
33. When would you use switch instead of if-else?
34. Write a program to check whether a number is even or odd.
35. Write a program to check whether a year is a leap year.
36. Write a program to find the largest of three numbers.
37. Suppose income is given by the user. How would you calculate tax using different income slabs?

This tests whether they can combine:

input
variables
conditions
arithmetic operators
ROUND 5 — Loops
38. Why do we use loops?
39. What are the different loops in Java?
while
for
for-each
40. Difference between for and while loop?
41. When would you prefer a for loop?
42. When would you prefer a while loop?
43. What is an infinite loop?
44. Write a program to print numbers from 1 to 10.
45. Write a program to print even numbers from 1 to 100.
46. Write a program to find the sum of numbers from 1 to 100.
47. Write a program to reverse a number.
48. Write a program to count the digits of a number.
49. Write a program to check whether a number is a palindrome.
50. Write a program to print the multiplication table of a number.
ROUND 6 — Arrays
51. What is an array?
52. Why do we use arrays?
53. How do you declare an array in Java?
54. What is the index of the first element of an array?
55. What happens if you access an invalid array index?
56. What is the difference between array length and last index?

For example:

int[] arr = new int[5];

Ask:

What is the length?
What is the first index?
What is the last index?


57. How do you take array input from the user?
58. How do you traverse an array?

Ask them to demonstrate both:

for

and

for-each
59. Write a program to find the largest element in an array.
60. Write a program to find the smallest element in an array.
61. Write a program to calculate the sum of all array elements.
62. Write a program to count even and odd numbers in an array.
ROUND 7 — Methods
63. What is a method?
64. Why do we use methods?
65. What is the difference between a method and a variable?
66. What are parameters and arguments?

For example:
int add(int a, int b)
Ask:
What are a and b?
What is the return type?
Then:
add(10, 20);

Ask:

What are 10 and 20?
67. What is a return type?
68. What is the difference between void and int return types?
69. Can a method accept multiple parameters?
70. Can a method return a value?
71. Can a method return an array?
72. Why should we divide a large program into methods?
73. Write a method to check whether a number is even.
74. Write a method to find the largest number in an array.


ROUND 8 — OOP Fundamentals

Now tell the student:
"Let's move to Object-Oriented Programming."

75. What is OOP?
76. Why do we use OOP?
77. What are the four pillars of OOP?

Expected:

Encapsulation
Inheritance
Polymorphism
Abstraction

78. What is a class?
79. What is an object?
80. What is the difference between a class and an object?
81. Give a real-world example of a class and object.

Example:

Class → Car
Objects → BMW, Audi, Toyota
82. What is an instance of a class?
83. What does the new keyword do?
84. Where does an object get created?
85. What is an object reference?

For:

Student s = new Student();

Ask the student to explain every part of this statement.

ROUND 9 — Constructors
86. What is a constructor?
87. Why do we use constructors?
88. What is the difference between a constructor and a method?
89. Does a constructor have a return type?
90. When is a constructor called?
91. What is a default constructor?
92. What is a parameterized constructor?
93. Can a class have multiple constructors?
94. What is constructor overloading?
ROUND 10 — this Keyword
95. What is the this keyword?
96. Why do we use this?

Give:

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

Ask:

Why can't we simply write name = name?

97. What does the left-hand name represent?
98. What does the right-hand name represent?
99. What is the difference between this and this()?

This is a good advanced question for your students.

ROUND 11 — Encapsulation
100. What is encapsulation?
101. Why do we make fields private?
102. How can we access private data?
103. What are getters and setters?
104. Why shouldn't we directly expose important fields?
105. Give a real-world example of encapsulation.
106. How can we add validation using a setter?

For example:

public void setAge(int age) {
    if (age > 0) {
        this.age = age;
    }
}

Ask:

Why is this better than directly making age public?

ROUND 12 — Inheritance
107. What is inheritance?
108. Why do we use inheritance?
109. Which keyword is used for inheritance in Java?
extends
110. Explain this:
class Dog extends Animal
111. Can a Java class extend two classes?
112. Why doesn't Java support multiple inheritance through classes?
113. What is a parent/superclass?
114. What is a child/subclass?
115. What is IS-A relationship?

Example:

Dog IS-A Animal
Car IS-A Vehicle
116. What is code reusability?
117. What is the super keyword?
118. What is the difference between this and super?
ROUND 13 — Polymorphism
119. What is polymorphism?
120. What are the two common types of polymorphism discussed in Java?
Compile-time → Method Overloading
Runtime → Method Overriding
121. What is method overloading?
122. Give an example of method overloading.
123. Can we overload a method by changing only the return type?
124. What is method overriding?
125. What are the conditions for method overriding?
126. Why do we use @Override?
127. What is runtime polymorphism?
128. Explain:
Animal a = new Dog();
129. Which method will execute here?
Animal a = new Dog();
a.sound();
130. Why does the Dog version execute?

This is one of the most important OOP interview questions.

ROUND 14 — Abstraction
131. What is abstraction?
132. Why do we use abstraction?
133. How can we achieve abstraction in Java?
Abstract class
Interface
134. What is an abstract class?
135. Can we create an object of an abstract class?
136. Can an abstract class have a constructor?
137. Can an abstract class contain normal methods?
138. What is an abstract method?
139. Does an abstract method have a body?
140. Who provides the implementation of an abstract method?

ROUND 15 — Interfaces
141. What is an interface?
142. Why do we use interfaces?
143. Which keyword is used to implement an interface?
implements
144. Can a class implement multiple interfaces?
145. Why can a class implement multiple interfaces but cannot extend multiple classes?
146. Can an interface have default methods?
147. Can an interface have static methods?
148. Difference between abstract class and interface?
ROUND 16 — Upcasting & Downcasting
149. What is upcasting?

Expected:

Child → Parent

Example:

Dog dog = new Dog();
Animal animal = dog;

150. Is upcasting automatic?
151. What is downcasting?

Expected:

Parent → Child

Example:

Animal animal = new Dog();
Dog dog = (Dog) animal;


152. Is downcasting automatic?
153. What happens if we perform an invalid downcast?

Example:

Animal animal = new Animal();
Dog dog = (Dog) animal;
ROUND 17 — instanceof
154. What is instanceof?
155. Why is instanceof useful?

Example:

if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
}
156. Why should we check the object before downcasting?
ROUND 18 — Object Class
157. What is the Object class?
158. Is Object the parent of all Java classes?
159. What is toString()?
160. Why do we override toString()?
161. What is equals()?
162. What is hashCode()?
163. Why should equals() and hashCode() be consistent?

For your current students, don't go extremely deep into hashing yet. Just check conceptual understanding.

ROUND 19 — IS-A vs HAS-A
164. What is an IS-A relationship?

Example:

Dog IS-A Animal
165. What is a HAS-A relationship?

Example:

Car HAS-A Engine
Library HAS-A Book
166. What is the difference between IS-A and HAS-A?
167. Which OOP concept is generally used to represent IS-A?
168. How can we model HAS-A in Java?
ROUND 20 — Mini-Project Interview

Now use the projects they actually worked on.

Food Delivery Project
169. Explain your Food Delivery project.

Let the student explain the architecture without help.

Then ask:

170. Why did you make Order an abstract class?
171. Why are customerName and amount private?
172. Why did you create:
DineIn
Takeaway
Delivery
173. What is the relationship between Order and DineIn?
174. Where did you use inheritance?
175. Where did you use abstraction?
176. Where did you use encapsulation?
177. Where did you use polymorphism?

Show:

Order order;

order = new DineIn(...);

Then ask:

What is happening here?

178. Why can we write:
Order order = new Delivery(...);
179. Why do all three classes have their own calculateCharges()?
180. What happens when this executes?
order.calculateCharges();
181. How is runtime polymorphism happening in this project?
182. Why did you use getters?
183. Why did you use a constructor in Order?
184. What would happen if Order was not abstract?
ROUND 21 — Library Mini-Project

Ask:

185. Explain your Library project.
186. What classes did you create?

Expected discussion:

Book
Member
Library
187. What is the relationship between Library and Book?
188. Is this IS-A or HAS-A?
189. Why is this called a HAS-A relationship?
190. What does this mean?
Library has Books
191. Why did you use constructors in the Book and Member classes?
ROUND 22 — Coding Round

Give them one question at a time.

Coding Question 1

Write a program to check whether a number is prime.

Coding Question 2

Write a program to reverse a number.

Coding Question 3

Find the largest element in an array.

Coding Question 4

Count even and odd numbers in an array.

Coding Question 5

Create a Student class with:

name
age
course

Create two objects and display their details.

Coding Question 6

Create:

Employee
Developer
Tester
Manager

Use inheritance and method overriding.

Expected:

Ashish is developing software
Mohit is testing software
Deepak is managing the team
Coding Question 7 — OOP Challenge

Create:

abstract class Payment

with:

abstract void pay();

Create:

UPIPayment
CardPayment
CashPayment

Override pay() in each class.

Then demonstrate:

Payment payment;

and runtime polymorphism.

ROUND 23 — Rapid-Fire Round

This is excellent for the last 5–10 minutes.

Ask quickly without allowing long explanations.

192. Class or object?

Car

193. Class or object?
Car c = new Car();
194. Which keyword creates an object?
195. Which keyword is used for inheritance?
196. Which keyword is used to implement an interface?
197. Which keyword refers to the current object?
198. Which keyword refers to the parent class?
199. Child → Parent?

Upcasting

200. Parent → Child?

Downcasting

201. Same method name, different parameters?

Overloading

202. Same method signature in parent and child?

Overriding

203. Which is generally compile-time polymorphism?

Overloading

204. Which is runtime polymorphism?

Overriding

205. Can an abstract class have a constructor?
206. Can we create an object of an abstract class?
207. Can a class implement multiple interfaces?
208. Can a class extend multiple classes?
209. What is IS-A?
210. What is HAS-A?
211. Why are fields made private?
212. What are getters and setters?
Final HR / Closing Round

End the interview like a real interviewer.

213. Which Java topic do you feel strongest in?
214. Which topic do you still find difficult?
215. If you don't know the answer to a technical question, what would you do?
216. How do you practice Java?
217. What are you currently working on?
218. Where do you see yourself after one year?
219. Are you comfortable learning new technologies?
220. Do you have any questions for me?