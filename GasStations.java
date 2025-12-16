public class GasStations {
    public static int GasStart(int[] gas, int[] cost){
        int totalGas = 0;
        int totalCost = 0;
        for(int i = 0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost){
            return -1;
        }
        int currentGas = 0;
        int startIndex = 0;
        for(int i = 0; i < gas.length; i++){
            currentGas += gas[i] - cost[i];
            if(currentGas < 0){
                startIndex = i+1;
                currentGas = 0;
            }
        }
        return startIndex;
    }
    public static void main(String[] args){
        int[] gas = {4, 3, 5, 2, 3};
        int[] cost = {5, 6, 2, 1, 1};
        System.out.println(GasStart(gas, cost));
    }
}
