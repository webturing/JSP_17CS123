package contest1506;

public class K {
    public static void main(String[] args) {
        int ans=unsortness("ACB");
        System.out.println(ans);
    }
// i<j&&a[i]>a[j]  (i,j) pairs
//0 sorted as ascend
//n(n-1)/2 sorted as descend
//
    private static int unsortness(String str) {
        char [] chs=str.toCharArray();
        int tot=0;
        for(int i=0;i<chs.length;i++){
            for(int j=i+1;j<chs.length;j++){
                //i<j;
                if(chs[i]>chs[j]){
                    ++tot;
                }
            }
        }

        return tot;
    }
}
