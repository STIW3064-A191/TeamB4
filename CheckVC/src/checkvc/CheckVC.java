package checkvc;
import java.util.Scanner;

public class CheckVC {
 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
	System.out.println("Enter a string : ");
	String st=scanner.next();
        char vow[] = new char[50];
        char con[] = new char[50];

        for(int i = 0; i < st.length(); ++i)
        {
            char ch = st.charAt(i);
            if(ch == 'a' || ch == 'A') { 
                vow[i]=ch;
            }
            else if(ch == 'e' || ch == 'E') {
                vow[i]=ch;
            }
            else if(ch == 'i' || ch == 'I') {
                vow[i]=ch;
            }
            else if(ch == 'o' || ch == 'O') {
                vow[i]=ch;
            }
            else if(ch == 'u' || ch == 'U') {
                vow[i]=ch;
            }
            else if((ch >= 'a'&& ch <= 'z') || (ch >= 'A'&& ch <= 'Z')) {
                con[i]=ch;
            }
        }
        System.out.print("\nVowels: ");
        for(int x = 0; x < st.length(); ++x){  
            System.out.print(vow[x]);
        }
        System.out.print("\nConsonants: ");
        for(int x = 0; x < st.length(); ++x){  
            System.out.print(con[x]);
        }
        System.out.println();
    }   
}
