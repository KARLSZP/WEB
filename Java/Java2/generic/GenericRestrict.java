class GenericRestrict {
    public static <T extends Comparable> T getF(T t1,T t2) {
        if(t1.compareTo(t2)>=0);  
        return t1;  
    }  
}
