public abstract class OTPGenerator {
    public abstract String generateOTP();
    public static OTPGenerator getNumericOTPGenerator(){
        return new NumericOTPGenerator();
    }

    public static OTPGenerator getAlphabeticGenerator(){
        return new AlphabeticOTPGenerator();
    }
}
