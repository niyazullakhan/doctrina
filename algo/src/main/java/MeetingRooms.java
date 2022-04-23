package arrays;

import java.util.Arrays;

/*
Given an array of meeting time intervals intervals where intervals[i] = [starti, endi], return the minimum number of conference rooms required.



Example 1:

Input: intervals = [[0,30],[5,10],[15,20]]
Output: 2
Example 2:

Input: intervals = [[7,10],[2,4]]
Output: 1

 */
public class MeetingRooms {
    public static void main(String[] args) {
        // take th meeting room and sort bith start and end ==> [1,5,15] , [10,20,30]
        //[1,2,8,11], [3,9,10,13]
        // {4,16}, {17,18}, {19,20} == > [4,17,19] [16,18,20]
        int[][] calendar = {{2,3},{1,9},{8,10},{11,13}};


        int[] startTime = new int[calendar.length];
        int[] endTime = new int[calendar.length];


        for(int i=0; i< calendar.length; i++) {
            startTime[i] = calendar[i][0];
            endTime[i] = calendar[i][1];
        }

        int numRooms = 0;

        Arrays.sort(startTime);
        Arrays.sort(endTime);

        int endIndx = 0;
        for(int i=0; i<startTime.length; i++) {
            if(startTime[i] >= endTime[endIndx]) {
                numRooms--;
                endIndx++;
            }
            numRooms++;
        }
        System.out.println(numRooms);
    }

//    public static void main(String[] args) {
//        int[][] meetingSlot = {{2,3},{1,9},{8,10},{11,13}};
//        int numMeeting = 0;
//
//        int[] startTime= new int[meetingSlot.length];
//        int[] endTime = new int[meetingSlot.length];
//
//
//        for(int i=0; i<meetingSlot.length; i++) {
//            startTime[i]=meetingSlot[i][0];
//            endTime[i] = meetingSlot[i][1];
//        }
//
//        Arrays.sort(startTime);
//        Arrays.sort(endTime);
//
//        int endIdx=0;
//        for(int i=0; i<startTime.length; i++) {
//            if(startTime[i]>=endTime[endIdx]) {
//                numMeeting--;
//                endIdx++;
//            }
//            {
//                numMeeting++;
//
//            }
//        }
//
//        System.out.println(numMeeting);
//
//    }
}
