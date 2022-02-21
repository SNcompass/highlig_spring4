package com.java.base.controller.twelve;

/**
 * @author F31
 * @Date 2022/02/11 16:00
 */
public class StormyInning extends Inning implements Storm{
    public StormyInning() throws RainedOut,BaseballException{}
    public StormyInning(String s) throws Foul,BaseballException{}
    @Override
    public void atBat() throws PopFoul {}

    @Override
    public void rainHard() throws RainedOut {}

    public void event(){}

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e){
            System.out.println("Pop foul");
        } catch (RainedOut rainedOut) {
            System.out.println("rained out");
        } catch (BaseballException e) {
            System.out.println("generic baseball exception");
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e){
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        }catch (RainedOut rainedOut) {
            System.out.println("rained out");
        } catch (BaseballException e) {
            System.out.println("generic baseball exception");
        }

    }
}
