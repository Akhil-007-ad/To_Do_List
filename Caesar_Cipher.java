import java.util.Scanner;
class Topic_2
{
	public static void main(String[] args)
	{
		Encoding_msg msg_encrypt=new Encoding_msg();
		Decoding_msg msg_decrypt=new Decoding_msg();
		String message;
		String encrypt="";
		int shift_msg=0;
		while(true)
		{
			int option=menu();
			Scanner sc = new Scanner(System.in);
			switch(option)
			{
				case 1:
					System.out.print("Enter your message:");message=sc.nextLine();// To read the message 
					System.out.print("Enter the Shift:");shift_msg=sc.nextInt();// to read shift
					encrypt=msg_encrypt.encoding(message,shift_msg);break;
				case 2:
					if(encrypt.isEmpty())
					{
						System.out.print("Nomsg to encrypt");
					}
					else
					{
						msg_decrypt.decoding(encrypt,shift_msg);
					}
					break;
				case 3:
                    System.out.println("Exiting program. Goodbye!");
                    return;
				default:
					System.out.println("Invalid key try again..................");
					
			}
		}
	}
	
	static int menu()
	{
		System.out.print("1.Encoding\n2.Decoding\n3.Exit The Program\nEnter the option you want to choose[1-3]:");
		Scanner sc = new Scanner(System.in);
		int choice=sc.nextInt();
		return choice;
	}
}
class Encoding_msg {
    String encoding(String message, int shift_msg) {
        StringBuilder encrypt = new StringBuilder();  // efficient way to build string

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isUpperCase(ch)) {
                // Wrap within A-Z
                char shifted = (char) (((ch - 'A' + shift_msg) % 26) + 'A');
                encrypt.append(shifted);
            } else if (Character.isLowerCase(ch)) {
                // Wrap within a-z
                char shifted = (char) (((ch - 'a' + shift_msg) % 26) + 'a');
                encrypt.append(shifted);
            } else {
                // Keep non-letters as is (like digits, spaces)
                encrypt.append(ch);
            }
        }

        System.out.println("Encrypted: " + encrypt);
        return encrypt.toString();
    }
}

class Decoding_msg {
    String decoding(String message, int shift_msg) {
        StringBuilder decrypt = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isUpperCase(ch)) {
                // Wrap backward within A-Z
                char shifted = (char) (((ch - 'A' - shift_msg + 26) % 26) + 'A');
                decrypt.append(shifted);
            } else if (Character.isLowerCase(ch)) {
                // Wrap backward within a-z
                char shifted = (char) (((ch - 'a' - shift_msg + 26) % 26) + 'a');
                decrypt.append(shifted);
            } else {
                decrypt.append(ch);
            }
        }

        System.out.println("Decrypted: " + decrypt);
        return decrypt.toString();
    }
}
