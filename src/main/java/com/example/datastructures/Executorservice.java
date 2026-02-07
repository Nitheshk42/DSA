package com.example.datastructures;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static java.util.stream.Nodes.collect;

public class Executorservice {

    public static void processTasks(List<Runnable> tasks) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        try {
            List<Future<?>> futures = tasks.stream()
                    .map(task -> executor.submit(() -> {
                        try {
                            task.run();
                        } catch (Exception e) {
                            System.err.println(
                                    "Task failed in thread "
                                            + Thread.currentThread().getName()
                                            + " : " + e.getMessage()
                            );
                        }
                    }))
            .collect(Collectors.toList());

            // Ensure all tasks complete
            for (Future<?> future : futures) {
                try {
                    future.get(); // waits for task completion
                } catch (ExecutionException e) {
                    // Exception already handled inside task
                }
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Task processing interrupted");
        } finally {
            executor.shutdown();
        }
    }

    public static void main(String[] args) {

        List<Runnable> tasks = List.of(
                () -> System.out.println("Task 1 executed"),
                () -> {
                    throw new RuntimeException("Something went wrong in Task 2");
                },
                () -> System.out.println("Task 3 executed"),
                () -> System.out.println("Task 4 executed"),
                () -> System.out.println("Task 5 executed")
        );

        System.out.println("Starting task processing...");
        processTasks(tasks);
        System.out.println("All tasks completed.");
    }
}
