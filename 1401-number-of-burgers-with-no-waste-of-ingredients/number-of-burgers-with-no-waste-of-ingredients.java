class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int diff = 4 * cheeseSlices - tomatoSlices;
        int smallBurger = diff/2;
        int jumboBurger = cheeseSlices - smallBurger;

        boolean isValid = diff%2 == 0 && smallBurger >= 0 && jumboBurger >= 0;

        return isValid ? Arrays.asList(jumboBurger, smallBurger) : Collections.emptyList();
    }
}