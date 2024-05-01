package Library;

import java.util.TreeMap;

public class MeetingRoomsII {
    public static int meetingRoom(int arr[][]){
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        int ans = 0, count = 0;
        for(int []i : arr){
            int start = i[0], end = i[1];
            tmap.put(start, tmap.getOrDefault(start, 0) + 1);
            tmap.put(end, tmap.getOrDefault(end, 0) - 1);
        }
        for(int k : tmap.keySet()){
            count += tmap.get(k);
            ans = Math.max(ans, count);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = new int[3][2];
        arr[0][0] = 0;
        arr[0][1] = 30;
        arr[1][0] = 5;
        arr[1][1] = 10;
        arr[2][0] = 15;
        arr[2][1] = 20;

        System.out.println(meetingRoom(arr));
    }   
}
