class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currentMass=mass;
        for(int ast : asteroids){
            if(currentMass<ast){
                return false;
            }
            currentMass=currentMass+ast;
        }
        return true;
    }
}