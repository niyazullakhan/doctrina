//package arrays;
//
//public class ChooseFlask {
//    int fillPrefixSum(int arr[], int n, int prefixSum[])
//    {
//        prefixSum[0] = arr[0];
//
//        // Adding present element
//        // with previous element
//        for (int i = 1; i < n; i++)
//            prefixSum[i] = prefixSum[i - 1] + arr[i];
//
//        int positiveElements=0;
//        for(int i=0; i< prefixSum.size(); i++)
//            if(prefixSum[i]>0)
//                positiveElements++;
//
//        return positiveElements;
//    }
//}
