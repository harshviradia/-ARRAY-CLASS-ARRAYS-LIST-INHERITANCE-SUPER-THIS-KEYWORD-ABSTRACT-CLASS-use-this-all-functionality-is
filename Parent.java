

public abstract class Parent {

    Parent(){
        System.out.println("SUPER CLASS IS ABSTRACT CLASS\n");
    }
    Parent(int a){
        this(4,5);
        System.out.println("YOU HAVE USED FUNCTIONALITY OF INHERITANCE AND SUPER KEYWORD(HERE WE USE SUPER KEYWORD)\n");
    }
    Parent(int x,int y){
        this();
        System.out.println("YOU HAVE USED FUNCTIONALITY OF THIS KEYWORD(HERE WE USE THIS KEYWORD)\n");
    }
}
