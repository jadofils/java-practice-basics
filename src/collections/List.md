📋 Java List
🔹 Purpose
Stores ordered elements (sequence).

Allows duplicates.

Provides index-based access.

🔹 When to Use
When you need to maintain insertion order.

When duplicates are allowed.

When you need random access by index.

🔹 Common Implementations
ArrayList → Fast random access, slower insert/remove in middle.

LinkedList → Fast insert/remove, slower random access.

Vector → Synchronized version of ArrayList (legacy).

Stack → LIFO (Last-In-First-Out) built on Vector.

⚙️ Syntax Examples
ArrayList
java
import java.util.*;

public class ListExample {
public static void main(String[] args) {
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Alice"); // duplicates allowed

        System.out.println(names.get(0)); // Alice
        System.out.println(names.size()); // 3
    }
}
LinkedList
java
List<Integer> numbers = new LinkedList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
System.out.println(numbers.remove(1)); // removes 20
Stack
java
Stack<String> stack = new Stack<>();
stack.push("A");
stack.push("B");
System.out.println(stack.pop()); // B
🔑 Important Methods (List Interface)
add(E e) → Add element

add(int index, E e) → Insert at position

get(int index) → Retrieve element

set(int index, E e) → Replace element

remove(int index) → Remove by index

remove(Object o) → Remove by value

size() → Number of elements

contains(Object o) → Check existence

indexOf(Object o) → First index of element

lastIndexOf(Object o) → Last index of element

listIterator() → Iterate with forward/backward navigation

🚀 Quick Learning Tip
Use ArrayList for most cases (fast access).

Use LinkedList when frequent insertions/deletions are needed.

Use Stack when you need LIFO behavior.

Use Vector only if you need thread-safe legacy code.