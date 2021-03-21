package com.fansolomon.Behavioral.Iterator.Name;

public class NameRepository implements Container {
    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public MyIterator getIterator() {
        return new NameIterator();
    }

    // 实现了Iterator的内部类
    private class NameIterator implements MyIterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
