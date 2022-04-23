import java.util.*;

public class TaskScheduler {
    public static void main(String[] args) {

    }
    public int leastInterval(char[] tasks, int n) {
        if(n==0)
            return tasks.length;
        PriorityQueue<Integer> taskInstances = new PriorityQueue<>((p, q) -> q-p);

        Map<Character, Integer> taskCount = new HashMap<>();

        for(char task:tasks) {
            taskCount.put(task, taskCount.getOrDefault(task, 1)+1);
        }

        taskInstances.addAll(taskCount.values());
        int count=0;
        while(taskInstances.size()>0) {
            List<Integer> temp = new LinkedList<>();
            int i=0;
            while(i<n && taskInstances.size()>0) {
                count++;
                Integer topTask = taskInstances.poll();
                topTask-=1;
                temp.add(topTask);
                i++;
            }

            if(i<n && taskInstances.size()>0) {
                count=count+(n-i);
            }

            for(Integer task:temp) {
                if(task>0)
                    taskInstances.offer(task);
            }
        }
        return count;
    }
}
