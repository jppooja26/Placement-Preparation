package cond_loops.intermediate;

public class days {
    public static void main(String[] args) {
        int days = 0;
        for(int i=1;i<=31;i++) {
            if(i%2==0)
                days += 1;
        }
        System.out.println("Kunal can go out for "+ days+" days");
    }
}
