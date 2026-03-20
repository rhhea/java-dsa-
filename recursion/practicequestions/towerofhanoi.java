package recursion.practicequestions;

public class towerofhanoi {
    public static void tower(int n,char src,char helper,char dest)
    {
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return; }
        //trasfer n-1 disks from source to helper using destination as helper
        tower(n-1,src,dest,helper);
        //trasfer nth disk from a(source) to destination(c)
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        //transfer n-1 disks from helper to destination using source as helper
        tower(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n = 3; //3 no.of disks
        tower(n,'A','B','C');
    }
}
