public class Cat extends Animal implements Pet{

    @Override
    public boolean beFriendly(){
        return true;
    }

    @Override
    public void play(){
        System.out.println("A cat is playing!");
    }
}
