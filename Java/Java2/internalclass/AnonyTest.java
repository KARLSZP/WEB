class AnonyTest {
    public static void main(String args[]){
       OnClickListener onClickListener = new OnClickListener(){
          @Override
          public void onClick(){  
            System.out.println("anonymous class click!");
          }
       };
       onClickListener.onClick();
    }
}
