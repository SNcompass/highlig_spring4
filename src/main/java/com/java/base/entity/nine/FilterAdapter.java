package com.java.base.entity.nine;

/**
 * @author F31
 * @create 2021-02-24 16:13
 */
public class FilterAdapter implements Processor {

    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object input) {
        return filter.process((Waveform)input);
    }
}
