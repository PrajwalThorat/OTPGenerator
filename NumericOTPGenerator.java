import java.util.Random;

public class NumericOTPGenerator extends OTPGenerator{
    public String generateOTP(){
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=1;i<=6;i++){
            int value = random.nextInt(9);
            stringBuffer.append(value);
        }
        return stringBuffer.toString();
    }
}
