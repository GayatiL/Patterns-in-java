class Mirror1
{
	public static void main(String[] args) {
		

        // Upper Triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Triangle (Mirrored)
        for (int i = 4; i >= 1; i--) {  // Start from 4 to avoid repeating the middle row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}