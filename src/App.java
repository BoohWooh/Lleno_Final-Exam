import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
    Stack<String> Creatures = new Stack<>();

        int [] ascendLevel = {95, 88, 78, 92, 85}; //Setting up two arrays for easier sortings
        int [] descendLevel = {95, 88, 78, 92, 85};
        int firstVal = 0, secVal=0;
        String fStr, sStr;

        String[] dscCrt = {"Dragon","Griffin","Unicorn","Phoenix","Centaur"};// Array for the Sorting functions for easier labeling
                                                                             // and easier Stack pushing


        System.out.println("*** Bubble Sort: Descending by Power Level ***");
        //Bubble Sort and also sorting the Creature array for the stack
        for (int i=0; i<descendLevel.length-1; i++){

            for(int j=0; j<descendLevel.length-i-1; j++){
                firstVal = descendLevel[j]; //Setting up the variables for comparision
                secVal = descendLevel[j+1];

                fStr = dscCrt[j]; //Setting up the string variables with the above
                sStr = dscCrt[j+1];

                if (descendLevel[j]<descendLevel[j+1]){ //If the first value is bigger than the second value, then Swap
                    descendLevel[j]=secVal;
                    descendLevel[j+1]= firstVal;

                    dscCrt[j] = sStr; //If the value is swapped so is the string
                    dscCrt[j+1] = fStr;
                }
            }
        }

        for (int i=0; i<dscCrt.length; i++){ //Pushing values on the dscCrt array for the Stack
            Creatures.push(dscCrt[4-i]);
        }



        for (int i=0; i<descendLevel.length; i++){ //Printing out the descending order list
            System.out.println(dscCrt[i]+" - "+descendLevel[i]);
        }

        System.out.println("\n*** Selection Sort: Ascending Order by Power Level ***");
        //Selection Sort
        for (int i =0; i<ascendLevel.length; i++){
            firstVal = i; //Saving the value of index
            for (int j=i; j<ascendLevel.length; j++){
                if(ascendLevel[firstVal]>ascendLevel[j]){ //If the value of the first element is bigger than the second, change the index
                    firstVal = j;
                }
            }
            secVal=ascendLevel[i]; //Swapping the values of the two indexes
            ascendLevel[i] = ascendLevel[firstVal];
            ascendLevel[firstVal] = secVal; 
        }

        for (int i=0; i<ascendLevel.length; i++){ //Printing out the ascending order list
            System.out.println(dscCrt[4-i]+" - "+ascendLevel[i]);
        }

        System.out.println("\n*** Stack Implementation: Popping Creatures ***"); //Popping stacks
        for (int i=0; i<dscCrt.length; i++){
            System.out.println("Popped: "+ Creatures.pop()+" - "+descendLevel[i]); //Using the already ordered list for easier coding
        }
    }
}
