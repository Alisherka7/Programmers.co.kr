
class Lottos {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zeroCount = 0;
        for(int lotto: lottos){
            if(lotto == 0){
                zeroCount++;
                continue;
            }
            for(int win_num : win_nums){
                if(win_num == lotto){
                    count++;
                    break;
                }
            }
        }
        return new int[]{7-Math.max(count+zeroCount, 1), 7-Math.max(count,1)};
    }
  
  public static void main(String[] args){
     int[] lottos = {44, 1, 0, 0, 31, 25};
     int[] win_nums = {31, 10, 45, 1, 6, 19}
     System.out.print(solution(lottos, win_nums));
}
