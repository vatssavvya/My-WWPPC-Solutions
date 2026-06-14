import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
    Scanner soupsoup = new Scanner(System.in);
    int cases = soupsoup.nextInt();
    for(int j = 0; j<cases; j++){
        int count = 0;
        int n = soupsoup.nextInt();
        String stringN = ""+n;
        int[] listN = new int[stringN.length()];
        for(int i = 0; i<stringN.length(); i++){
            listN[i] = Character.getNumericValue(stringN.charAt(i));
        }
        for(int i =0; i<listN.length-1;i++){
            if(listN[i]>listN[i+1]){
                count += listN[i]-listN[i+1];
                listN[i+1] = listN[i];
            }
            
        }
        System.out.println(count);
        }
   }

 }
   
