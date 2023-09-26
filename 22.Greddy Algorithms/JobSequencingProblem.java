import java.util.*;

public class JobSequencingProblem {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args[]){
        int[][] jobsInfo = {{4, 20},{1, 10},{1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i = 0; i < jobsInfo.length; i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit - a.profit); //descending order based on profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                time++;
                seq.add(curr.id);
            }
        }

        //Printing sequence and time 
        System.out.println("The sequence of job : " + seq);
        System.out.println("Total time taken : " + time);
    }
}
