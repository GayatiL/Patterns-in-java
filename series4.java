 class series4 {
    public static void main(String[] args) {
       
        int firstTerm = 10;
        
        int difference = 20;
        
       
        int numberOfTerms = 5;
        
        // Loop to generate and print the series
        int currentTerm = firstTerm;
        System.out.print(currentTerm); // print the first term
        
        for (int i = 1; i < numberOfTerms; i++) {
            // Add the difference to the current term to get the next term
            currentTerm += difference;
            
            // Print the current term followed by a space
            System.out.print(" " + currentTerm);
            
            // Update the difference for the next term
            difference += 18; 
        }
    }
}
