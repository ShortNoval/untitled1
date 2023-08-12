public class leetcode605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            int num=flowerbed[i];
            if((flowerbed[i]==0)&&(i==0||flowerbed[i-1]==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                count++;
            }

        }
        return count>=n;
    }

    public static void main(String[] args) {
        int [] p={1,0,0,0,1};
        int [] p2={0,0,1,0,1};
        int n=1;
        int n2=2;
        leetcode605 test1=new leetcode605();
        leetcode605 test2=new leetcode605();
        boolean ft=test1.canPlaceFlowers(p,n);
        boolean ft1=test2.canPlaceFlowers(p2,n2);
        System.out.println(ft);
        System.out.println(ft1);
    }
}
