package chapter_1.check.modificators.pack_B;

import chapter_1.check.modificators.pack_A.Object;

public class ObjectChild extends Object {

    public ObjectChild(){
        super();
    }

    public static void main(String[]args){
        //Object ob=new ObjectChild(); // rise an error
        ObjectChild ob=new ObjectChild();
        int i=ob.protectedF;
        System.out.println(i);
    }
}
