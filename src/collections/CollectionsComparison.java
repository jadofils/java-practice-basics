package collections;

import java.util.*;

public class CollectionsComparison {

    private static final int SIZE = 100000;

    public static void main(String[] args) {
        // Benchmark Lists
        benchmarkList(new ArrayList<>(), "ArrayList");
        benchmarkList(new LinkedList<>(), "LinkedList");
        benchmarkList(new Vector<>(), "Vector");

        // Benchmark Sets
        benchmarkSet(new HashSet<>(), "HashSet");
        benchmarkSet(new LinkedHashSet<>(), "LinkedHashSet");
        benchmarkSet(new TreeSet<>(), "TreeSet");

        // Benchmark Maps
        benchmarkMap(new HashMap<>(), "HashMap");
        benchmarkMap(new LinkedHashMap<>(), "LinkedHashMap");
        benchmarkMap(new TreeMap<>(), "TreeMap");

        // Benchmark Queues
        benchmarkQueue(new ArrayDeque<>(), "ArrayDeque");
        benchmarkQueue(new PriorityQueue<>(), "PriorityQueue");
    }

    // Utility to measure memory usage
    private static long usedMemory() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // request GC
        return runtime.totalMemory() - runtime.freeMemory();
    }

    // ---------------- LIST ----------------
    private static void benchmarkList(List<Integer> list, String name) {
        System.out.println("\n--- " + name + " ---");

        long memBefore, memAfter;
        long start, end;

        // Insert
        memBefore = usedMemory();
        start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) list.add(i);
        end = System.nanoTime();
        memAfter = usedMemory();
        System.out.println("Insert: " + (end - start) + " ns, Memory: " + (memAfter - memBefore) + " bytes");

        // Select
        start = System.nanoTime();
        int value = list.get(SIZE / 2);
        end = System.nanoTime();
        System.out.println("Select: " + (end - start) + " ns");

        // Find
        start = System.nanoTime();
        boolean exists = list.contains(SIZE / 2);
        end = System.nanoTime();
        System.out.println("Find: " + (end - start) + " ns");

        // Update
        start = System.nanoTime();
        list.set(SIZE / 2, -1);
        end = System.nanoTime();
        System.out.println("Update: " + (end - start) + " ns");

        // Delete
        start = System.nanoTime();
        list.remove(SIZE / 2);
        end = System.nanoTime();
        System.out.println("Delete: " + (end - start) + " ns");
    }

    // ---------------- SET ----------------
    private static void benchmarkSet(Set<Integer> set, String name) {
        System.out.println("\n--- " + name + " ---");

        long memBefore, memAfter;
        long start, end;

        // Insert
        memBefore = usedMemory();
        start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) set.add(i);
        end = System.nanoTime();
        memAfter = usedMemory();
        System.out.println("Insert: " + (end - start) + " ns, Memory: " + (memAfter - memBefore) + " bytes");

        // Select (iteration)
        start = System.nanoTime();
        int count = 0;
        for (int val : set) {
            if (count++ == SIZE / 2) break;
        }
        end = System.nanoTime();
        System.out.println("Select (iteration): " + (end - start) + " ns");

        // Find
        start = System.nanoTime();
        boolean exists = set.contains(SIZE / 2);
        end = System.nanoTime();
        System.out.println("Find: " + (end - start) + " ns");

        // Update (remove+add)
        start = System.nanoTime();
        set.remove(SIZE / 2);
        set.add(-1);
        end = System.nanoTime();
        System.out.println("Update (remove+add): " + (end - start) + " ns");

        // Delete
        start = System.nanoTime();
        set.remove(SIZE / 3);
        end = System.nanoTime();
        System.out.println("Delete: " + (end - start) + " ns");
    }

    // ---------------- MAP ----------------
    private static void benchmarkMap(Map<Integer, Integer> map, String name) {
        System.out.println("\n--- " + name + " ---");

        long memBefore, memAfter;
        long start, end;

        // Insert
        memBefore = usedMemory();
        start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) map.put(i, i);
        end = System.nanoTime();
        memAfter = usedMemory();
        System.out.println("Insert: " + (end - start) + " ns, Memory: " + (memAfter - memBefore) + " bytes");

        // Select
        start = System.nanoTime();
        int value = map.get(SIZE / 2);
        end = System.nanoTime();
        System.out.println("Select: " + (end - start) + " ns");

        // Find
        start = System.nanoTime();
        boolean exists = map.containsKey(SIZE / 2);
        end = System.nanoTime();
        System.out.println("Find: " + (end - start) + " ns");

        // Update
        start = System.nanoTime();
        map.put(SIZE / 2, -1);
        end = System.nanoTime();
        System.out.println("Update: " + (end - start) + " ns");

        // Delete
        start = System.nanoTime();
        map.remove(SIZE / 2);
        end = System.nanoTime();
        System.out.println("Delete: " + (end - start) + " ns");
    }

    // ---------------- QUEUE ----------------
    private static void benchmarkQueue(Queue<Integer> queue, String name) {
        System.out.println("\n--- " + name + " ---");

        long memBefore, memAfter;
        long start, end;

        // Insert
        memBefore = usedMemory();
        start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) queue.offer(i);
        end = System.nanoTime();
        memAfter = usedMemory();
        System.out.println("Insert: " + (end - start) + " ns, Memory: " + (memAfter - memBefore) + " bytes");

        // Select (peek)
        start = System.nanoTime();
        int value = queue.peek();
        end = System.nanoTime();
        System.out.println("Select (peek): " + (end - start) + " ns");

        // Find
        start = System.nanoTime();
        boolean exists = queue.contains(SIZE / 2);
        end = System.nanoTime();
        System.out.println("Find: " + (end - start) + " ns");

        // Update (poll+offer)
        start = System.nanoTime();
        queue.poll();
        queue.offer(-1);
        end = System.nanoTime();
        System.out.println("Update (poll+offer): " + (end - start) + " ns");

        // Delete (poll)
        start = System.nanoTime();
        queue.poll();
        end = System.nanoTime();
        System.out.println("Delete (poll): " + (end - start) + " ns");
    }
}
