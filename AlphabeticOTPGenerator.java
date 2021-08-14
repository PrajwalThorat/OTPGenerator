import java.util.Random;

public class AlphabeticOTPGenerator extends OTPGenerator{

    public String generateOTP(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=1; i<=6;i++){
            int value = random.nextInt(26);
            stringBuffer.append(alphabet.charAt(value));
        }
        return stringBuffer.toString();
    }
    
}
