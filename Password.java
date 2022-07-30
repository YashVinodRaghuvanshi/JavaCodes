import java.util.Random;

class Password{

private final String LETTERS = "abcdefghijklmnopqrstuvwxyz";

private final char[] ALPHANUMERIC = (LETTERS + LETTERS.toUpperCase() + "0123456789").toCharArray();

public String generateRandomAlphanumeric(int length)
{

StringBuilder result = new StringBuilder();

for(int i =0;i<length;i++)
{
	result.append(ALPHANUMERIC[new Random().nextInt(ALPHANUMERIC.length)]);
}
return result.toString();

}


public static void main(String args[])
{
int i=6;    
Password ran = new Password();

System.out.println(ran.generateRandomAlphanumeric(i));

}
}