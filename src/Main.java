/* Sök i arrayen med hjälp av binärsökning
        Binärsökning är en mycket snabb metod för att söka i en sorterad array. Den fungerar genom att jämföra det tal som vi söker med det tal som ligger i mitten av arrayen. Om det sökta talet är större än det tal som ligger i mitten av arrayen så söker vi i den andra halvan av arrayen. Om det sökta talet är mindre än det tal som ligger i mitten av arrayen så söker vi i den första halvan av arrayen. Vi fortsätter att söka i halvorna tills vi hittar det sökta talet eller tills vi inte kan dela arrayen i fler halvor.
        För att det ska fungera måste arrayen vara sorterad. Om den inte är sorterad så kan vi inte använda binärsökning.

Termer för övningen:
        Binärsökning - en snabb metod för att söka i en sorterad array.
        Sorterad - en array som är sorterad i stigande ordning.
        Stigande ordning - en array som är sorterad så att det första talet är det minsta talet och det sista talet är det största talet.
        Mitten - det tal som ligger i mitten av arrayen.
        Halva - en del av arrayen som är lika stor som hela arrayen.
        Index - positionen för ett värde i en array.
        java.util.Arrays.sort(names); - en metod som sorterar en array i stigande ordning.
        int index = java.util.Arrays.binarySearch(names, name); - en metod som söker i en sorterad array med hjälp av binärsökning. Den returnerar index för det sökta värdet om det finns i arrayen. Annars returnerar den ett negativt tal.

Instruktioner
        1 Skapa en array med valfritt antal namn.
        2 Sortera arrayen i stigande ordning.
        3 Fråga användaren efter ett namn som ska sökas i arrayen.
        4 Sök i arrayen med hjälp av binärsökning.
        5 Skriv ut index för det sökta namnet.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
            private static String[] Bokstav = {"Arne", "Bertil", "Duno", "Caesar", "Frille", "Enok", "Huve-bahuveba" ,"Grön" ,"Jert", "Ingu"};
                                                // 1. Skapa en array
            static{Arrays.sort(Bokstav);}
                                                // 2. Sortera arrayen i stigande ordning.
            static Scanner Scanner = new Scanner(System.in);
            static{System.out.print("Ange namn här: ");}
            static String Binarnamnattsokapa = Scanner.nextLine();
                                                // 3. Fråga användaren efter ett namn som ska sökas i arrayen.
            static int min = 0;
            static int max = Bokstav.length - 1;
            static int mid;
            static String Binärnamn = Binarnamnattsokapa;

            public static void main(String[] args) {
                System.out.println("Namn funnet vid position nr " + StringBinarSokning());
                                                        // 5. Skriv ut index för det sökta namnet.
            }

            private static int StringBinarSokning() {    // 4. Metod- Sök i arrayen med hjälp av binärsökning.
                while (min <= max) {
                    mid = (min + max) / 2;
                    if (Bokstav[mid].compareTo(Binärnamn) < 0) {
                        min = mid + 1;
                    } else if (Bokstav[mid].compareTo(Binärnamn) > 0) {
                        max = mid - 1;
                    } else {
                        return mid;
                    }
                }

                return -1;
            }
        }
