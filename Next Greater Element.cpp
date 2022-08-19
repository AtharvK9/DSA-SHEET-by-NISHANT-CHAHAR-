class Solution
{
    public:
    //Function to find the next greater element for each element of the array.
    vector<long long> nextLargerElement(vector<long long> arr, int n){
        // Your code here
        stack<long long> s;
        vector<long long> res(n);
        
        for(int i = n-1; i >= 0; i--) {
            while(!s.empty() && s.top() <= arr[i]) 
                s.pop();
            if(s.empty())
                res[i] = -1;
            else
                res[i] = s.top();
                
            s.push(arr[i]);
        }
        return res;
    }
};
