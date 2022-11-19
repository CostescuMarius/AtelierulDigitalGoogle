package basics.ch3;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{3, 2, -3, -2, 3, 0};

        for(int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + " ");
        }

        int[] newArray = new int[myArray.length];
        int nr = 0;

        for(int i = 0; i < myArray.length; i++)
        {
            boolean added = false;
            for(int j = 0; j < nr; j++)
            {
                if(myArray[i] == newArray[j])
                {
                    added = true;
                }
            }
            if(added == false)
            {
                newArray[nr++] = myArray[i];
            }
        }

        int contor = 0;
        Pair[] pairs = new Pair[nr-1];

        System.out.println("");
        for(int i = 0; i < nr; i++)
        {
            System.out.print(newArray[i] + " ");
        }

        for(int i = 0; i < nr; i++) {
            for(int j = i + 1; j < nr; j++) {
                if((newArray[i] + newArray[j]) == 0) {
                    pairs[contor++] = new Pair(newArray[i], newArray[j]);
                    System.out.println(pairs[contor -1].toString());
                }
            }
        }

        System.out.println("\n Number of pairs = " + contor);
    }
}
