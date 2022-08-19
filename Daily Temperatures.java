class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        for(int day = 0; day < n; day++) {
            for(int futureDay = day + 1; futureDay < n; futureDay++) {
                if(temperatures[futureDay] > temperatures[day]) {
                    answer[day] = futureDay - day;
                    break;
                }
            }
        }
        return answer;
    }
} 
