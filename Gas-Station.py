class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        
        start = 0
        total = 0 
        tank = 0 
        n = len(gas)
        for i in range(n) : 

            tank += gas[i]-cost[i]
            total += gas[i]- cost[i]
            if tank<0 :
                tank =0 
                start = (i+1) % n
        return start if total>=0 else -1


