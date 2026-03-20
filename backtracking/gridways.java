package backtracking;
//only right and down movement allowed
public class gridways {
    public static void main(String args[]){
        System.out.println(gridrec(0,0,3,3));
        System.out.println(gridmath(3,3));
    }
    //exponential time complexity
    public static int gridrec(int i,int j,int n,int m){
        //base case
        //if i am at taregt total ways = 1
        if(i == n-1 && j == m-1)
            return 1;
        //if i cross boundary
        if(i == n|| j == m)
            return 0;
        int w1 = gridrec(i+1,j,n,m); //down
        int w2 = gridrec(i,j+1,n,m); //right
        return w1+w2;
    }
    //polynomial time complexity
    public static int gridmath(int n,int m){
        return fact((n-1)+(m-1))/(fact(n-1)*fact(m-1) );
    }
    public static int fact(int n){
        if(n == 1 || n==0)
            return 1;
        return n*fact(n-1);
    }
}
