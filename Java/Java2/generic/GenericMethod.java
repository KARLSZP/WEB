class GenericMethod {  
    public static <X, Y> Y getE(X x, Y y) {   // 泛型方法
        if(x!=null)
            return y;  
        else  
            return null;  
    }
}
