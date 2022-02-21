package com.java.base.controller.twelve;

/**
 * @author F31
 * @Date 2022/02/11 15:57
 */

class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}
public interface Storm {
    void event() throws Exception;

    void rainHard() throws StormException;

}
